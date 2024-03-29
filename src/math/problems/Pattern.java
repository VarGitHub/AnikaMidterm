package math.problems;

public class Pattern {

   public static void main(String[] args) {
      /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
       * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
       *
       *
       */

      int currNum = 100, difference = 1;
      while (currNum >= 0) {
         int counter = 0;
         // Pattern changes after every 10 iterations.
         while (counter < 10 && currNum >= 0) {
            System.out.print(currNum + ", ");
            currNum -= difference;
            counter++;
         }
         // After 10 numbers, increase the difference.
         difference++;
      }


   }
}
