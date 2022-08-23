package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03member_array {

	public static void main(String[] args) throws IOException {
		// 회원가입프로그램 do~while 에서 for + array로 전환
		System.out.println("hello");
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String result[] = new String[3];
		String x = "y";
		int num = 1;
		
		for (int i = 0; i < i+1; i++) {
			System.out.println("회원번호 "+num+"번 입니다.");
			System.out.println("id를 입력해 주세요.");
//			String id = br.readLine();
			String id = "admin";
			
			System.out.println("pw를 입력해 주세요.");
//			String pw = br.readLine();
			String pw = "hi1234";

			System.out.println("name를 입력해 주세요.");
//			String name = br.readLine();
			String name = "kim";

			System.out.println("tel를 입력해 주세요.");
//			String tel = br.readLine();
			String tel = "010";

			result[i] = num + " " + id + " " + pw + " " + name + " " + tel;
			
			num++;
			
			System.out.println("종료[X] 추가입력[Y]");
			x = br.readLine();
			
		}
		for (String s : result) {
			System.out.println(s);
		}
		
		
	}//end main

}//end class
