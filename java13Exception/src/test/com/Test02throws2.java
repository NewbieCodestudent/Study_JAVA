package test.com;

public class Test02throws2 {

	public static void main(String[] args) {
		System.out.println("Hello throws2");
		
		/*try {
			Class.forName("java.lang.String"); // 클래스를 찾을 때 사용한다.
											   // Class.forName("클래스이름").클래스기능(매소드, 객체 등)
			System.out.println("Good Found..");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} */
		
		try {
			test();
			System.out.println("Good Found...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end main...");

	}// end main
	
	private static void test() throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}

}// end class
