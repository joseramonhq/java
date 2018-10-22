package misMetodos;

public class MisMetodos {
	
	public static int factorial(int n) {
		return n==0? 1:n*factorial(n-1);
	}
	public static int combinatoria() {
		int m =InputData.readInt();
		int n =InputData.readInt();
		return factorial(m)/(factorial(n)*factorial(m-n));
		
		
	}

}
