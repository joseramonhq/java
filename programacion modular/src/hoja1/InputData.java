package hoja1;

import java.util.Scanner;

public class InputData {
	
	public static int readInt() {
		Scanner teclado= new Scanner(System.in);
		return teclado.nextInt();
	}
	public static double readDouble() {
		Scanner teclado= new Scanner(System.in);
		return teclado.nextDouble();
	}
	public static boolean readBoolean() {
		Scanner teclado= new Scanner(System.in);
		boolean b;
		b=readInt()==1? true: false;
		return b;
	}
	public static long readLong() {
		Scanner teclado= new Scanner(System.in);
		return teclado.nextLong();
	}
	public static float readFloat() {
		
		return new Scanner(System.in).nextFloat();
	}
	public static String readString() {
		Scanner teclado= new Scanner(System.in);
		return teclado.nextLine();
	}
	public static char readChar() {
		Scanner teclado= new Scanner(System.in);
		return teclado.next().charAt(0);
	}
}
