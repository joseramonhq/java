package hoja1;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Dame el valor de n");
		int n=InputData.readInt();
		System.out.println("Dame el valor de x");
		int x=InputData.readInt();
		double sum=1;
		System.out.print("1");
		for(int i=1; i<n;i++) {
			sum+=(double)x/i;
			System.out.print("+"+x+"/"+i);
		}
		System.out.print("="+sum);
	}

}
