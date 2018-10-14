package hoja2;

public class Ejercicio4Hoja2 {

	public static void main(String[] args) {
		int a = 2, b = 1, sum1 = 0, sum2 = 0;
		while (a<10000&&(a != sum2 || b != sum1)) {
			sum1 = sumDividers(a);
			while ((b != sum1 || a != sum2) && b < a) {
				sum2 = sumDividers(b);
				if (a != sum2 || b != sum1)
					b++;
			}
			if (b == a && (a != sum2 || b != sum1)) {
				a++;
				b = 1;
			}
			if (a == sum2 && b == sum1) {
				System.out.println(a + " y " + b + " son números amigos");
				a++;
			}
		}
	}

	public static int sumDividers(int n) {
		int d, sum = 0;
		for (d = 1; d <= n / 2; d++)
			if (n % d == 0)
				sum += d;
		return sum;
	}
}
