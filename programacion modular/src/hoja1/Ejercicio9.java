package hoja1;

public class Ejercicio9 {

	public static void main(String[] args) {

		long a = 0, b = 1, aux = 0;
		boolean cli;
		for (int i = 0; i < 20; i++) {
			cli = true;
			while(cli) {
				aux = a + b;
				a = b;
				b = aux;
				if (MisMetodos.primo((int) aux)) {
					System.out.println(aux);
					cli = false;
				}

			}

		}
	}

}
