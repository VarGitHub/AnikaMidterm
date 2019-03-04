package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
   public static boolean isAnagram(String str1, String str2) {
      // If string length is not the same, it is not an anagram.
      if (str1.length() != str2.length())
         return false;

      // Turning string into a an array of chars.
      char[] strOne = str1.toCharArray();
      char[] strTwo = str2.toCharArray();

      // Sorting the two char arrays.
      Arrays.sort(strOne);
      Arrays.sort(strTwo);

      for (int i = 0; i < strOne.length; i++)
         // If the chars are not the same, it is not an anagram.
         if (strOne[i] != strTwo[i])
            return false;

      return true;
   }

   public static void main(String[] args) {
      //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
      //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

      System.out.println(isAnagram("CAT", "ACT"));
      System.out.println(isAnagram("ARMY", "MARY"));
      System.out.println(isAnagram("BANANA", "BANANE"));
   }
}
