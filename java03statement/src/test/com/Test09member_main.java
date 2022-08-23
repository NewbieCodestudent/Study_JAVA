package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test09member_main {

	public static void main(String[] args) throws IOException {
		// 회원가입프로그램
		System.out.println("hello");
		//번호 num : int (자동번호)
		//아이디 id : String
		//비번 pw : String
		//이름 name : String
		//폰번 tel : String
		
		// 최중 출력부분 - do~while 이용할것.
		// 1 admin hi1234  kim  010 
		// 2 tester hi1234  kim  02 
		// 3 yang1004 hi1234  kim  031
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		boolean bool = true;
		String x = "y";
		String result = "";
		int num = 1;
		
		do {
			System.out.println("회원번호 "+num+"번 입니다.");
			System.out.println("id를 입력해 주세요.");
			String id = br.readLine();
//			String id = "a";
			
			System.out.println("pw를 입력해 주세요.");
			String pw = br.readLine();
//			String pw = "b";

			System.out.println("name를 입력해 주세요.");
			String name = br.readLine();
//			String name = "c";

			System.out.println("tel를 입력해 주세요.");
			String tel = br.readLine();
//			String tel = "d";

			result += num + " " + id + " " + pw + " " + name + " " + tel;
			result += "\n";
			
			num++;
			System.out.println("종료시 X를 입력 [계속하고 싶으면 아무키나 눌러주세요]");
			x = br.readLine();
			if(x.equals("x")) break;

		} while(bool); {
			System.out.println(result);
		}
		

	}//end main

}//end class
