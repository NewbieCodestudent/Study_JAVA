package testInterrupt.com;

public class Test03Main {

	public static void main(String[] args) {
		System.out.println("Hello interrupt...");

		PrintThread pt = new PrintThread();
		pt.setDaemon(true);
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("pt.isDaemon() : " + pt.isDaemon());
		
		pt.interrupt();
		
		System.out.println("end main...");

	}// end main

}// end class