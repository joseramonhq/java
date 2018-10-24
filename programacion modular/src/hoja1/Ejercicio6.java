package hoja1;

public class Ejercicio6 {

	public static void main(String[] args) {
		MisMetodos.tablas();
		
		System.out.println("Dame el numero del que vca a ser la tabla");
		MisMetodos.tablas(InputData.readInt());
		
		for (int i=1; i<=10; i++) {
			MisMetodos.tablas(i);
		}
	}

}
