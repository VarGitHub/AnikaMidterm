package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char [] strOne = str1.toCharArray();
        char [] strTwo = str2.toCharArray();

        Arrays.sort(strOne);
        Arrays.sort(strTwo);

        for (int i = 0; i < strOne.length; i++)
            if (strOne[i] != strTwo[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println(areAnagram("CAT", "ACT"));
        System.out.println(areAnagram("ARMY", "MARY"));
        System.out.println(areAnagram("BANANA", "BANANE"));
    }
}
