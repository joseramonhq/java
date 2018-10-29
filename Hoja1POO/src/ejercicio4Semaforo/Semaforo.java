package ejercicio4Semaforo;

public class Semaforo {

	private String color;

	public Semaforo() {
		color = "rojo";
	}

	public Semaforo(String color) {
		// Suponiendo que introducimos solo colores validos...
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void visualizar() {
		System.out.println(this.color);
	}

}
