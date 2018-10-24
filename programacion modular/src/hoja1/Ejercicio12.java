package hoja1;

public class Ejercicio12 {

	public static void main(String[] args) {

		System.out.println("Dame el número hasta el que he de llegar con la sucesion...");
		double n = InputData.readDouble(), sum = 0, i = 0;
		do {
			i++;
			sum += 1 / i;
		} while (sum < n);
		System.out.println((int) i);
	}

}
