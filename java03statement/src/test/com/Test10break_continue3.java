package test.com;

public class Test10break_continue3 {

	public static void main(String[] args) {
		// switch or 반복문내에서 제어가 필요할때
		// 그만 >> break
		//  - if문의 블럭을 제외한 가장 가까운 블럭을 빠져나가라.
		// 스킵(건너뛰기) >> continue
		//  - if문의 블럭을 제외한 가장 가까운 블럭의 끝으로 가라.
		
		// 함수를 콜할곳으로 돌아가라 >> return
		System.out.println("hello break and continue");
		
		f1 : for (int x = 0; x < 5; x++) {
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				if(i==5) break f1;
				// break를 부여할때 빠자나갈 곧을 정하는 방법은 라벨을 달아주고 나가고 싶은 곳 앞에 라벨을 달아주면 된다.
				// 라벨을 달아주는 양식은 자유
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===================");
		

		f_x : for (int x = 0; x < 5; x++) {
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
				if (i==5) continue f_x;
			}
			System.out.println();
		}		
		
		
		// return; 함수를 전부 실행하고 콜할곳으로 이동...
		// void 일때는 생략가능, void가 없으면 무조건 작성해야 한다.
	}//end main

}//end class

