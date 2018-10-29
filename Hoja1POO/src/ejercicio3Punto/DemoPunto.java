package ejercicio3Punto;

public class DemoPunto {

	public static void main(String[] args) {

		Punto a = new Punto();
		Punto b = new Punto(6, 4);
		Punto c = new Punto(b);
		Punto d = new Punto(new Punto(5, 9));
		System.out.println(b);
		System.out.println(b.equals(c) + " <----equals");
		System.out.println(b.equals(d) + " <----equals");
		System.out.println(b.distanciaAlOrigen() + " <----distancia al origen");
		System.out.println(a.distanciaAlOrigen() + " <----distancia al origen");
		System.out.println(Punto.distanciaAlOrigen(b) + " <----distancia al origen estático");
		System.out.println(Punto.distanciaAlOrigen(a) + " <----distancia al origen estático");
		System.out.println(Punto.distanciaAlOrigen(6, 4) + " <----distancia al origen estático");
		System.out.println(b.distanciaAOtroPunto(d) + " <----distancia a otro punto");
		System.out.println(b.distanciaAOtroPunto(5, 9) + " <----distancia a otro punto");
		System.out.println(Punto.distanciaAOtroPunto(b, d) + " <----distancia a otro punto estático");
		LeerMostrar.mostrarObjeto(b);
		b.mostrarObjeto();
	}

}
