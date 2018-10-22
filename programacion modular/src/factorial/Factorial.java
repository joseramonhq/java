package factorial;
public class Factorial{
	public static void main(String[] args) {
		System.out.println(factorial(31));
		System.out.println(combinatoria());
	}

	public static int factorial(int n) {
		return n==0? 1:n*factorial(n-1);
	}
	public static int combinatoria() {
		int m =ejercicio2.InputData2.readInt();
		int n =ejercicio2.InputData2.readInt();
		return factorial(m)/(factorial(n)*factorial(m-n));
	}

}
