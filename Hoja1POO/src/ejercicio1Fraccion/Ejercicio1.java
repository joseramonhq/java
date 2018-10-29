package ejercicio1Fraccion;

public class Ejercicio1 {

	public static void main(String[] args) {
		Fraccion a = new Fraccion();
		Fraccion b = new Fraccion(18, 9);
		a.setNum(10);
		a.setDen(5);
		a.visualizar();
		b.visualizar();
		Fraccion x = new Fraccion();
		x = a.sumarDosFracciones(b);
		x.visualizar();
		x.simplificarFraccion();
		x.visualizar();
		System.out.println(x.sonIguales(a));
		x = a.sumarDosFracciones(b);
		System.out.println(x);/*
								 * Para que muestre la cadena con los datos hay que redefinir toString de Object
								 * en la clase del objeto que se quiere mostrar
								 */
		x = Fraccion.sumarDosFracciones(b,b);
		/*
		 * Si vamos a usar un metodo estático hay que poner la clase, mientras que si
		 * usamos el método dinámico no hace falta, ya que el objeto lo incorpora
		 */
		System.out.println(x);
		System.out.println((a.sumarDosFracciones(a).simplificarFraccion()).equals(x.simplificarFraccion()));
		System.out.println(x);

	}

}
