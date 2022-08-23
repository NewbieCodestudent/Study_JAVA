package test.com;

public class Test02switch_main {

	public static void main(String[] args) {
		// switch~case~break
		System.out.println("hello switch");
		
		// switch 는 입력값이 많아 swi ctrl + space로 기본문을 입력한다.
		
		int key = 6;
		switch (key) { //key에는 연산자가 오면 안된다. 변수만 입력, key가 case와 같은지 확인하는 함수
		               //switch는 정수, char, String만 입력가능
		case 0:
			System.out.println("0");
			break;  // if문을 제외한 가장 가까운 블럭을 빠져나감, break가 없는데 아래 항목을 다 실행함.
			
		case 1: case 2: case 3: case 4: case 5: case 6:  // break를 빼서 여러가지 경우의 수를 반영할 수 있다.
			System.out.println("1");
			if(key/3 > 1) {
				System.out.println("Big");
			} else if(key/3 <= 1) {
				System.out.println("Small");
			}
			break;  // if문을 제외한 가장 가까운 블럭을 빠져나감.

		default:
			System.out.println("default");
			break;
		}
		
		
		
		

	}//end main

}//end class
