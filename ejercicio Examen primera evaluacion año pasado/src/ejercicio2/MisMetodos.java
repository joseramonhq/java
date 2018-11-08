package ejercicio2;

public class MisMetodos {

	public static int cuantasVeces(int numero, int cifra) {

		return (numero + "").length() - (numero + "").replaceAll((cifra + ""), "").length();
	}

	public static int elMasRepetido(int numero) {
		
		int counter=0, number=0, memo1=0,memo2=0,i=0, number2=0;
		
		while(i<10) {
			
			if (!(numero+"").contains(i+"")){
				i++;
				continue;
			}
			counter=cuantasVeces(numero, i);
			if(counter>memo1) {
				memo1=counter;
				number=i;
				memo2=0;
			}else if(counter==memo1){
				memo2=counter;
				number2=i;
				
			}
			i++;
		}
		if (memo1==memo2 && memo1>1) {
			return number;
		}else if(memo1==memo2 && memo1==1) {
			return -1;
		}
		return Math.max(number, number2);
		
	}

	
}
