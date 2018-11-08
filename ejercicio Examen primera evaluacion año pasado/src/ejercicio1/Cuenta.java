package ejercicio1;

public class Cuenta {
	private int numeroCuenta;
	private double saldo;
	private Fecha fechaAlta;
	private int numeroDeIngresos;
	private int numeroDeRetiradas;

	public Cuenta() {

	}

	public Cuenta(int numeroCuenta, double saldo, Fecha fechaAlta, int numeroDeIngresos, int numeroDeRetiradas) {
		this.numeroCuenta = numeroCuenta;
		if (saldo>0)
			numeroDeIngresos=numeroDeIngresos+1;
		this.saldo = saldo;
		this.fechaAlta = fechaAlta;
		this.numeroDeIngresos = numeroDeIngresos;
		this.numeroDeRetiradas = numeroDeRetiradas;
	}

	/////////// EJERCICIO 1b ////////////////////////////
	public void Ingreso(double cantidad) {
		this.saldo = this.saldo + cantidad;
		numeroDeIngresos++;
	}

	public boolean retirar(double retiro) {
		if (retiro > this.saldo) {
			this.saldo = 0;
			this.numeroDeRetiradas++;
			return false;
		} else {
			this.saldo = this.saldo - retiro;
			numeroDeRetiradas++;
			return true;
		}
	}
	//////////////////////////////////////////////////////

	//////////////////// EJERCICIO 1c ///////////////////

	public boolean equals(Object o) {
		Cuenta c = (Cuenta) o;
		return fechaAlta.equals(c.fechaAlta) && this.saldo == c.saldo
				&& (this.numeroDeIngresos - this.numeroDeRetiradas) == (c.numeroDeIngresos - c.numeroDeRetiradas);
	}

	/////////////////////////////////////////////////////

	//////////////////// EJERCICIO 1d ///////////////////

	public int compareTo(Object o) {
		Cuenta c = (Cuenta) o;
		if (this.fechaAlta.compareTo(c.fechaAlta) == 1)
			return 1;
		if (this.fechaAlta.compareTo(c.fechaAlta) == -1)
			return -1;
		if (this.saldo > c.saldo)
			return 1;
		if (this.saldo < c.saldo)
			return -1;
		if ((this.numeroDeIngresos - this.numeroDeRetiradas) > (c.numeroDeIngresos - c.numeroDeRetiradas))
			return 1;
		if ((this.numeroDeIngresos - this.numeroDeRetiradas) < (c.numeroDeIngresos - c.numeroDeRetiradas))
			return -1;
		else
			return 0;

	}
	///////////////////////////////////////////////////////

	//////////////////// EJERCICIO 1e ///////////////////

	public String toString() {
		
		String c = "Numero de cuenta: " + this.numeroCuenta + "  saldo: " + this.saldo + " Fecha de alta: "
				+ this.fechaAlta;
		if (this.numeroDeIngresos > this.numeroDeRetiradas)
			return c + "  Numero de retiradas: " + this.numeroDeRetiradas;
		if (this.numeroDeIngresos < this.numeroDeIngresos)
			return c + "  Numero de retiradas: " + this.numeroDeRetiradas;
		else
			return c + " Igual número de ingresos (" + this.numeroDeIngresos + ") igual que de retiradas ("
					+ this.numeroDeRetiradas + ")";

	}
	
	//////////////////////////////////////////////////////
	
	
	
}
