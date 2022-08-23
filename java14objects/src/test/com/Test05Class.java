package test.com;

public class Test05Class {

	public static void main(String[] args) {
		System.out.println("Hello Class");
		
		try {
			Class<?> clazz = Class.forName("test.com.MemberVO"); // class를 이름으로 검색
			System.out.println("Class Found...");
			System.out.println(clazz.getName());  // 클래스 내부의 정보를 출력
			System.out.println(clazz.getConstructors()[0]);
			System.out.println(clazz.getConstructors()[1]);
			System.out.println(clazz.getMethods()[0]);
			System.out.println(clazz.getMethods()[1]);
			System.out.println(clazz.getMethods()[2]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("=======================================");
		
		Class<?> clazz2 = MemberVO.class;
		System.out.println(clazz2.getName());
		System.out.println("=======================================");

		Class<?> clazz3 = new MemberVO().getClass();
		System.out.println(clazz3.getName());
		System.out.println("=======================================");
		
		MemberVO vo = new MemberVO();
		clazz3 = vo.getClass();
		System.out.println(clazz3.getName());
		
		
		
		
	}//end main

}//end class
