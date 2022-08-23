package test.com;

public class Test01array_main2 {

	public static void main(String[] args) {
		// 배열
		System.out.println("hello...array");
		
		// 2. 배열의 정적할당
		// 배열의 길이를 먼저 정의 >> 자독으로 기본값으로 채워줌
		int[] su = new int[] {};  // 배열의 내용 및 길이가 없음
		System.out.println("sus.length : " + su.length);  // 결과 0
		
		int[] sus = new int[5];  // 배열의 길이를 5개로 정해줌, 자동으로 기본값으로 채워짐
//		sus[0] = 100;
//		sus[1] = 1000;
//		sus[2] = 10000;
//		sus[3] = 100000;
//		sus[4] = 1000000;
		for (int i = 0; i < sus.length; i++) {
			sus[i] = (int)(10*Math.pow(10, i+1));
//			sus[i] = 100;
//			i = (i+1) * 10;
		}
		
		System.out.println("sus.length : " + sus.length);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}

		System.out.println("===============================");
		
		double[] ds = new double[5];
		for (int i = 0; i < ds.length; i++) {  // 배열에 값을 할당하는 할당식
			if(i%2==0) ds[i] = Math.PI;
		}
		for (int i = 0; i < ds.length; i++) {  // 배열의 정보를 출력하는 출력식
			System.out.println(ds[i]);
		} // 할당식과 출력식은 따로 분리하여 작성
		
		System.out.println("===============================");
		
		boolean[] bl = new boolean[5];
		System.out.println(bl);
		for (int i = 0; i < bl.length; i++) {
			bl[i] = true;
		}
		for (int j = 0; j < bl.length; j++) {
			System.out.println(bl[j]);
		}
		
		for (boolean b : bl) {
			System.out.println(b);
		}
				
		System.out.println("===============================");
		
		String[] name = new String[3];
		for (int i = 0; i < name.length; i++) {
			name[i] = "kim" + i;
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		for (String s : name) {
			System.out.println(s);
		}
		
//		String[][] namess = new String[2][];
//		System.out.println(namess[0]);  // new를 안한 상태로 null 값이 들어간다.
//		for(String[] x : namess) {
//			for(String a : x) {
//				
//			}
//		}
		
		
	}//end main

}//end class
