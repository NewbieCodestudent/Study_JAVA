package test.com;

public class Test01class_members {  // public은 공유하는 범위이기 때문에 있어도 되고 없어도 된다.

	//1.field - 전역변수, 상수, static or non static(instance)
	public String name;  // 기본값 null이 들어가 있다.
	
	
	//2.constructor - 생성자
	//ctrl + space 를 하면 자동으로 생성자를 만들어줌
	public Test01class_members() {
		// TODO Auto-generated constructor stub
		// init fields : 필드(속성) 초기화
		name = "kim";
	}
	
	
	//3.method : 함수, function
	//  종류 : static or instance
	public void start() {
		// 기능 - 동사(start)
		// instance의 경우는 new를 통해서 접근해야 한다.
	}
	
	public static void stop() {
		// static의 경우 class를 통해서 접근해야 한다.
	}
	
	//4. Class(inner class - 일반(instance class), static class, local class(매소드 안에 생성), anonymous)
	public class Inner{}
	
	
	
	
}//end class