package ejercicio1;

import java.util.Scanner;

public class InputData {
	public static int readInteger() {
		int n;
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		return n;
	}

	public static double readDouble() {
		double n;
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextDouble();
		return n;
	}

	public static String readString() {
		String s;
		Scanner teclado = new Scanner(System.in);
		s = teclado.next();
		return s;
	}

	/////////////// EJERCICIO 1a //////////////////////////////////////
	public static Cuenta leerCuenta() {
		return new Cuenta(InputData.readInteger(), 0,
				new Fecha(InputData.readInteger(), InputData.readInteger(), InputData.readInteger()), 0, 0);
	}
	///////////////////////////////////////////////////////////////////
	
}