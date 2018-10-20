package repasoPrimeraEv;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		int n1=0, n2=1,n3=0;
		System.out.println(n1);
		do {
			if(MisMetodos.primo(n2)) 
				System.out.println(n2+" ");
			n3=n2+n1;
			n1=n2;
			n2=n3;
			}while(n2<10000);
		
	}

}
