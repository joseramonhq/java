package _MCD;

public class MCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mcd(50, 70, 30, 100));

	}

	public static int mcd(int... a) {

		int prod = 1;
		int counter;
		int max = min(a);
		for (int div = 1; div <= max; div++) {
			counter = 0;
			if (!primo(div))
				continue;
			for (int x = 0; x < a.length; x++) {
				if (a[x] % div == 0) {
					counter++;
				}

			}
			if (counter == a.length) {
				prod *= div;
				for (int i = 0; i < a.length; i++) {
					a[i] = a[i] / div;
				}
				div = 1;
				max = min(a);
			}

		}
		return prod;

	}

	public static int min(int... a) {
		int maxim = a[0];
		for (int i = 1; i < a.length; i++) {
			maxim = Math.min(maxim, a[i]);

		}
		return maxim;
	}

	public static boolean primo(int n) {
		boolean answer = true;
		for (int div = 2; answer && div < n; div++) {
			if (n % div == 0)
				answer = false;
		}
		return answer;
	}

}
