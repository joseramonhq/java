package repasoPrimeraEv;

import java.util.Scanner;

public class InputData {
	
	public static int readInt() {
		System.out.println("Dame un numero entero");
		return new Scanner(System.in).nextInt();
	}
	public static double readDouble() {
		System.out.println("Dame un numero real");
		return new Scanner(System.in).nextDouble();
	}
	public static long readLong() {
		System.out.println("Dame un numero long");
		return new Scanner(System.in).nextLong();
	}
	public static boolean readBoolean() {
		System.out.println("Dame un booleano: 1 si es true y un o si es false");
		return new Scanner(System.in).nextInt()==1?true:false;
	}
	public static String readString() {
		return new Scanner(System.in).next();
	}
	public static char readChar() {
		return new Scanner(System.in).next().charAt(0);
	}
	
}
