package test.com;

import java.util.Random;

public class Test04Random {

	public static void main(String[] args) {
		System.out.println("Hello Random...");
		
		Random ran = new Random();
		System.out.println(ran.nextInt()); // 4byte
		System.out.println(ran.nextDouble()); // 8byte
		System.out.println(ran.nextFloat());  // 4byte
		System.out.println(ran.nextLong());   // 8byte
		System.out.println(ran.nextBoolean());

		System.out.println(ran.nextInt(3));
		
	}//end main

}//end class