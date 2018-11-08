package ejercicio1;

public class DemoPrueba {

	public static void main(String[] args) {
		//////////////////// EJERCICIO 1f ///////////////////
		
		Cuenta a=new Cuenta(1234567890,1000,new Fecha(10,5,2018),0,0);
		Cuenta b=new Cuenta(1234567891,9000,new Fecha(10,5,2018),0,0);
		a.retirar(500);
		b.retirar(5000);
		System.out.println(a+"\n"+b);

	}

}
