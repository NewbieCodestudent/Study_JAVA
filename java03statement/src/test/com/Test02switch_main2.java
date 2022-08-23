package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02switch_main2 {

	public static void main(String[] args) throws IOException {
		// switch~case~break
		System.out.println("hello switch");

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		String name = br.readLine();
		System.out.println("name : " + name);

		System.out.println("Input your kor");
		String kor = br.readLine();
		System.out.println("kor : " + kor);

		System.out.println("Input your eng");
		String eng = br.readLine();
		System.out.println("kor : " + eng);

		System.out.println("Input your math");
		String math = br.readLine();
		System.out.println("kor : " + math);

		int total = (Integer.parseInt(math)) + (Integer.parseInt(eng)) + (Integer.parseInt(kor));
		System.out.println("total : " + total);
		double avg = total / 3.0;
		System.out.println("avg : " + avg);

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
		System.out.println("grade : " + grade);

	}// end main

}// end class
