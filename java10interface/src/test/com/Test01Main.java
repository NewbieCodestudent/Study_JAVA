package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello interface");
		
		// 인터페이스 : 다중상속을 지원한다.
		// 			 인터페이스 간의 상속 또는 클래스와 인터페이스 간의 상속
		// 모든 전역변수는 public static final 이다.(무조건 상수)
		// 생성자가 없다.
		// 매소드의 종류 : 블럭없느 abstract(생략가능)
		//             블럭있는 default, static 중 하나를 붙여서 생성

		// String은 Object class와 Serializable, CharSequence, Comparable<String> 3개의 interface를 상속한다.
		String str = "kim";
		CharSequence cs1 = "lee";
		CharSequence cs2 = new String("lee");
		// 인터페이스를 상속하기 때문에 다형성으로 객체생성 가능
		
		System.out.println(Father.max_money);
		
		System.out.println(Father.drink()); //static 매소드는 call 객체 생성없이 call 가능
		System.out.println(new Me_class().work());  //추상매소드와 default매소드는 객체를 생성해서 call해야 한다.
		System.out.println(new Me_class().drive());
		System.out.println("=========================");
		
		Me_class me = new Me_class();
		System.out.println(me.drive());
		System.out.println(me.work());
		me.aaa();
		me.bbb();
		me.ccc();
		System.out.println("=========================");
		
		Father father = new Me_class();
		System.out.println(father.drive());
		System.out.println(father.work());
		// 다형성 선언에서는 왼쪽 class의 기능안에서 우측 내용을 불러온다.
		
		// = (할당연산자) 우측에 있는 내용은 리터널이다.
		Father father2 = new Father() { // inner class로 오버라이딩하기
			@Override
			public int work() {
				System.out.println("anonymous inner");
				return 0;
			}
		};
		father2.work();
		System.out.println("=======================");

		test(new Father() { // new Me_class() 가 test(Me_class me)에 할당되어 test(Me_class me = new Me_class())가 된다.
			@Override
			public int work() {
				System.out.println("args work()");
				return 0;
			}});  
		Father me2 = new Me_class() {};

	}//end main

	public static Father test(Father me) {
		me.work();
		return new Me_class() {};
		// Me_class me = new Me_class();
	}

}//end class
