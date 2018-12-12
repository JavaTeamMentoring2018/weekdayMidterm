package math;

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
		System.out.println(prime(2, 1000000));
	}


	private static String prime(int beg, int end) {
		String res = " ";
		boolean flag = true;
		for (int i = beg; i <= end; i++) {
			for (int j = 2; j <= end; j++) {
				if (i % j == 0 && i != j) {
					flag = true;
					res = i + " ";
				} else if (!flag) {
					res += i + " ";
				}
				flag = false;
			}


		}
		return res;
	}}




