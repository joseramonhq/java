package hoja1;

public class Ejercicio1 {

	public static void main(String[] args) {
		/////////////////EJERCICIO 1/////////////////
		System.out.println(MisMetodos.primo(InputData.readInt()));
		
		System.out.println(MisMetodos.primo(InputData.readInt())?"Es primo":"No es primo");

		
		for (int num=InputData.readInt(), i=0;i<=num;i++) {
			if(MisMetodos.primo(i))
				System.out.println(i);
		}
		
	}

}
