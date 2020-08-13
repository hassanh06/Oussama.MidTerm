package mathproblems;


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
		findPrimeNumber();
	}

	public static void findPrimeNumber() {


		int i;
		int j;

		for (i = 1; i <= 1000000; i++) { //i=1

			int l=0;

			for(j =i; j>=1; j--) { //i=2/j=2

				if(i%j==0) { //i=2/j=1

					l = l + 1; //l=1
				}
			}
			if (l ==2)
				System.out.println(i);

		}

	}
}