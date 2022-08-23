package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02score_array {

	public static void main(String[] args) throws IOException {
		// 배열을 이용하여 성적처리 프로그램을 만들기
		// for을 이용
		// 최종 출력부분
		// 1 kim 99  88  77  264  88.0 B 
		// 2 lee 99  99  99  297  99.0 A 
		// 3 yang 77  77  77  231  77.0 C
		System.out.println("hello...");
		
		String[] result = new String[3];
		
		for (int i = 0; i < result.length; i++) {
			Reader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);

			System.out.println((i+1) + "번 학생의 이름을 입력해 주세요.");
			String name = br.readLine();

			System.out.println((i+1) + "번 학생의 국어점수를 입력해주세요.");
			String kor = br.readLine();

			System.out.println((i+1) + "번 학생의 영어점수를 입력해주세요.");
			String eng = br.readLine();

			System.out.println((i+1) + "번 학생의 수학점수를 입력해주세요.");
			String math = br.readLine();

			int total = (Integer.parseInt(math)) + (Integer.parseInt(eng)) + (Integer.parseInt(kor));
			double avg = total / 3.0;
			String grade = " ";
			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			}
			result[i] = (i+1) + " " + name + " " + kor + " " + eng + " " + math + " " + total + " " + avg + " " + grade; 
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);		
		}
		
		System.out.println("====================");
		
		for (String x : result) {
			System.out.println(x);
		}
		

	}//end main

}//end class
