package hoja1;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Dame un radio");
		System.out.println(MisMetodos.areaCirculo());
		
		////////////////////////////////////////////////// Corona Circular ////////////////////////////
		int may,men;
		System.out.println("Dame el radio mayor");
		may=InputData.readInt();
		System.out.println("Dame el radio menor");
		men=InputData.readInt();
		System.out.println(MisMetodos.areaCirculo(may)-MisMetodos.areaCirculo(men));
		

	}

}
