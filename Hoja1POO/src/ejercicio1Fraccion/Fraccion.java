package ejercicio1Fraccion;

public class Fraccion {
	private int num;
	private int den;

	public Fraccion() {

	}

	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public void setNum(int n) {
		this.num = n;
	}

	public int getNum() {
		return this.num;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public int getDen() {
		return this.den;
	}

	public void visualizar() {
		System.out.println(num + "/" + den);
	}

	public static Fraccion sumarDosFracciones(Fraccion a, Fraccion b) {
		Fraccion x = new Fraccion();
		x.den = a.den * b.den;
		x.num = x.den / a.den * a.num + x.den / b.den * b.num;
		return x;
	}

	public Fraccion sumarDosFracciones(Fraccion a) {
		Fraccion x = new Fraccion();
		x.den = a.den * this.den;
		x.num = x.den / a.den * a.num + x.den / this.den * this.num;
		return x;
	}

	public static Fraccion simplificarFraccion(Fraccion a) {

		for (int div = 1; div <= Math.min(a.num, a.den); div++) {
			if (a.num % div == 0 && a.den % div == 0) {
				a.num /= div;
				a.den /= div;
				div = 1;
			}
		}
		return a;

	}

	public Fraccion simplificarFraccion() {

		for (int div = 2; div <= Math.min(this.num, this.den); div++) {
			if (this.num % div == 0 && den % div == 0) {
				num = num / div;
				den = den / div;
				div = 1;
			}
		}
		return this;

	}

	public static boolean sonIguales(Fraccion a, Fraccion b) {
		return a.simplificarFraccion() == b.simplificarFraccion();
	}

	public boolean sonIguales(Fraccion a) {
		return this.simplificarFraccion() == a.simplificarFraccion();
	}

	@Override
	public String toString() {
		return this.num + "/" + this.den;
	}

	@Override
	public boolean equals(Object a) {
		Fraccion x = (Fraccion) a;
		return (this.num == x.num && this.den == x.den);

	}

}
