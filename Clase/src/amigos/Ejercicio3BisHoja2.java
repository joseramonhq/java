package amigos;

public class Ejercicio3BisHoja2 {

	public static void main(String[] args) {
		int a = 2, b = 1, sum1 = 0, sum2 = 0;
		for (; a != sum2 || b != sum1; a++) {
			sum1 = sumDividers(a);
			for (; (a != sum2 || b != sum1) && b < a;b++) {
				sum2 = sumDividers(b);
			}
			if (a != sum2 || b != sum1)
				b=1;

		}
		System.out.println(a + " y " + b + " son números amigos");


	}

	public static int sumDividers(int n) {
		int d, sum = 0;
		for (d = 1; d <= n / 2; d++)
			if (n % d == 0)
				sum += d;
		return sum;
	}

}
