package test.com;

public interface Father {

	// 상수필드
	// 변수는 public static final 이 생략되어 있다.
	String max_money = "$1,000,000";
	
	
	// 매소드
	public int work();  // abstract 생략가능. 기본값이 추상매소드이다.
	
	public static String drink() {
		System.out.println("father static drink");
		return "Beer";
	} 
	
	public default double drive() {
		System.out.println("father default drive");
		return 3000.0;
	}
	
	// 중첩인터페이스
	static interface Entry {
		
	}
	
}
