package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static boolean areAnagram(char [] str1, char [] str2) {
        int strOneLength = str1.length;
        int strTwoLength = str2.length;

        if (strOneLength != strTwoLength)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < strOneLength; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }
}
