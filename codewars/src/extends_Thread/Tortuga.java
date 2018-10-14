package extends_Thread;

public class Tortuga extends Thread {
	
	Thread th;

	public Tortuga(String str) {
		super(str);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.print("Llegó "+th.getName());
		} catch (InterruptedException h) {
			System.out.print(th.getName() + "interrupted");

		}
	}
}
