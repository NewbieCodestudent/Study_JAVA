package test.com;

public class Test04multi_array4 {

	public static void main(String[] args) {
		// 다중배열, 다차원배열... 
		System.out.println("hello multi array");
		
		// 2.정적배열 (연습)
		String[][] strss = new String[2][3];
		
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				strss[x][i] = x + "행" + i + "열";
			}
		}
		
		System.out.println("strss.lengh : " + strss.length);
		
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i] + " ");
			}
			System.out.println();
		}
		
		

	}//end main

}//end class
