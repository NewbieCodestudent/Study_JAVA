package test.com;

import java.util.Random;

public class Test06choice_name {

	public static void main(String[] args) {
		// 
		String[] names = new String[] {"신유수","이찬형","김예은","최진실","전판근", "오령기","이재석","이동훈","박지연","정상윤",
		"최한성","강경석","김민경","최수연","최유연","최현민","이주희","유창현","김연수","양성호"};
		// 이름은 5개 뽑아서 배열에 넣고 출력하기.
		// 중복허용
		
		String[] result = new String[5];
		
		for (int i = 0; i < 5; i++) {
			double num = Math.random();
			int x = (int)(num*20);
//			System.out.println(names[x]);
			result[i] = names[x];
		}
		
		for (String s : result) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		String[] choice_names = new String[5];
		
		Random randomObject = new Random(System.currentTimeMillis());
//		Random randomObject = new Random();    System.currentTimeMillis() 와 공백은 랜덤한 수를 출력
//		                                       ()안에 long 타입의 수를 넣으면 고정된 랜덤값을 출력 ex) 10L
		System.out.println(randomObject.nextInt(20));  // random 한 수를 뽑는 방법
				
		for (int i = 0; i < choice_names.length; i++) {
			// Math.random 활용방법
//			choice_names[i] = "양성호";
//			double nanSu = Math.random();
//			int ranSu = (int)(nanSu*20);
//			choice_names[i] = names[ranSu];
			// Random Class 사용방법
			choice_names[i] = names[randomObject.nextInt(20)];
		}
		
		for (String name : choice_names) {
			System.out.println(name);
		}		
		
	}//end main

}//end class
