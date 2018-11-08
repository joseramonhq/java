package ejercicio3;

public class MisMetodos {

	public static long factorial(long numero) {

		long fact = 1;
		for (int i = 1; i <= numero; fact = fact * i, i++)
			;
		return fact;
	}

	public static long catalan(long n) {
		return factorial(2 * n) / (factorial(n + 1) * factorial(n));
	}

	public static long suma(int n) {
		long suma = 0, numero=1;
		int i=0;
		boolean res=false;
		while(i<n){
			res=false;
			while(!res) {
				if(primo(numero))
					numero++;
					res=true;
			}
			suma = suma + catalan(numero);
			i++;
		}
		return suma;

	}

	public static boolean primo(long n) {
		int counter=0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && (counter==1 || counter==0))
				return false;
		}
		return true;
	}
	
	
}
