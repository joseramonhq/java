package repasoPrimeraEv;

public class Ejercicio23 {

	public static void main(String[] args) {

		System.out.println(MisMetodos.numPerfect(InputData.readInt()) ? "Es perfecto" : "No es perfecto"); // +++++++++
																											// Ejercicio
																											// 23

		boolean answer = false; // *********************************************************************************
								// Ejercicio 23 A
		int i = 0;
		do {
			i++;
			answer = MisMetodos.numPerfect(i);
		} while (!answer);
		System.out.println(i);

		// **********************************************************************************Ejercicio
		// 23 B

		i = 0;
		do {
			i++;
			if (MisMetodos.numPerfect(i))
				System.out.println(i);
		} while (i < Integer.MAX_VALUE);

	}
}
