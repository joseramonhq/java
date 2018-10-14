package prueba_de_Thread;

public class Tortuga implements Runnable{
	String tortu;
	
	Tortuga (String x) {
		tortu=x;
	}
	
	@Override
	public void run() {
		try {
			for(int i =0; i<10;i++) {
			System.out.print("_");
			Thread.sleep(1500);
			}
			System.out.print("Llegó tortuga");
		}catch(InterruptedException h) {
			System.out.print(tortu + "interrupted");
			
		}
	}
}
