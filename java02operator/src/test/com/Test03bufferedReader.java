package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03bufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("Input your name");
		
		// console text input 하기
		
		//2. java.io.BufferedReader
		Reader r = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);
		
		String name = br.readLine(); // 오류가 나오면 add throws로 class 함수로 처리 넘김 
		System.out.println("name : " + name);
		
		System.out.println("Input your kor");
		String kor = br.readLine();  // 입력받은 내용을 String의 형태의 kor을 초기화
		System.out.println("kor : " + kor);
		
		System.out.println("Input your eng");
		String eng = br.readLine(); 
		System.out.println("eng : " + eng);

		System.out.println("Input your math");
		String math = br.readLine(); 
		System.out.println("math : " + math);
		System.out.println();
//		System.out.printf("math : %s\n", math);  printf를 이용한 한줄 띄우는 형태

		
		Double total = (Double.parseDouble(math)) + (Double.parseDouble(eng)) + (Double.parseDouble(kor));
		System.out.println("total : " + total);
		Double avg = total / 3;
		System.out.printf("avg : %.1f\n", avg);
//		String grade = (avg >= 90) ? "A" : (avg >= 80) ? "B" : (avg >= 70) ? "C" : "D";
		
		String grade = "";  
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("grade : " + grade);
		
		//수학 math : String
		//평균 avg : Double
		//등급 grade : String : 삼항연산자 - A B C D
		
		br.close();
		r.close();
				
		
	}//end main

}//end class
