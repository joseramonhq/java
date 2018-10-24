package hoja1;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println("Dame dos números");
		int a=InputData.readInt(), b=InputData.readInt();
		for (int i=1; i<=Math.min(a, b);i++)
			if (MisMetodos.divisorComun(a, b, i))
				System.out.println(i);
	}

}
