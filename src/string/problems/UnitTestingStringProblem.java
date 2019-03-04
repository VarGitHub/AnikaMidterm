package string.problems;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {
   public static void main(String[] args) {
      //Apply Unit Test into all the methods in this package.

      // Checking for Anagram.
      Assert.assertEquals(Anagram.isAnagram("CAT", "ACT"), true);

      // Checking for DetermineLargestWord
      String str = "When life give you lemons make lemonade";
      Map<Integer, String> map = new HashMap<Integer, String>();
      String[] tempStr = str.split(" ");
      for (String s : tempStr)
         map.put(s.length(), s);
      Assert.assertEquals(DetermineLargestWord.findTheLargestWord(str), map);

      // Checking Palindrome
      Assert.assertEquals(Palindrome.isPalindrome("KaYAK"), true);


   }
}
