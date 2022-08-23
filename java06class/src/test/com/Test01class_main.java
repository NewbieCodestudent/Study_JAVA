package test.com;

public class Test01class_main {

	public static void main(String[] args) {
		// 객체를 생성(속성을 초기화할 값을 넣을 수 있다.)하고 사용하는 함수.
		String name = new String("kim");
//		 ↓
//		String name = ("kim"); 이렇게 생략해서 사용
		System.out.println(name.length());  // String의 length에는 ()가 붙는다.
		
		
//		Score라는 class에서 s라는 변수를 선언하고 Score class에서 정보를 가져온다.
		Score s = new Score();  // ();는 불러온다는 것. 이후 s라는 변수에 그 값을 할당한다.
								// 불어온 Class에 Ctrl 클릭 후 Open Declaration을 누르면 해당 코딩이 있는 곳으로 이동한다.
//		System.out.println(s);
		s.num = 1;
		s.name = "kim";
		s.kor = 99;
		s.eng = 88;
		s.math = 77;
//		서로 다른 탑입을 모으기 위해서 Score라는 Class로 만들어서 사용
		
		System.out.println(s.num);
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
		
		
	}//end main

}//end class
