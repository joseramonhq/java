package ejercicio2;

public class TrianguloDemo {

	public static void main(String[] args) {
		
		System.out.println((int)'\'');
		int base=InputData2.readInt();
		int altura=InputData2.readInt();
		System.out.println(Triangulo.areaTriangulo(base, altura));
		boolean	b=InputData2.readBoolean();
		
		
		String str=InputData2.readString();
		System.out.println(b);
		System.out.println(str+"   "+base+"    "+altura+"    "+b);
		
		
	}

}
