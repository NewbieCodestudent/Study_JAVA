package test.com.hello;
//최상단 package 명시, src 폴더에 생성

public class Test01hello {
//class 명시, bin 폴더에 생성

	public static void main(String[] args) {
		// static : 구동을 위해 명시
		// ctrl + space = 자동완성 도움 단축키
		// 한줄 주석작성 방법 : //, ctrl + shift + c, ctrl + /
		// 범위 주석 : /* */, ctrl + shift + /or\
		// 문서화 주석 : /** */
		// println은 대부분의 type을 출력
		System.out.println("hello" + "world");
		System.out.println();
		System.out.println("hello" /* + "world" */);
		
		System.out.println("hello");
		// sysout 입력 후 ctrl + space = System.out.pintln 단축키
		// 코드 실행 : ctrl + F11, 우클릭 > run as > Java application
		// ctrl + alt + 화살표(↑,↓)
		// ctrl + d : 라인삭제
		
		System.out.println(true);  // <boolean type> : 참(true), 거짓(false)
		System.out.println('a');   // <char type> : 문자하나, 한글자
		System.out.println("AAA"); // <String type> : 공백포함, 문자 여러개
		System.out.println(100);   // byte, short, char, int, long : 정수타입, 크기에 따라 사용방법 변함.		
		System.out.println(3.14);  // float, double : 실수타입
			// 기본 타입(8개) : boolean, char, byte, short, int, long, float, double
			// String(첫 글자가 대문자) : class로 편성된 타입
		System.out.println(new Object());  // 객체 출력, 메모리 주소를 16진수로 출력하는 기능
		System.out.println(new Test01hello());
			// test package에 com package에 hello package에 Test01hello class 안에 @3b192d32 주소를 가지고 있다.
		System.out.print('A');      // ln이 빠지면 최소한 0이 와야함. 단순출력
		System.out.println("lee");  // ln은 enter의 기능을 함.
		
		System.out.printf("han\n"); // printf는 특정 출력을 지정해서 입력, 포멧을 지정할 수 있음
		System.out.printf("yang\n");  // \n : enter기능
		
		System.out.println("100" + "yang" + "200");   // 100, 200이 변수일 경우
		System.out.printf("%dyang%d\n", 100, 200);    // %d로 정수 변수 지정하고 뒤에 변수값지정
		System.out.printf("%fyang%.2f\n", 1.123, 2.456);
		System.out.printf("%c_%s\n", 'X', "MMM");
			// 정수 : %d, 실수 : %.0f (.0은 표현하려는 자리수 지정)
			// 한글자 : %c, 여러글자 : %s (%0 숫자를 넣어서 띄어쓰기, %t tab 하나를 띄어쓰기)

		
	}// end main() : method(함수, function)

}// end class