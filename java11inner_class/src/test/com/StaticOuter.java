package test.com;

public class StaticOuter {

	static int su = 1000;
	static String name = "kim00";

	public void test() {
		System.out.println("StaticOuter test()...");
	}

	public static class Inner_static { // static 클래스가 내부 inner class로 위치
		int num = 99;
		static String str = "Hello";

		public Inner_static() {
			System.out.println("StaticOuter Inner()...");
			System.out.println(su);
			System.out.println(name);
		}

		public static void sum() {
			System.out.println("sum()...");
			System.out.println(su);
			System.out.println(name);
		}
		public void plus() {
			System.out.println("plus()...");
		}
	}

}
