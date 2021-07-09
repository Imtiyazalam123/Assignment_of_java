package imtiyaz.lang;

public class ThreadExample4 extends Thread {
	
	boolean running = true;
	public void run() {
		while(running) {
			try {
				int num = (int)((Math.random() * 24) + 2);
				System.out.println(num);
				Thread.sleep(500);
			}catch(InterruptedException ie) {
			}
		}
	}
	public static void main(String args[]) {
		ThreadExample4 t = new ThreadExample4();
		t.start();
	}
	
}
