package test.com;

public class ThreadEx extends Thread {

	public ThreadEx() {
		setName("ThreadEX");
	}
	
	@Override
	public void run() {
		TestThread tt = new TestThread();
		tt.runplay(20, 25, "ThreadEx", 1000);
	}
	
	
	
}
