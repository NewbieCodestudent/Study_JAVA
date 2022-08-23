package test.com;

public class Bus extends Car {

	protected int station_count;
	// protected는 상속 제어문
	// 다른 패키지에 상속하기 위해서는 protected 또는 public 제어문을 사용해야 한다.
	protected String com_name;
	
	public Bus() {
		System.out.println("Bus()...");
	}
	
	protected String autoDoorOpen() {
		System.out.println("Bus autoDoorOpen()...");
		System.out.println(station_count);
		System.out.println(com_name);
		System.out.println(price);
		System.out.println(model_name);
		open();
		return "back door";
	}
	
	@Override // open ctrl + space를 하면 자동으로 오버라이딩 양식이 나온다.
	public int open() {
		System.out.println("Bus override open()...");
		return 2/* super.open() 부모의 리턴 값*/;
	}
	
}
