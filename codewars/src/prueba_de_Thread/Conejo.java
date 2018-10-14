package prueba_de_Thread;

public class Conejo implements Runnable{
	String cone;
	
	Conejo (String x) {
		cone=x;
	}
	
	@Override
	public void run() {
		try {
			for(int i =0; i<10;i++) {
			System.out.print("_");
			Thread.sleep(500);
			}
			System.out.print("Llegó conejo");
		}catch(InterruptedException h) {
			System.out.print(cone + "interrupted");
			
		}
	}

}