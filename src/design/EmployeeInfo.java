package design;

import java.util.Scanner;

public abstract class EmployeeInfo implements Employee {

   /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
    * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
    * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
    * go to FortuneEmployee class to apply all the fields and attributes.
    *
    * Important: YOU MUST USE the
    * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
    * Use all kind of keywords(super,this,static,final........)
    * Implement Nested class.
    * Use Exception Handling.
    *
    */

   /*
    * declare few static and final fields and some non-static fields
    */
   private static Months mo;
   final String companyName = "AB&C Co.";
   protected int employeeId;
   protected String employeeName;
   protected static int baseSalary;
   protected String departmentName = "General";
   static Performance performance = Performance.NOTDETERMINED;

   /*
    * You must implement the logic for below 2 methods and
    * following 2 methods are prototype as well for other methods need to be design,
    * as you will come up with the new ideas.
    */

   /*
    * you must have multiple constructor.
    * Must implement below constructor.
    */
   public EmployeeInfo(int employeeId) {
      this.employeeId = employeeId;
   }

   public EmployeeInfo(String name, int employeeId) {
      this.employeeName = name;
      this.employeeId = employeeId;
   }

   public EmployeeInfo(String name, int employeeId, int baseSalary) {
      this.employeeName = name;
      this.employeeId = employeeId;
      this.baseSalary = baseSalary;
   }

   public void setBaseSalary(int newSal) {
      this.baseSalary = newSal;
   }

   public int employeeId() {
      return employeeId;
   }

   public String employeeName() {
      return employeeName;
   }

   public String getDepartmentName() {
      return departmentName;
   }

   public abstract int getDepartmentFloor();

   public abstract void setPerformance(String perform);

   public int calculateTotalSalary(int numberOfYearsWithCompany) {
      return baseSalary + calculateEmployeeBonus(numberOfYearsWithCompany);
   }

   /*
    * This methods should calculate Employee bonus based on salary and performance.
    * Then it will return the total yearly bonus. So you need to implement the logic.
    * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
    * You can set arbitrary number for performance.
    * So you probably need to send 2 arguments.
    *
    */
   private static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
      return (int) (baseSalary * performance.getBonusPercentage());
   }

   /*
    * This methods should calculate Employee Pension based on salary and numbers of years with the company.
    * Then it will return the total pension. So you need to implement the logic.
    * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
    *
    */
   public static int calculateEmployeePension() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter start date in format (example: May,2015): ");
      String joiningDate = sc.nextLine();
      System.out.println("Please enter today's date in format (example: August,2017): ");
      String todaysDate = sc.nextLine();
      String convertedJoiningDate = DateConversion.convertDate(joiningDate);
      String convertedTodaysDate = DateConversion.convertDate(todaysDate);

      //implement numbers of year from above two dates
      //Calculate pension

      int startYear = 0, currYear = 0;

      try {
         // Index 1 of both arrays have the year. Turn into int.
         startYear = Integer.parseInt(convertedJoiningDate.split("/")[1]);
         currYear = Integer.parseInt(convertedTodaysDate.split("/")[1]);
      } catch (ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
      }

      int numOfYearsWorkingAtCompany = currYear - startYear;

      return (int) (baseSalary * (numOfYearsWorkingAtCompany * 5.0 / 100.0));
   }

   ///////// Static nested class.
   private static class DateConversion {
      public DateConversion(Months months) {
         mo = months;
      }

      public static String convertDate(String date) {
         String[] extractMonth = date.split(",");
         String givenMonth = extractMonth[0];
         int monthDate = whichMonth(givenMonth);

         return monthDate + "/" + extractMonth[1];
      }

      public static int whichMonth(String givenMonth) {
         Months months = Months.valueOf(givenMonth);
         int date = 0;
         switch (months) {
            case January:
               date = 1;
               break;
            case February:
               date = 2;
               break;
            case March:
               date = 3;
               break;
            case April:
               date = 4;
               break;
            case May:
               date = 5;
               break;
            case June:
               date = 6;
               break;
            case July:
               date = 7;
               break;
            case August:
               date = 8;
               break;
            case September:
               date = 9;
               break;
            case October:
               date = 10;
               break;
            case November:
               date = 11;
               break;
            case December:
               date = 12;
               break;
            default:
               date = 0;
               break;
         }
         return date;

      }
   }
}
