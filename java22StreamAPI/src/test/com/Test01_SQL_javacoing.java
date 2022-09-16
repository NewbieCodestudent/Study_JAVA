package test.com;

import java.util.Arrays;
import java.util.List;

public class Test01_SQL_javacoing {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		// SQL 질의문을 자바코딩으로 출력
		// SELECT name FROM customer WHERE name = "와일더";
		List<String> customer = Arrays.asList("kim","lee","와일더","yang","kam","와일더", "와일다", "와일드", "yakng");
		
		// 1. "와일더"이름을 찾고 출력하기
			for (String x : customer) {
				if (x == "와일더") {
					System.out.print(x+" ");
				}
			}
			System.out.println();
			
			for (int i = 0; i < customer.size(); i++) {
				if(customer.get(i).equals("와일더")) {
					System.out.print(customer.get(i)+" ");
				}
			}
			System.out.println();
		
		// 2. 이름에 "일"이 들어간 사람 찾기
			for (int i = 0; i < customer.size(); i++) {
				if(customer.get(i).contains("일")) {
					System.out.print(customer.get(i)+" ");
				}
			}
			System.out.println();
			
		// 3. 이름이 "k"로 시작하는 사람찾기
			for (int i = 0; i < customer.size(); i++) {
				if(customer.get(i).startsWith("k")) {
				System.out.print(customer.get(i)+" ");
				}
			}
			System.out.println();
		
		
		// 4. 와일더는 몇명?
			int y =0;
			for (String x : customer) {
				if (x == "와일더") {
					y++;
				}
			}
			System.out.println("와일더는 " + y + "명");
			
			int count = 0;
			for (int i = 0; i < customer.size(); i++) {
				if(customer.get(i).equals("와일더")) {
					count++;
				}
			}
			System.out.println("와일더는 " + count + "명");
		
		
		
		

		
		
		
		
	}
}