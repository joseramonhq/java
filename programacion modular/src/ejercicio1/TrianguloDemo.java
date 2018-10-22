package ejercicio1;

public class TrianguloDemo {

	public static void main(String[] args) {
		
		
		int base=InputData2.readInt();
		int altura=InputData2.readInt();
		System.out.println(Triangulo.areaTriangulo(base, altura));
		boolean	b=InputData2.readBoolean();		
		String str=InputData2.readString();
		String x=InputData2.readString();
		Mostrar.mostrar(base);
	
		
		System.out.println("  "+str+"   "+base+"    "+altura+"    "+b+"   "+x+"     "+str);
		
	}

}
