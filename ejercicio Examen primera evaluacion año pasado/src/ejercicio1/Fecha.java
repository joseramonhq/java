package ejercicio1;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean equals(Object o) {
		Fecha f = (Fecha) o;
		return this.dia == f.dia && this.mes == f.mes && this.año == f.año;

	}

	public int compareTo(Object o) {
		Fecha a = (Fecha)o;
		if (this.año > a.año)
			return 1;
		else if (this.año < a.año)
			return -1;
		else if (this.mes > a.mes)
			return 1;
		else if (this.mes < a.mes)
			return -1;
		else if (this.dia > a.dia)
			return 1;
		else if (this.dia < a.dia)
			return -1;
		else
			return 0;
	}

	public String toString() {
		return this.dia + "/" + mes + "/" + año;
	}
}
