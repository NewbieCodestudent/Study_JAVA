package test.com;

public class TestThread {

	public void runplay(int start, int end, String msg, int time) {
		try {
			for (int i = start; i < end; i++) {
				System.out.println(msg + "_Run " + i);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
