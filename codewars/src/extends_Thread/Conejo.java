package extends_Thread;

public class Conejo extends Thread {

	Thread th;

	public Conejo(String str) {
		super(str);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print("_");
				Thread.sleep(500);
			}
			System.out.print("Llegó "+th.getName());
		} catch (InterruptedException h) {
			System.out.print(th.getName() + "interrupted");

		}
	}

}
