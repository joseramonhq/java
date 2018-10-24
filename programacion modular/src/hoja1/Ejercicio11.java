package hoja1;

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("Dame un número para buscar todos los números perfectos entre 1 y este número.");
		int n=InputData.readInt();
		for(int i=1; i<=n;i++) {
			if(MisMetodos.numPerfect(i))
				System.out.println(i);
		}
	}

}
