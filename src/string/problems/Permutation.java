package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
   public static void permute(String str) {
      helperPermute(str, 0, str.length() - 1);
   }

   private static void helperPermute(String str, int left, int right) {
      // No more swaps, print out one permutation of str.
      if (left == right)
         System.out.println(str);
      else {
         for (int i = left; i <= right; i++) {
            str = swapChars(str, left, i);
            helperPermute(str, left + 1, right);
            str = swapChars(str, left, i);
         }
      }
   }

   private static String swapChars(String str, int i, int j) {
      char[] charArray = str.toCharArray();
      char temp = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = temp;

      return String.valueOf(charArray);
   }

   public static void main(String[] args) {
      /*
       * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
       * Write Java program to compute all Permutation of a String
       *
       */

      permute("ABC");

   }
}
