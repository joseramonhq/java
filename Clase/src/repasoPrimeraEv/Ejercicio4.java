package repasoPrimeraEv;

public class Ejercicio4 {

	public static void main(String[] args) {

		int hh = 0, mm = 0, ss = 0;

		for (hh = 0; hh < 24; hh++) {
			for (mm = 0; mm < 60; mm++) {
				for (ss = 0; ss < 60; ss++) {
					System.out.println(hh + ":" + mm + ":" + ss);
					for(long i=0;i<1990000000;i++);
					System.out.println();
				}
			}

		}
	}
}
