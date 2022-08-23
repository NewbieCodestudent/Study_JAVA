package test.com.hello;

public class Test02type_variable {

	byte b; //전역변수 class 하위
    //초기화하지 않으면 기본값이 할당
	//주의 : 전역변수는 final(상수) 표기시 초기화를 해주어야 함.
	
	public static void main(String[] args) {
		// 타입과 변수
		// 타입종류 : 기본타입, 참조타입(객체, 배열)
		// 변수 : 전역변수, 지역변수
		// 변수 : 소문자로 시작하는 명사 권장
		// byte(타입) b;(변수임름)
		// final 표기시 상수(변경불가값)가 됨. 읽기전용을 의미   ex) final byte c;
		
		
		// 기본타입
		// 1. 정수 : byte, short, char, int, long / 기본값 : 0
		byte b;  //지역변수 main 매소드 하위
		// 선언 최초 변수 지정
		b = 10;  //1바이트 용량 1byte == 8bit : 0000 0000(맨 앞자리가 1이면 음수), -128 ~ 127
		// 사용 = 값변경(초기화), =(할당연산자)
		// 선언 + 초기화 : byte b = 10;
		System.out.println(b);
		// 값확인
		b = 1;
		System.out.println(b);
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		
		short s = 100; // 2byte == 16bit
		System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);

		char c = 100; // 2byte, 0 포함 양의 정수표현(0 ~ 2의 16제곱-1)
		System.out.println(Character.MIN_VALUE + "~" + Character.MAX_VALUE);  // char는 풀네임을 작성
		System.out.println((int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);  // 정수로 변환
		char c2 = 'A'; // 2byte 문자형

		int su = 100; //4byte
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		long ll = 3000000000L; //8byte   / 정수는 기본 int 값으로 인식, 숫자 뒤에 L를 붙여주어야 한다.
		System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		
		// 2. 실수 : float, double / 기본값 : 0.0
		float f = 3.14F;       // 4byte 실수는 기본 double 값으로 인식, 숫자 뒤에 F 또는 변수를 변환해야 한다.
		float f2 = (float)3.14;
		System.out.println(Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		
		double d = 3.14;  // 8byte
		System.out.println(Double.MIN_VALUE + "~" + Double.MAX_VALUE);
				
		// 3. 참거짓 : boolean / 0-false(기본값), 1-true
//		boolean bool = false;
		boolean bool = false, bool2 = true; // 같은 타입의 변수는 ,(연결 연산자)를 통해서 한줄로 작성가능
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		
		// 참조타입 : 기본값 : null(주소가 할당되어 있지 않음)
		// 1. 문자열 : String
		String name = "kim";
		System.out.println(name);
		name = "lee";
		System.out.println(name);

		String name2 = new String(new char[] {'A'});
		System.out.println(name2);
		String name3 = new String("A");
		System.out.println(name3);
		
		System.out.println("공자왈 '효도하라'");
		System.out.println("공자왈 \"효도하라\"");  // "안에 '는 상관이 없지만 "안 "는 오류가 나기때문에 \"로 표기
		System.out.println("공자왈 5\\3");        // 이스케이프 문자(\t, \n, \r, \", \', \\)
		
		byte x2 = 99;
		int y2 = x2; // 작은 타입은 큰 타입에 들어갈때 자동으로 타입이 변환되어 적용
		byte z2 = (byte)y2; // 큰 타입을 작은 타입에 넣을 때는 타입 변환을 해주어야 한다. 
		// (type) = 타입을 변환, (연산자(+,-,/ 등)) = 우선 계산을 위한 우선 연산자 괄호
		// (값, 값, 값,) = 함수에서 나열할 때 사용, (tybe 변수, tybe 변수, tybe 변수,) = 함수에서 정의할 때 사용
		
		byte su1 = 10;
		byte su2 = 20;
		int sum = su1 + su2; // 연산자에 의해 계산이 이루어지면 자동으로 int 타입으로 변환됨.
		
		int total = 299;
//		double avg = total/3.0;
		double avg = (double)total/3.0;
		System.out.println("avg : " + avg);
		System.out.printf("avg : %.2f\n", avg);
		// 정수를 나누면 결과로 몫만 반환한다. 나머지를 출력하기 위해서는 정수값을 실수(double)값으로 설정해주어야 한다.
		System.out.println("avg : " + avg + 100);
		// 문자열 뒤에 숫자를 더하면 전체가 문자열이 된다.
		
		// 기본타입의 변수 또는 값을 문자열로 변환하기.
		// 100 >> "100"
		int score = 100;
		System.out.println(score + 100);
		System.out.println(String.valueOf(score) + 100); // String 클래스의 valueOf 기능으로 변환
		System.out.println(new Integer(score).toString() + 100); // Integer에 줄이있는 이유는 현재는 이러한 문법을 잘 쓰지 않는다.
		
		// 문자열로된 변수 또는 값을 기본타입으로 변환하기. 
		// "1000" + 1000 >> 1000 + 1000
		String point = "1000";
		System.out.println(point + 1000);
		System.out.println(Integer.parseInt(point) + 1000);
		
		String point2 = "3.14";
		System.out.println(Double.parseDouble(point2) + 1000);

		String t_f = "true";
		System.out.println(!true);  // !는 논리변수에서 부정하는 연산자
		System.out.println(!Boolean.parseBoolean(t_f));
		
		// 2. 배열 : 모든타입 [], 데이터 {}, 연산자 new
		// 3. 객체 : new, 첫글자 대문자(Sxxx) 클래스
	
	}//end main()

}//end class