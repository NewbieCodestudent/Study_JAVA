package test.com;

public class Test04for_main {

	public static void main(String[] args) {
		System.out.println("hello... 반복문");

		{
			int aaa = 100;  // 변수 x는 중괄호 안에서만 유효하다.
		}
		// System.out.println(x); 오류 발생
		
		int aaa = 100;  // 변수 x는 중괄호 안, 밖 둘다 사용 가능
		{
			System.out.println(aaa);
		}
		System.out.println(aaa);
		
		// 반복문 - for, while, do~while
		// for반복문 : 얼마만큼(길이, 기간...등) 실행하는 반복문 
		for (int i = 0; i < 10; i++) {  // 변수의 초기값 ; 조건(얼마만큼, 횟수); 증감식 (i+=4)
			if (i%2==0) {
				System.out.printf("<%d>", i);				
			}
		} // {}를 만들어주는 행위를 Body를 만들어준다고 한다.
		System.out.println();	
		
		// 중첩 for
		// for문 중첩시 안에 for문 부터 밖으로 순서로 구축하고 변수는 밖에 있는 변수를 새로 등록하는 방법을 습관화하자.
		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 3; x++) {
				for (int i = 0; i < 10; i++) {
					System.out.print(i);
				}
				System.out.println();	
			}
			System.out.println("==================================================");	
		}
		
		// 구구단 만들기
		// 2*1=2, 2*2=4, ... , 2*9=18
		// 3*1=3, 3*2=6, ... , 3*9=27
		// ...
		// 9*1=9, 9*2=18, ... , 9*9= 81
		for (int x = 2; x <= 9; x++) {      // 단 2단부터 ~ 9단까지
			for (int i = 1; i <= 9; i++) {  // 수 1~9까지
//				System.out.print("9*9=9"); 를 변수로 바꾸는 방법 9 > "++" > "+x+" > "++" 를 생략
//				System.out.print(x + "*" + i + "=" + (x*i) + " ");				
				System.out.printf("%2dx%2d =%2d ", x, i, x*i);	
			}
			System.out.println();
		}
		
		

	}//end main

}//end class