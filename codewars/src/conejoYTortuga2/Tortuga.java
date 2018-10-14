package conejoYTortuga2;

public class Tortuga implements Runnable {
	
	Thread t;
	
	public Tortuga(String x) {
		t = new Thread(this, x);
	}
	public static Tortuga createAndStart(String name) {
		
		Tortuga a= new Tortuga("Tortuga");
		a.t.start();
		return a;
		
	}

	@Override
	public void run() {
		try {
			for(int i =0; i<10;i++) {
			System.out.print(".");
			Thread.sleep(1500);
			}
			System.out.print("Llegó tortuga");
		}catch(InterruptedException h) {
			System.out.print(t.getName() + "interrupted");
			
		}
	}

}
