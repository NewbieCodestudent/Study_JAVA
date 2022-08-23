package test.com;

public class MemberOuter {

	int su = 100;
	String name = "kim";

	public void test() {
		System.out.println("test()...");
//		System.out.println(new Inner().num);
	}
	
	public class Inner {
		// member inner class  bin폴더내에 $inner class로 파일이 생성된다.
		// inner class는 outer class의 자료를 가져다 쓸수 있지만
		// outer class는 inner class의 자료를 call하지 않으면 사용할 수 없다.
		int num = 99;
		String str = "Hello";
		public Inner() {
			System.out.println("MemberOuter Inner()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}
		public void sum() {
			System.out.println("sum()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}
	}

}
