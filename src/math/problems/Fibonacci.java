package math.problems;

public class Fibonacci {


    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int next = 0, prev = 1;
        for(int i = 0; i < 40; ++i) {
            System.out.print(i + 1 + "-" + next + " ");
            next = next + prev;
            prev  =  next - prev;
        }

    }
}
