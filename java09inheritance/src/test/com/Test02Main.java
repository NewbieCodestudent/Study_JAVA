package test.com;

import java.io.InputStreamReader;
import java.io.Reader;

import test.kosta.AirBus;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		Car car = new Car();
		System.out.println(car.price);
		System.out.println(car.model_name);
		System.out.println(car.open());  // void 타입은 print에서 받지 않음.
		System.out.println("==========================");
		
		Bus bus = new Bus();
		System.out.println(bus.price);
		System.out.println(bus.model_name);
		System.out.println(bus.station_count);
		System.out.println(bus.com_name);
		System.out.println(bus.autoDoorOpen());
		System.out.println(bus.open());
		System.out.println("==========================");
		
		AirBus ab = new AirBus();
		System.out.println(ab.price);
		System.out.println(ab.model_name);
		System.out.println(ab.station_count);
		System.out.println(ab.com_name);
		System.out.println(ab.staff_count);
		System.out.println(ab.wing_count);
		System.out.println(ab.autoDoorOpen());
		System.out.println(ab.open());
		System.out.println(ab.fly());
		System.out.println("==========================");

		Reader r = new InputStreamReader(System.in);
		// 다형성
		// 타입의 이름이 오른쪽과 다르다면 오른쪽에 있는 것은 왼쪽을 상속받은 것이다. 
		Car c1 = new Bus(); // Car 타입으로 Car 타입에 있는 기능만 사용가능.
		System.out.println(c1.model_name);
		System.out.println(c1.price);
		c1.open();
		
		System.out.println("===========다형성 Bus===============");
		Car c2 = new AirBus();
		c2.open();
		
		System.out.println("===========다형성 Taxi===============");
		Car c3 = new Taxi();
		c3.open();
		
		System.out.println("===========다형성 리턴===============");
		Car c4 = testCar();  // static 함수를 통한 리턴
		c4.open();
		
		System.out.println("==========다형성 anonymous(익명내부)================");
		Car c5 = new Car() {  // Car를 상속받는 inner Class Car를 생성
			int num;          // inner Class는 작업폴더내 Test02Main$1.class 라는 파일로 생성된다.
			public void aaa() {
				System.out.println("aaa");
			}
			@Override
			public int open() {
				System.out.println("anonymous open");
				aaa();
				return 4;
			}
		};
		c5.open();
		
		Car c6 = new Car() {
		};
		
		System.out.println("==========================");
		Bus b1 = new AirBus();
		System.out.println(b1.price);
		System.out.println(b1.model_name);
		System.out.println(b1.station_count);
		System.out.println(b1.com_name);
		System.out.println(b1.autoDoorOpen());
		System.out.println(b1.open());

		
		
		
	}//end main

	private static Car testCar() {
//		return new Bus();
		return new Taxi();
	}

}//end class
