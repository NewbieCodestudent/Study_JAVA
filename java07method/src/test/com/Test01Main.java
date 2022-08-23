package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// 접근제한자 : public > protected > 안 적는것 > private
		System.out.println("Hello method");
		System.out.println(args);
		System.out.println(args.length);
		for (String x : args) {
			System.out.println(x);
		}
		
		// void : 반환값이 없다. 타입이 없다.
		// 함수에 S가 붙으면 class이름에 점이 붙어서 오고 S가 안 붙고 초록색만 있는 함수는 함수만 온다.
		System.out.println(System.currentTimeMillis());
//		return; // return은 생략되어 있다.
		
		// 1번 그림 (받는 것과 결과가 없다.)
		Test01Person p = new Test01Person();
		p.sleep1();
		
		// 2번 그림 (받는 것은 있으나 결과가 없다.)
		p.sleep2(30000000, "KN_K9");

		// 3번 그림 (받는 것은 없으나 결과가 있다.)
		int sleep_time = p.sleep3();
		System.out.println(sleep_time);
		
		// 4번 그림 (받는 것과 결과가 있다.)	
		String result = p.sleep4(3.14, 3);
		System.out.println(result);
		
		
	}//end main

}//end class
