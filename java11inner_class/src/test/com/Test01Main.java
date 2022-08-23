package test.com;

import test.com.MemberOuter.Inner;
import test.com.StaticOuter.Inner_static;

public class Test01Main {

	int i = 1010;
	
	public static void main(String[] args) {
		System.out.println("Hello inner class");
		// 4종류의 class

		// 1.member inner 클래스 안에 클래스가 있는 상태
		MemberOuter outer = new MemberOuter();
		outer.test();
		Inner inner = outer.new Inner(); // inner는 MemberOuter의 inner이기 때문에 outer. 으로 call해야 한다.
		inner.sum();
		System.out.println("===============================");

		// 2.static inner 클래스 안에 static 클래스가 있는 상태
		System.out.println(Inner_static.str);
		// test.com.StaticOuter.Inner_static.str 주소로 call 하거나 import로 불러와야 한다.
		// Inner 라는 import 영역이 비슷한 이름으로 두개를 import하면 오류가 나기 때문에 하나의 이름을 바꾸어 주어야 한다.
		Inner_static.sum();
		new StaticOuter.Inner_static().plus();
		System.out.println("===============================");
		
		// 3.local inner 매소드 블럭안에 클래스가 있는 상태
		/* final */ int su = 100;  // inner 클래스에서 사용하면
		String name = "kim";       // final은 생략되어 있지만 선언되어 있는 상태
		
		@SuppressWarnings("unused") // Inner_local 클래스를 따로 사용하지 않을 경우 선언하여 오류 제거
		class Inner_local {
			int num = 99;
			String str = "Hello";

			public Inner_local() {
				System.out.println("Inner_local()...");
				System.out.println(su);  // inner class에서 local 또는 전역변수를 사용하면 상수변수로 선언해야 한다.
				System.out.println(name);
				Test01Main t = new Test01Main();
				System.out.println(t.i);
			}

			public void minus() {
				System.out.println("minus()...");
			}
		}// end Inner_local class
		Inner_local local = new Inner_local();
		local.minus();
		System.out.println("===============================");

		// 4.anonymous inner 클래스 안에 이름없는 클래스가 있는 상태
		Mother m = new Mother() {
			double d = Math.PI * 10000;
			@Override
			public void play() {
				System.out.println(su);
				System.out.println(d);
			}
		};
		m.play();

	}// end main

}// end class
