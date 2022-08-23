package test.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test04ObjectInputStream {

	public static void main(String[] args) {
		System.out.println("Hello ObjectOutputStream");

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("C:\\golfzon\\javaStudy\\java18InputOutput\\test.db");
			ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<TestVO> vos = (List<TestVO>) ois.readObject();
			for (TestVO x : vos) {
				System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}// end main

}// end class