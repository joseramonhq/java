package hoja1;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Voy a visualizar todos los divisores de un numero a\nDame un numero a");
		int a= InputData.readInt();
		for (int i=1; i<=a/2;i++) {
			if(MisMetodos.bEsDivisorDeA(a, i))
				System.out.println(i);
		}
	}

}
