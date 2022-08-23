package testThread.com;

public class Bus extends Car implements Runnable {
	
	TestThread tt = new TestThread();
	
	@Override
	public void run() {
		tt.runplay(25, 30, "Bus", 500);
	}
	
}
