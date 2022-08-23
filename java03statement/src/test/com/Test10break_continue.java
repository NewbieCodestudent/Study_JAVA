package test.com;

public class Test10break_continue {

	public static void main(String[] args) {
		// switch or 반복문내에서 제어가 필요할때
		// 그만 >> break
		//  - if문의 블럭을 제외한 가장 가까운 블럭을 빠져나가라.
		// 스킵(건너뛰기) >> continue
		//  - if문의 블럭을 제외한 가장 가까운 블럭의 끝으로 가라.
		
		// 함수를 콜할곳으로 돌아가라 >> return
		System.out.println("hello break and continue");
		
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;  // 5가되면 if 함수를 나가라
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println("===================");
		
		
		for (int x = 0; x < 5; x++) {
			if(x==2)break;
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===================");
		
			
		for (int x = 0; x < 5; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===================");
		
		
		for (int x = 0; x < 5; x++) {
			if (x==2) {  // 2번 줄을 건너뛰어라.
				continue;
			}
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				if (i==5) continue;   // 5일때 나가라 >> 5일때만 제외하고 실행
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===================");
		
		
		
		
		// return; 함수를 전부 실행하고 콜할곳으로 이동...
		// void 일때는 생략가능, void가 없으면 무조건 작성해야 한다.
	}//end main

}//end class