package math.problems;

public class PrimeNumber {

   public static void main(String[] args) {
      /*
       * Find list of Prime numbers from number 2 to 1 million.
       * Try the best solution as possible.Which will take less CPU life cycle.
       * Out put number of Prime numbers on the given range.
       *
       *
       * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
       *
       */

      int count = 1000000;
      boolean isPrime;

      // 2 is a prime number.
      System.out.print(2);

      for (int i = 3; i < count; ++i) {
         isPrime = true;
         for (int j = 2; j < i; ++j) {
            // Dividing i by every number besides 1 and itself to see if it the remainder is 0.
            // If remainder is 0, it is not a prime number.
            if (i % j == 0) {
               isPrime = false;
               // Once the number is determined to be not prime,
               // break out of the for-loop b/c we don't need to check anymore.
               break;
            }
         }

         if (isPrime == true)
            System.out.print(" " + i);
      }

   }

}
