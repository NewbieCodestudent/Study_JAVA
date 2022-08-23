package test.com;

public class Score {
	// 접근제한의 선언이 없으면 동일폴더(package)에서만 유효
	int num;   // 0
	
	// protected는 상속관계시 package가 달라도 유효, 동일 package도 유효 
	protected String name;  // null
	
	// private은 소속된 클래스 내부에서만 유효 = 은닉화
	/* private */ int kor;   // 0
	
	// public은 다른 package에서도 사용이 가능하다.
	public int eng;   // 0
	public int math;  // 0
	
	public Score() {  // 생성자
		System.out.println("Score()...");
	}
	
}
