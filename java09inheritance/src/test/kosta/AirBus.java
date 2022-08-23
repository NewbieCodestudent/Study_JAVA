package test.kosta;

import test.com.Bus;

public class AirBus extends Bus {

	public int wing_count; 
	public String staff_count;
	// 패키지가 다른 마지막 자식class의 변수는 public으로 해야 Main에서 출려가능
	// 상속하는 것이 없기 때문에 protected는 사용할 수 없다.
	
	public AirBus() {
		System.out.println("AirBus()...");
	}
	
	public double fly() {
		System.out.println("fly()...");
		System.out.println(station_count);
		return 45.3;
	}
	
	@Override
	public String autoDoorOpen() {
		System.out.println("AirBus autoDoorOpen()...");
		return "side door";
	}
	
	@Override
	public int open() {
		System.out.println("AirBus override open()...");
		return 1;
	}
	
	
	
}
