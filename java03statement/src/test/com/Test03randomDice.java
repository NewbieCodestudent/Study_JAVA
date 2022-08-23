package test.com;

public class Test03randomDice {

	public static void main(String[] args) {
		// 주사위 프로그램
		double nanSu = Math.random();  // . + 소문자 + () + ;  = 매소드를 Call 했다는 의미
		//math는 수학과 관련된 기능들을 가지고 있는 매체
		//random은 0~1 사이의 double값을 랜덤으로 반환한다.
		System.out.println(nanSu);
		System.out.println(nanSu * 6);
		System.out.println((int)(nanSu * 6));
		
		int ranSu = (int)(nanSu * 6);
		int ju4up = ranSu +1;
		switch (ju4up) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(ju4up + "번이 나왔습니다.");
			break;
		default:
			break;
		}
		
		String msg = "";
		switch (ju4up) {
		case 1:
			msg = ju4up + "번 나옴. 111";
			break;
		case 2:
			msg = ju4up + "번 나옴. 222";
			break;
		case 3:
			msg = ju4up + "번 나옴. 333";
			break;
		case 4:
			msg = ju4up + "번 나옴. 444";
			break;
		case 5:
			msg = ju4up + "번 나옴. 555";
			break;
		case 6:
			msg = ju4up + "번 나옴. 666";
			break;
		default:
			msg = "주사위가 모서로 섰네요.";
			break;
		}
		System.out.println(msg);
		
		// 비교연산의 경우 if문 추천
		// 값이 있어서 그것을 대입하는 방법은 switch문 추천

	}//end main

}//end class
