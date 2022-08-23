package test.com;

public class Test01if_main {

	public static void main(String[] args) {
		// if, if~else, if ~ else if ~ else if ~ else

		System.out.println("hello if...");
		// if(boolean 결과) ; , {}
		if (true)
			System.out.println("OK");

		if (5 == 5)
			System.out.println("OK2");

		double avg = 88.99;
		if (avg >= 90)
			System.out.println("A");
		// System.out.println("hello"); if와 else if 사이에 다른 코드가 들어오면 오류발생
		else if (avg >= 80)
			System.out.println("B"); // else if의 경우 첫 번째 참만 인정된다.

		// 블럭으로 지정하여 설정
		if (avg >= 90) {   // if 아래 함수 중 참인 함수만 실행
			System.out.println("hello");
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B" + avg%10);
			if(avg%10>0) {    // if 문 안에 if문을 추가로 넣을 수 있다.
				System.out.println("B2");
			}
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {   // 전부 해당이 되지 않을때
			System.out.println("F");
		}
		
		// 02opertator test03bufferedReader에 예제있음.

	}// end main

}// end class
