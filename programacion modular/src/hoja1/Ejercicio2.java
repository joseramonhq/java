package hoja1;



public class Ejercicio2 {

	public static void main(String[] args) {
		
		int m =InputData.readInt();
		int n = InputData.readInt();
		System.out.println(MisMetodos.factorial(m)/(MisMetodos.factorial(n)-MisMetodos.factorial(m-n)));
	}

}
