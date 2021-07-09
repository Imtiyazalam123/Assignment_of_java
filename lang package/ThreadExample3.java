class ThreadExample3 implements Runnable {

	Thread t ;
	public ThreadExample3() {
		t = new Thread(this, "MyThread");
		System.out.println("Child Thread : "+t);
		t.start();
	}
	public void run() {
		try {
			System.out.println(new java.util.Date());
			t.sleep(2000);
		} catch(InterruptedException ie) {
		}
	}
	public static void main(String args[]) {
		ThreadExample3 th = new ThreadExample3();
	}	
}