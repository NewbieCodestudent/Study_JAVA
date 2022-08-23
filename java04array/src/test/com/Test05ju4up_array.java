package test.com;

public class Test05ju4up_array {

	public static void main(String[] args) {
		// 반복문을 사용해서 주사위를 굴리고
		// 5번 나온 결과를 배열에 저장 및 출력
		
		System.out.println("hello");
		
		// 주사위의 배열
		int[] result = new int[5];
		
		for (int i = 0; i < result.length; i++) {
			double ju4up = Math.random();
			int x = (int)(ju4up*6);
			int y = x + 1;
			result[i] = y;
		}
		for (int i : result) {
			System.out.println(i);
		}
		
		int[] sys = new int[5];
		for (int i = 0; i < 5; i++) {
			double nanSu = Math.random();
			int ranSu = (int)(nanSu*6);
			int ju4up = ranSu+1;
//			System.out.println(ju4up);
			sys[i] = ju4up;
			
		}
		
		for (int i : sys) {
			System.out.println(i);
		}
		
		
	}//end main

}//end class
