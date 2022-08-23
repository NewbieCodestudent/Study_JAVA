package test.com;

public /* final */ class Car { //final로 상수로 변경시 상속이 안된다.
	
	protected int price;
	protected String model_name;
	
	public Car() {
		System.out.println("Car()...");
	}
	
	//final 적용시 오버라이딩 불가능.
	public int open() {
		System.out.println("Car open()...");
		return 4;
	}
	
	
	
}
