package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02throws {

	public static void main(String[] args) /* throws IOException */ {
		// throws IOException : br.readLine(); 에서의 오류를 main으로 넘긴다.
		// throws 처리 : 예외전가
		// try ~ catch : 예외처리
		// TODO Auto-generated method stub
		System.out.println("Hello throws");

		InputStream is = null;
		Reader r = null;
		BufferedReader br = null;
		
		try {
			is = System.in;
			r = new InputStreamReader(is);
			System.out.println(Integer.parseInt("a"));	
			br = new BufferedReader(r);
			String txt = br.readLine();
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			if(br!=null)
				try {br.close();} catch (IOException e) {e.printStackTrace();}
				try {
					r.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
		}

		System.out.println("end main...");

	}// end main

}// end class
