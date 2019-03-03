package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int fact(int n) {
        if ( n < 2 )
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println(fact(5));

    }
}
