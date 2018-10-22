package ejercicio1;

import java.util.Scanner;

public class InputData2 {
	private static Scanner teclado= new Scanner(System.in);
	public static int readInt() {
		return teclado.nextInt();
	}
	public static double readDouble() {
		return teclado.nextDouble();
	}
	public static boolean readBoolean() {
		boolean b;
		b=readInt()==1? true: false;
		
		return b;
	}
	public static long readLong() {
		return teclado.nextLong();
	}
	public static float readFloat() {
		return teclado.nextFloat();
	}
	public static String readString() {
		String g= teclado.nextLine();
		return g;
	}
	public static char readChar() {
		return teclado.next().charAt(0);
	}
}
