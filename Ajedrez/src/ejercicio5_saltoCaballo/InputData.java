package ejercicio5_saltoCaballo;

import java.util.Scanner;

public class InputData {
	
	public static int leerEntero() {
		Scanner teclado =new Scanner(System.in);
		System.out.println("Dame posicion del tablero");
		int x= teclado.nextInt();
		teclado.close();
		return x;
	}
	
	public class OutputData{
		
		public void mostrar(Object o){
			System.out.println(o.toString());
		}
	}
}
