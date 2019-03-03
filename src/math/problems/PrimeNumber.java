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

		System.out.print(2);
		for (int i = 3; i < count; ++i) {
			isPrime = true;
			for (int j = 2; j < i; ++j) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime ==  true)
				System.out.print(" " + i);
		}

	}

}
