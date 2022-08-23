package test.com;

public class Test01Person {
	//사람과 관련된 메소드 제작하기
	
	//잠자는 기능을 위한 메소드 sleep 제작
	//public 모두를 포함한다.
	//void 반환타입은 지정하지 않는다.
	
	// 1번 그림 (받는 것과 결과가 없다.)
	public void sleep1() {
		System.out.println("sleep1()");
		return; //생략가능
	}
	
	// 2번 그림 (받는 것은 있으나 결과가 없다.)
	public void sleep2(int price, String car_model) {
		// 받는 것에 대한 변수는 여러가지를 설정할 수 있다.
		// 변수를 설정하여 줄때 타입을 선택하고 뒤에 변수이름에 대해서는 불러오는 사람이 무슨 값을 넣을지 알 수 있도록 이름을 만들도록 한다.
		// "price = 가격을 입력해라"와 같이...
		System.out.println("sleep2(int price, String car_model)"); 
		System.out.print(price + " ");
		System.out.println(car_model);
		// return;
	}
	
	// 3번 그림 (받는 것은 없으나 결과가 있다.)
	public int sleep3() { // int 라는 타입을 지정하고 ()안에 받는 것을 지정하지 않는다.
		System.out.println("sleep3()...");
		return 1; // 무언가는 넣지만 반환된 값은 0이다.
	}
//	public String sleep3() {
//		System.out.println("sleep3()...");
//		return "kim";
//	}
//	public double sleep3() {
//		System.out.println("sleep3()...");
//		return 3.14;
//	}
//	public Test01Person[] sleep3() {
//		System.out.println("sleep3()...");
//		return new Test01Person[3];
//	}
	
	// 4번 그림 (받는 것과 결과가 있다.)	
	public String sleep4(double avg_time, int count) {
		System.out.println("sleep4(double avg_time, int count)...");
		System.out.print(avg_time + " ");
		System.out.println(count);
		return "Good";
	}
	

}
