package test.com;

public class Test04multi_array2 {

	public static void main(String[] args) {
		// 다중배열, 다차원배열... 
		System.out.println("hello multi array");
		
		//1. 동적배열
		int[][] suss = new int[][] {new int[] {11, 22, 33}, new int[] {44, 55, 66, 77}};
		System.out.println("suss.length : " + suss.length);
		System.out.println("suss.length : " + suss[0].length);
		System.out.println("suss.length : " + suss[1].length);
		System.out.print(suss[0][0] + " ");
		System.out.print(suss[0][1] + " ");
		System.out.println(suss[0][2]);
		System.out.print(suss[1][0] + " ");
		System.out.print(suss[1][1] + " ");
		System.out.print(suss[1][2] + " ");
		System.out.println(suss[1][3]);
		System.out.println("===============================");
		
		for (int i = 0; i < suss.length; i++) {
			System.out.println(suss[i]);  // suss[0], [1]의 주소 출력
		}
		for (int i = 0; i < suss[0].length; i++) {
			System.out.print(suss[0][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < suss[1].length; i++) {
			System.out.print(suss[1][i] + " ");
		}
		System.out.println();
		System.out.println("===============================");
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i] + " ");
			}
			System.out.println();
		}
		System.out.println("===============================");
		
		String[][] strss = new String[][] {new String[] {}, new String[] {}};
		
		strss = new String[][] {new String[] {"kim", "lee"}, new String[] {"kim11", "lee22"}, new String[] {"kosta", "golfzon", "ori"}};

		System.out.println("strss.length : " + strss.length);
		
		//for~for 출력
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i] + " ");
			}
			System.out.println();
		}
		System.out.println("===============================");

		//foreach
		for (String[] x : strss) {   // 작은 그룹의 배열 + 변수이름 설정 : 큰그룹(배열)의 변수이름
			for (String i : x) {     // 더 작은 그룸의 배열 + 변수이름 설정 : 작은 그룹의 변수이름
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("===============================");

		// 참조타입의 비교
		// 주소만 비교할 것인지 내용도 비교할 것인지
		
		String x = new String("kim");
		String y = new String("kim");
		System.out.println(x==y);
		// false가 나오는 이유는 ==는 문자 자체로 입력하면 문자로 비교하지만 주소를 할당하면 주소로 비교하기 때문에 false가 나온다.
		// 자바에는 주소가 달라도 안의 값이 같으면 같다고 해주는 기능이 있다. (생성자 파트에서 배울 예정)
		//  → 우클릭 후 source에서 Generate hashCode() and equals를 설정해 주면 주소가 달라고 글자가 같은면 같다고 인식한다.
		System.out.println(x.equals(y));
		// ★문자열의 비교는 equals로 하여 비교★
		System.out.println(x.compareTo(y));
		// compareTo는 true이면 0, false면 1로 나온다. : 두 문자의 해시코드를 서로 빼서 계산하기 때문에 같으면 0이 나오는 것이다.
		
		
		
		
		

	}//end main

}//end class
