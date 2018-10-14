package conejoYTortuga2;

public class Conejo implements Runnable {
	
	Thread c;
	
	public Conejo(String name) {
		c = new Thread(this, name);
	}
	
	public static Conejo createAndStart(String name) {
		
		Conejo a= new Conejo("Conejo");
		a.c.start();
		return a;
		
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
			System.out.print(c.getName() + "interrupted");
			
		}
	}

}
