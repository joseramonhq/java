package ejercicio2Fecha;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;

	public Fecha() {
		dia = 1;
		mes = 1;
		ano = 1;
	}

	public Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return this.dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return this.mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return this.ano;
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	public void visualizar() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}

	public static void visualizar(Fecha a) {
		System.out.println(a.dia + "/" + a.mes + "/" + a.ano);
	}

	public static boolean compararDosFechas(Fecha a, Fecha b) {
		return a.dia == b.dia && a.mes == b.mes && a.ano == b.ano;
	}

	public boolean compararDosFechas(Fecha a) {
		return this.dia == a.dia && this.mes == a.mes && this.ano == a.ano;
	}

	public boolean validarFecha() {
		int dia;
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:
				dia = 30;
				break;
			case 2:
				if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
					dia = 29;
				} else {
					dia = 28;
				}
				break;
			default:
				dia = 31;
				break;
			}
		} else {
			return false;
		}
		if (this.dia >= 1 && this.dia <= dia) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(Object o) {
		Fecha x = (Fecha) o;
		return this.dia == x.dia && this.mes == x.mes && this.ano == x.ano;
	}

	public int compareTo(Fecha a) {
		if(this.ano>a.ano) 
			return 1;
		else if (this.ano<a.ano)
			return -1;
		else if (this.mes>a.mes)
			return 1;
		else if (this.mes<a.mes)
			return -1;
		else if (this.dia>a.dia)
			return 1;
		else if (this.dia<a.dia)
			return -1;
		else
			return 0;

	}
}
