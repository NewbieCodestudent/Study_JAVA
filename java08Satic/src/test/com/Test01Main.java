package test.com;

public class Test01Main {

	static String model = "KN";
	String model2 = "KN";
	
	public void eat() {
		System.out.println("eat");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello static");
		
		Test01static st = new Test01static();
		System.out.println(st.num1);
		System.out.println(Test01static.num2);  // static 변수는 Class이름 + . 으로 call한다.
		st.num1 = 100;
		Test01static.num2 = 200;
		System.out.println(st.num1);
		System.out.println(Test01static.num2);
		
		System.out.println("=============================");
		
		System.out.println(st.name1);
		System.out.println(Test01static.name2);
		st.name1 = "kim";
		Test01static.name2 = "lee";
		System.out.println(st.name1);
		System.out.println(Test01static.name2);
		
		System.out.println(Test01static.NAME_THREE);
		//Test01static.NAME_THREE = "kim";  // 상수이므로 수정불가, read only

		Test01static.run(); // static은 class를 통해서 call
		System.out.println();
		
		st.start(); // static이 아닌 경우 new를 통해서 변수를 선언하고 call
		System.out.println();
		
		Test01static.sleep();
		System.out.println();
		
		st.stop();
		
		Test01Main main = new Test01Main();
		main.eat();
		
		System.out.println(main.model2);
		System.out.println(model);
		
		
	}//end main

}//end class
