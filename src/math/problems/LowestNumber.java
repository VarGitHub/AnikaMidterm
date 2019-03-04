package math.problems;

import databases.ConnectToSqlDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

   public static void main(String[] args) throws SQLException {
      /*
       * Write java solution to find the lowest number from this array.
       * Use one of the databases from mysql or mongodb to store and to retrieve.
       */
      int[] array = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

      //find lowest number from the array
      ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
      List<String> lowestValue = new ArrayList<String>();

      try {
         connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");

         // adding to lowestValue a sorted column_lowestNumber.
         lowestValue = connectToSqlDB.directDatabaseQueryExecute("select * from tbl_lowestNumber order by column_lowestNumber", "column_lowestNumber");

      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");

      System.out.print("Lowest value is: ");
      // Going to print out the first element in the list because it is the lowest value.
      for (String st : lowestValue) {
         System.out.println(st);
         break;
      }
   }

}
