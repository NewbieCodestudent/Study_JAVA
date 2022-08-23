package test.com;

public class Test01static {
	
	// 전역변수 생성, static이 붙은 것과 아닌것을 생성
	int num1;
	static int num2;
	String name1;
	static String name2;
	
	static final String NAME_THREE = "yangssem"; //final은 상수로 선언시 초기화를 해주어야 한다. 변수 이름도 대문자로 작성한다.
	
	
	public static void run() {
		System.out.print("run ");
	}
	
	public void start() {
		System.out.print("start ");
		run();     // static이 아닌 매소드가 static을 call 할 때는 매소드 이름으로 call 가능
		stop();    // static이 아닌 매소드를 call 할 때도 매소드 이름으로 call 가능
	}
	
	public static void sleep() {
		System.out.print("sleep ");
//		stop();  // static 타입의 매소드는 다른 형식을 가져올때 static call하는 방식으로 call 해와야 한다.
		Test01static st = new Test01static();
		st.stop();
		run();   // 같은 타입의 매소드는 매소드 이름으로 가져오면 된다.
	}
	
	public void stop () {
		System.out.print("stop ");
	}
	
}
