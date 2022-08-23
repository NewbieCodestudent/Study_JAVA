package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test09member_main2 {

	public static void main(String[] args) throws IOException {
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("hello");
		boolean bool = true;
		
		int i = 0;
		String result = "";
		
		do {
			System.out.println("nem["+(i+1)+"] inpit id :");
			String id = "admin";
			
			System.out.println("nem["+(i+1)+"] inpit pw :");
			String pw = "hi1234";
			
			System.out.println("nem["+(i+1)+"] inpit name :");
			String name = "kim"; 
			
			System.out.println("nem["+(i+1)+"] inpit tel :");
			String tel = "010";
			
			result += "num["+(i+1)+"] "+id+" "+pw+" "+name+" "+tel ;
			result += "\n";
			
			System.out.println("종료시 [X] 계속하려면 [아무키] 눌러주세요.");
			String x = br.readLine();
			
			i++;
			if (x.equals("x")) {
				break;
			}
		} while (bool);
		
		System.out.println(result);
		System.out.println("end");

	}//end main

}//end class
