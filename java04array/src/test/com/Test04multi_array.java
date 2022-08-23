package test.com;

public class Test04multi_array {

	public static void main(String[] args) {
		// 다중배열, 다차원배열... 
		System.out.println("hello multi array");
		
		//1. 동적배열
		int s = 101;
		int s2 = 202;
		int[] su = new int[] {s, s2};
		int[][] sus = new int[][] {su, su}; 
		System.out.println("su.length : " + su.length);
		System.out.print(su[0] + " ");
		System.out.println(su[1]);
		System.out.println("sus.length : " + sus.length);
		System.out.print(sus[0][0] + " ");
		System.out.println(sus[0][1]);
		System.out.print(sus[1][0] + " ");
		System.out.println(sus[1][1]);
		System.out.println();
		

	}//end main

}//end class
