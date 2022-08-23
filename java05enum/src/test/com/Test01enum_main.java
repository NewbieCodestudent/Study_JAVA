package test.com;

public class Test01enum_main {

	public static void main(String[] args) {
		// 열거타입, enum
		System.out.println("hello...enum");
		System.out.println(Test01_week.FRIDAY);  // 대문자로 이루어진 글자 = static, 기울어진 글자 = 상수
		Test01_week today = Test01_week.FRIDAY;  // Test01week enum의 값을 week로 선언
		System.out.println(today);
		
		
		
		

	}//end main

}//end class
