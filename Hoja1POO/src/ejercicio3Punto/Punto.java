package ejercicio3Punto;

public class Punto extends LeerMostrar {
	private int x;
	private int y;

	public Punto() {

	}

	public Punto(int a, int b) {
		this.x = a;
		this.y = b;
	}

	public Punto(Punto a) {
		this.x = a.x;
		this.y = a.y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int b) {
		this.x = b;
	}

	public String toString() {
		return "punto x: " + x + "    punto y: " + y;
	}

	public boolean equals(Object o) {
		Punto b = (Punto) o;
		return this.x == b.x && this.y == b.y;
	}

	public double distanciaAlOrigen() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public static double distanciaAlOrigen(Punto a) {
		return Math.sqrt(a.x * a.x + a.y * a.y);
	}

	public static double distanciaAlOrigen(int x, int y) {
		return Math.sqrt(x * x + y * y);
	}

	public double distanciaAOtroPunto(Punto b) {
		return Math.sqrt(Math.pow(b.x - this.x, 2) + Math.pow(b.y - this.y, 2));
	}

	public double distanciaAOtroPunto(int x, int y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	public static double distanciaAOtroPunto(Punto a, Punto b) {
		return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
	}

}
