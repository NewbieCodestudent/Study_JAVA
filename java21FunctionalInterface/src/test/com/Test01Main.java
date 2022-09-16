package test.com;

import java.util.Random;

public class Test01Main {

	static Random random = new Random();
    static int user1 = random.nextInt(10);
    static int user2 = random.nextInt(10);
    static int user3 = random.nextInt(10);
    static int user4 = random.nextInt(10);
	
	public static void main(String[] args) {
		System.out.println("Hello_FunctionlInterface");
		
		// 일급객체를 익명내부 클래스로 인자 전잘
			Test01Main.is(new MyValidator() {
				@Override
				public boolean test() {
					System.out.println("test()...");
					return false;
				}
			});
			System.out.println("1======================");
		
		// 일급객체를 람다식으로 인자 전달
		// ()->false
			Test01Main.is(()->false);
			System.out.println("2======================");
		
		// ()->{return false}
			boolean result = Test01Main.is(()->{
				System.out.println("test()...");
				return false;
			});
			System.out.println("3======================");
		
		// 위에 is가 return으로 false를 가져오기 때문에 boolean으로 변수로 선언가능
			System.out.println("result : "+result);
			System.out.println("4======================");
		
		// 랜덤매소드를 이용한 람다의 boolean 함수
			// 1. 랜덤으로 숫자를 만드는 변수 2개를 생성
			
	        System.out.println(user1 + " " + user2);
	        System.out.println("5======================");
	        
	        // 2. 변수 2개를 비교하는 람다식을 작성
	        boolean check = is(()->user1 < user2);
	        System.out.println(check);
	        System.out.println("6======================");
	   //=========================================================================
	        Test01Main.is2(new MyValidator2() {
				@Override
				public boolean test(int x, int y) {
					System.out.println(user3 + " " + user4);
					return false;
				}
	        });
	        System.out.println("user3 + user4 : " + (user3 + user4));
	        check = is2((user3, uesr4)-> user3 + user4 < 10);
	        System.out.println(check);
	}//end main
	
	static boolean is2(MyValidator2 val) {
		return val.test(user3, user4);
	}
	
	static boolean is(MyValidator val) {
		System.out.println("is()...");
		return val.test();
	}

}//end class
