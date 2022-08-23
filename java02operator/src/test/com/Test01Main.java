package test.com;

public class Test01Main {
// 클래스 이름 변경하는 방법 : 좌측 Package Explorer에 변경하고자 하는 클래스 클릭 후 F2번을 눌러서 변경
// 대문자에서 소문자를 변경할 떄 Main >> mmain 변경 후 실행 확인 후 mmain >> main 으로 변경
//  why? 대문자에서 소문자 바로 변경시 에러가 발생하는 경우가 있다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		//1. 산술연산
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);  // 나누기 몫
		System.out.println(10 % 3);  // 나누기 나머지
		System.out.println("==================");
		
		//2. 대입, 할당 연산
		int su = 100;
		System.out.println(su);
		int result = su + 100;
		System.out.println(result);
		
		su = su + 1000;
		System.out.println(su);
		
		// 간략화 방법
		// su = su + 1000; → su = + 1000; → su += 1000;   연산자가 할당연산자보다 좌측에 입력되어야 한다. 
		su += 1000;
		System.out.println(su);
		
		su -= 1;
		System.out.println(su);
		
		su = 10;
		su &= 3;
		System.out.println(su);
		
		su = 10;
		su |= 3;
		System.out.println(su);
		
		
		su = 10;
		su ^= 3;
		System.out.println(su);
		
	
	}//end main()

}//end class
