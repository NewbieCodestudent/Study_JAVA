package test.com;

public class Test02SingleTon {
	// 싱글톤 만드는 방법
	private static Test02SingleTon singleTon = new Test02SingleTon();
	// class를 생성자로 만든다는 것은 싱글톤으로 만들어서 외부에서 간섭할 수 없게 하려는 것이다.
	
	private Test02SingleTon() {
		
	}
	
	public static Test02SingleTon getInstance() {
		return singleTon;
	}
	
}
