package testThread.com;

public class Test01Main {
	
	TestThread tt = new TestThread();
	
	public class Inner extends Thread {
		@Override
		public void run() {
			tt.runplay(0, 5, "Inner", 300);
			super.run();
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello Thread...");
		
		Thread main = Thread.currentThread();
		System.out.println("main : " + main.getName());
		
		TestThread tt = new TestThread();  // try - catch 부분이 중복되어 메소드를 정리한 클래스를 생성
		// 1. Thread 클래스를 상속받아 스레드 처리하기
		// 오버라이딩 : run 메소드
		// 스레드 실행명령 : start()

		// 1. Thread 클래스 상속하기
			// 1-1 익명내부 클래스로 상속처리
			Thread t = new Thread() {
				@Override // 2. run ctrl + space로 run 오버라이딩 하기
				public void run() {
					tt.runplay(5, 10, "InnerClass", 200);
				}
			};
			t.start();
			t.setName("Thread 1-1");
			System.out.println("t : " + t.getName());
			
			// 1-2 Thread 클래스를 만들어서 extends Thread 로 상속
			ThreadEx tex = new ThreadEx();  // Thread를 상속받는 ThreadEx 클래스를 만든 후 run을 오버라이딩 한다.
			tex.start();
			System.out.println("tex : " + tex.getName());
			
			// 1-3 Inner Class로 exteds Thread 하는 경우
			Inner inner = new Test01Main().new Inner();
			inner.start();
			
		// 2. Runnable 인터페이스를 상속받아 스레드 처리하기
			// → Car를 상속받는 Bus 클래스에서 run을 오버라이딩
			// 스레드 실행명령이 없기 때문에 Thread 생성자의 매개변수로 전달 후 THread 객체로 실행명령 : start()
			
			// 2-1. 익명구현개체로 Runnable
			Thread t3 = new Thread(new Runnable() {
				@Override
				public void run() {
					tt.runplay(10, 15, "Anonymous", 500);
				}
			});
			t3.start();
			
			// 2-2. implements Runnable
			Thread t2 = new Thread(new Bus());
			t2.start();
			
			tt.runplay(15, 20, "main", 700);
			
		System.out.println("end main...");
		
	}//end main

}//end class