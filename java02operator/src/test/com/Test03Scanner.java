package test.com;

import java.util.Scanner;

public class Test03Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		// console text input 하기
		
		//1. java.util.Scanner
		Scanner s = new Scanner(System.in);  // ()안에 내용에 대해서 설정을 하지 않으면 오류가 난다.
			// 클래스의 이름과 동일하면서 ()가 붙으면 생성자 constructor = Scanner
			// 클래스의 이름과 동일하면서 소문자에 ()면 함수(method, function) = println
		String name = s.nextLine();
		int score = s.nextInt() + 100;
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		s.close(); // 함수의 종료 명령, 자바는 프로그램상으로 자동으로 종료해주는 기능이 있다.
		// Object o = new Object();  공백이 있기 때문에 오류가 나지않음.
		
		
		//2. java.io.BufferedReader
		
		
		
		
		
	}//end main

}//end class
