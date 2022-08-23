package testInterrupt.com;

public class PrintThread extends Thread {

	@Override
	public void run() {
//		while (true) {
//			System.out.println("while...");
//			if (Thread.interrupted()) {
//				break;
//			}
//		}
//		
		try {
			while(true) {
				System.out.println("while...");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
		}
		
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}
