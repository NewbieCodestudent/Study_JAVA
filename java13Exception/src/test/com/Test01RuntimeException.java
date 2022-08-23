package test.com;

public class Test01RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hello Exception");

		// 1. NullPointerExcaption
		String data = "";
		System.out.println(data.length());
		data = test();
		if (data != null) {
			System.out.println(data.length());
		}
		System.out.println("==========================");

		data = test();
		try {
			System.out.println("1");
			System.out.println("data.length() : " + data.length());  // 오류 확인시 아래 라인은 동작하지 않고 catch로 이동
			System.out.println("2");
		} catch (NullPointerException e) {
			System.out.println("3");
			System.out.println("1. NullPointerException1");
			data = "";
		}
		System.out.println("==========================");
		data = test();
		try {
			System.out.println("1");
//			System.out.println(data.length());
			System.out.println("2");
		} catch (NullPointerException e) {
			System.out.println("3");
			System.out.println("1. NullPointerException2");
		} finally { // try, catch에 상관없이 반드시 실행해야 하는 것을 입력
			System.out.println("4");
			data = "";
		}
		System.out.println("==========================");
//		if(data.length()>0)System.out.println(data.length());
		try {
			System.out.println(data.charAt(0));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
			data = "abc";
			System.out.println(data.charAt(0));
		}
		System.out.println("==========================");
		

		// 2. ArrayIndexOutOfBoundsException
		int[] sus = new int[3]; // 0,0,0
		try {
			System.out.println(sus[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2. ArrayIndexOutOfBoundsException");
			System.out.println(sus[sus.length-1]);
		}
		System.out.println("==========================");

		// 3. NumberFormatException
		String su = "l00";
		try {
			System.out.println(Integer.parseInt(su) + 100);
		} catch (NumberFormatException e) {
			System.out.println("3. NumberFormatException");
			su = "0";
			System.out.println(Integer.parseInt(su) + 100);
		}
		System.out.println(Integer.parseInt(su) + 1000);
		System.out.println("==========================");
		
		// 4. ArithmeticException by zero exception  100/0 과 같은 상황
		int su2 = 0;
		try {
			su2 = 100/test2();
			System.out.println(su2);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		System.out.println("su2 : " + su2);
		System.out.println("==========================");
		
		// 5. ClassCastException
		Object obj = new Test01RuntimeException();
		if(obj instanceof String) {
			String str = (String)obj;
		}
		try {
			String str = (String)obj;
		} catch (ClassCastException e) {
			System.out.println("ClassCastException");
		}
		

		System.out.println("end main...");
	}// end main

	private static int test2() {
		return 0;
	}

	private static String test() {
		return null;
	}

}// end class
