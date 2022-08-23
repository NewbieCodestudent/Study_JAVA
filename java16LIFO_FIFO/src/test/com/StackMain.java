package test.com;

import java.util.*;

public class StackMain {

	public static void main(String[] args) {
		System.out.println("Hello Stack");

		Stack<Coin> cs = new Stack<Coin>();

		for (int i = 0; i < 4; i++) {
			Coin c = new Coin();
			c.setValue(100 + i);
			cs.push(c);
		}
		
		System.out.println(cs.pop());   // 가장 마지막에 들어 간 값을 출력
		System.out.println("==================");

//		System.out.println(cs.peek());  // 뭐있나 보기
		
		for (Coin c : cs) {
			System.out.println(c);
		}
		
	}// end main

}// end class