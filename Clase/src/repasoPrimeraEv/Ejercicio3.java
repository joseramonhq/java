package repasoPrimeraEv;

public class Ejercicio3 {

	public static void main(String[] args) {
		int sumSus = 0, sumApr = 0, sumNot = 0, sumSob = 0, n, nota;
		System.out.println("¿De cuantos alumnos vamos a introducir la nota?");
		n = InputData.readInt();
		for (; n > 0; n--) {
			System.out.println("¿Nota?");
			nota = InputData.readInt();
			if (nota < 5 && nota >= 0)
				sumSus++;
			else if (nota < 7)
				sumApr++;
			else if (nota < 9)
				sumNot++;
			else if (nota <= 10)
				sumSob++;
			else {
				System.out.println("Introduce una nora correcta");
				n++;
			}
			System.out.println("Sobresalientes: " + sumSob + "Notables: " + sumNot + "    Aprobados: " + sumApr
					+ "    Suspensos: " + sumSus);
		}
	}

}
