package repasoPrimeraEv;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int sumP=0, sumI=0;
			int a=InputData.readInt();
		while(a>0) {
			if(a%2==0)
				sumP++;
			else
				sumI++;
			a=InputData.readInt();
		}
		double b=(100.0*sumP)/(sumP+sumI);
		System.out.println("Pares: "+sumP+"    Son el "+b+ "% del total");
		System.out.println("Impares: "+sumI+"    Son el "+(100-b)+"% del total");

	}

}
