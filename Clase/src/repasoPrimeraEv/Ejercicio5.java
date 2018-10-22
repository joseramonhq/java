package repasoPrimeraEv;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="";
		switch(new Scanner(System.in).nextInt()) {
		case 0:
			num="Cero";
			break;
		case 1:
			num="Uno";
		break;
		case 2:
			num="Dos";
		break;
		case 3:
			num="Tres";
			break;
		case 4:
			num="Cuatro";
			break;
		case 5:
			num="Cinco";
			break;
		case 6:
			num="Seis";
			break;
		case 7:
			num="Siete";
			break;
		case 8:
			num="Ocho";
			break;
		case 9:
			num="Nueve";
			break;
		case 10:
			num="Diez";
			break;
		default:
			num="No es un numero en el rango";
				
		}
		System.out.println(num);
	}

}
