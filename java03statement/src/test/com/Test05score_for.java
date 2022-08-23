package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test05score_for {

	public static void main(String[] args) throws IOException {
		// switch~case~break
		System.out.println("hello for문 3명 성적처리");

		// 출력 목표
		// 1번 학생의 이름을 입력하세요.
		// 1번 학생의 국어점수을 입력하세요.
		// 1번 학생의 영어점수을 입력하세요.
		// 1번 학생의 수학점수을 입력하세요.
		
		// 1 kim 99  88  77  264  88.0 B 
		// 2 lee 99  99  99  297  99.0 A 
		// 3 yang 77  77  77  231  77.0 C 
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String result = "";
		
		for (int i = 0; i < 3; i++) {

			System.out.println((i+1) + "번 학생의 이름을 입력해 주세요.");
//			System.out.println(""+(i+1)+"번 학생의 이름을 입력해 주세요.");
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
//			System.out.println(name + " " + kor + " " + eng + " " + math  + " " + total + " " + avg  + " " + grade);
//			코딩을 테스트할때는 더미값을 변수에 지정해서 실행하여 오류가 발생하는지 검증
//			System.out.printf("%d %s %s %s %s %d %.2f %s\n", (i+1), name, kor, eng, math, total, avg, grade);
			
			// 결과값 누적을 위한 식, for문에 위에 변수값을 미리 지정
			result += (i+1) + " " + name + " " + kor + " " + eng + " " + math + " " + total + " " + avg + " " + grade;
			result += "\n";
		}
		System.out.println(result);
		
	}// end main

}// end class
