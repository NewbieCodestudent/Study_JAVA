package test.com;

public class Test03Math {

	public static void main(String[] args) {
		System.out.println("Hell Math...");

		// Math.random() : 0~1사이의 실수를 랜덤으로 반환
		System.out.println(Math.random());

		// .PI : PI값을 출력
		System.out.println(Math.PI);

		// .round : 소수점을 반올림
		System.out.println(Math.round(1.1));
		System.out.println(Math.round(1.5));

		// .abs : 절대값
		System.out.println(Math.abs(-88));

		// .ceil : 소수점을 올림
		System.out.println(Math.ceil(1.1));

		// .floor : 소수점을 내림
		System.out.println(Math.floor(1.9));

		// .min : 두개의 값중 작은 값 출력
		System.out.println(Math.min(1.11, 2.22));

		// .max : 두개의 값중 큰 값 출력
		System.out.println(Math.max(1.11, 2.22));

		// .sqrt : 제곱근을 계산
		System.out.println(Math.sqrt(25));

		// .pow : 제곱을 계산
		System.out.println(Math.pow(5, 2));
		
	}// end main

}// end class
