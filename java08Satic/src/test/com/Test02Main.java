package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello SingleTon");
		
//		new Test02SingleTon(); // 싱글톤으론 생성한 객체는 call 할 수 없다.
		
		Test02SingleTon singleTon1 = Test02SingleTon.getInstance();
		// 싱글톤으로 선정된 매소드를 getInstance를 통해서 불러올 수 있다.  
		System.out.println(singleTon1);

		Test02SingleTon singleTon2 = Test02SingleTon.getInstance();
		System.out.println(singleTon2);
		// 싱글톤으로 같은 주소에 있는 것을 가지고 오기 때문에 주소가 같다.  
		
	}//end main

}//end class
