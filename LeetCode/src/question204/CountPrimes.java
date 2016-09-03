package question204;

public class CountPrimes {

	public static int countPrimes(int n) {

		if (n < 2) {
			return 0;
		}

		boolean[] notPrime = new boolean[n];
		notPrime[0] = true;
		notPrime[1] = true;
		notPrime[2] = false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (notPrime[i] == false) {
				for (int j = i * i; j < n; j += i) {
					notPrime[j] = true;
				}
			}
		}
		int count = 0;
		for (int i = 2; i < notPrime.length; i++) {
			if (notPrime[i] == false) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("");
		return count;
	}

	public static void main(String[] args) {
		int count = countPrimes(1000);
		System.out.println("count:"+count);
	}

}
