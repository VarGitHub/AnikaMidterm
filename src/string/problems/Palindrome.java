package string.problems;

public class Palindrome {
   public static boolean isPalindrome(String s) {
      // Making the string all lowercase.
      String str = s.toLowerCase();
      int length = str.length();
      int forward = 0, backward = length - 1;

      while (backward > forward) {
         char forwardChar = str.charAt(forward++);
         char backwardChar = str.charAt(backward--);
         // Check the opposite chars of the string to see if they're equal.
         // If not, str is not a Palindrome.
         if (forwardChar != backwardChar)
            return false;
      }
      return true;
   }

   public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

      System.out.println("MOM: " + isPalindrome("MOM"));
      System.out.println("DAD: " + isPalindrome("DAD"));
      System.out.println("MADAM: " + isPalindrome("MADAM"));
      System.out.println("kAyaK: " + isPalindrome("kAyaK"));
   }
}
