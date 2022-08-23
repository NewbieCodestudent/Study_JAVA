package test.com;

public class Test02Main {

	public static void main(String[] args) {

		System.out.println("Hello interace");
		
		Mother m = new Me_class();
		m.play();
		m.waiting();
		Mother.sleep();  // static은 자신이 포함된 Class. 으로 call 해야한다.
		
		Me_class me = new Me_class();
		me.play();
		me.waiting();
		
		System.out.println("========================");
		Mother m2 = new Mother() {
			@Override
			public void play() {
				System.out.println("anoymous inner play()...");
			}
		};
		
		Test02Main main = new Test02Main();
		main.test(m2);

		System.out.println("========================");
		main.test(new Mother() {
			@Override
			public void play() {
				System.out.println("2.anoymous inner play()...");
			}
		});
	
		System.out.println("========================");
		Mother m3 = /* Test02Main. 생략가능 */test3();
		m3.waiting();
		m3.play();
		
	}// end main
	
	private static Mother test3() {
		// return을 null로 입력시 컴파일 오류 발생
		return new Mother() {
			@Override
			public void play() {
				System.out.println("3.anoymous inner play()...");
			}
		};
	}
	
	public void test(Mother m2) {
		m2.waiting();
		m2.play();
	}

}// end class
