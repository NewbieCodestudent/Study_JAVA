package test.com;

public class Test03instanceof {

	public static void main(String[] args) {
		System.out.println("Hello instanceof");
		
		// Car <- Bus
		// Car <- Taxi
		
		Car c = new Bus();
		Car c2 = new Taxi();
		
//		Bus b = (Bus)c2;  // c2가 Taxi여서 상위에 있는 것을 변환하여 오류 발생
//		b.open();
		
//		Bus b = new Car();       // 상위에 있는 것으로 오류 발생
//		Bus b = (Bus)new Car();  // Bus로 강제변환을 해도 CastExcaption 오류가 발생한다.
		System.out.println(c2 instanceof Taxi);
		System.out.println(c2 instanceof Bus);
		// 참일때 동작
		if(c2 instanceof Taxi) {
			Taxi t = (Taxi)c2;
			t.open();
		}
		if(c2 instanceof Bus) {
			Bus t = (Bus)c2;
			t.open();
		}
		System.out.println("========================");
		test(c2);
		
		System.out.println("========================");
		c2 = test2();
		if(c2 instanceof Taxi) {
			Taxi t = (Taxi)c2;
			t.open();
		}
		if(c2 instanceof Bus) {
			Bus t = (Bus)c2;
			t.open();
		}

	}// end main

	private static Car test2() {
//		return new Bus();
		return new Taxi();
	}
	
	private static void test(Car c2) {
		if(c2 instanceof Taxi) {
			Taxi t = (Taxi)c2;
			t.open();
		}
		if(c2 instanceof Bus) {
			Bus t = (Bus)c2;
			t.open();
		}
	}

}// end class
