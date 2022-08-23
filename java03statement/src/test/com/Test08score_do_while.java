package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test08score_do_while {

	public static void main(String[] args) throws IOException {
		// 최종 출력부분
		// 입력 값
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
		String x = "y";
		boolean bool = true; 
		int i = 1;
		
		do {
			System.out.println(i + "번 학생의 이름을 입력해 주세요.");
			String name = br.readLine();
			
			System.out.println(i + "번 학생의 국어점수를 입력해주세요.");
			String kor = br.readLine();

			System.out.println(i + "번 학생의 영어점수를 입력해주세요.");
			String eng = br.readLine();

			System.out.println(i + "번 학생의 수학점수를 입력해주세요.");
			String math = br.readLine();

			int total = (Integer.parseInt(math)) + (Integer.parseInt(eng)) + (Integer.parseInt(kor));
			double avg = total / 3.0;
			String grade = " ";
			switch ((int) avg / 10) {
				case 10:	case 9:
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
			
				result += (i+1) + " " + name + " " + kor + " " + eng + " " + math + " " + total + " " + avg + " " + grade;
				result += "\n";

				i++;
				System.out.println("종료시 X를 입력 [계속하고 싶으면 아무키나 눌러주세요]");
				x = br.readLine();
				if(x.equals("x"))
					break;
		} while (bool);
		System.out.println(result);
		
	}//end main

}// end class