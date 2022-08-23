package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test06while_main {

	public static void main(String[] args) throws IOException {
		// 반복문 while, do~while
		// while반복문 : 무한반복에서 특정 신호, 상황일때 그만하는 반복문
		// 특정 신호, 상황일때 break를 사용해서 종료
		// 특정 신호, 상항일때 continue를 사용해서 건너띄기
		System.out.println("hello...while");
		boolean bool = true;
		
		int i = 0;
		while (bool) { // while 의 ()값은 boolean값(true, false)이 와야한다.
			System.out.println("a" + i);
			
			
			i++;
						
			if(i > 10) break;
						
		}//end while
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String x = "y";
		while (bool) {
			// 성적처리로직 같은 수식이 들어오는 곳
			System.out.println("a" + x);
			
			System.out.println("종료시 X를 입력 [계속하고 싶으면 아무키나 눌러주세요]");
			x = br.readLine();
//			x = "x";
			
			if(x.equals("x")) break;  // x.equals 는 문자열을 비교해주는 코드
						
		}//end while
		
		System.out.println("end main...");
		
		
		
	}//end main

}//end class