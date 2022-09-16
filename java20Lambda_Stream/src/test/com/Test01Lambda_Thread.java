package test.com;

public class Test01Lambda_Thread {

	public static void main(String[] args) {
		System.out.println("Thread inner class >> Lambda");
		
		// method의 argument(인자)로 inner class를 사용하던 것을 Lambda식으로 사용
		// jdk8 부터 가능
		
		// 0~9 : 1초에 1씩 증가 출력하기...
		
		// 익명내부 클래스 Runnable >> ()->{}
		Thread t1 = new Thread(()->{
			try {
				for (int i = 10; i < 20; i++) {
					System.out.print(i + " ");
					Thread.sleep(300);
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		
		Runnable r = ()->{
			try {
				for (int i = 10; i < 20; i++) {
					System.out.print(i + " ");
					Thread.sleep(500);
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t2 = new Thread(r);
		t2.start();
		
		Thread t3 = new Thread(getRunnable());
		t3.start();
		
		System.out.println("end main...");
	}// end main

	private static Runnable getRunnable() {
		// TODO Auto-generated method stub
		return ()->{
			try {
				for (int i = 90; i < 100; i++) {
					System.out.print(i + " ");
					Thread.sleep(700);
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}
	
}//end class
