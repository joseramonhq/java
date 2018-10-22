package sumafactorial;

public class SumaFactorial {

	public static void main(String[] args) {
		double sum=1;
		int den=1, numero=misMetodos.InputData.readInt();
		for(;den<=numero;den++) {
			sum+=1.0/factorial.Factorial.factorial(den);
		}
		System.out.println(sum);
		
	}

}
