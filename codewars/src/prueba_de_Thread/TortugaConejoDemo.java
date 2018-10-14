package prueba_de_Thread;

public class TortugaConejoDemo {

	public static void main(String[] args) {
		
		Tortuga a = new Tortuga("Tortuguita");
		Conejo b = new Conejo("Conejito");
		
		Thread t = new Thread(a);
		Thread c = new Thread(b);
		t.start();
		c.start();


	}

}
