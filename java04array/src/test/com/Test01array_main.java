package test.com;

public class Test01array_main {

	//전역변수에서도 배열을 사용할 때는 항상 new 타입[] 를 생략하지 않고 작성하도록 연습한다. 
	int[] su = new int[] {0, 1, 2, 3, 4, 5};
	
	public Test01array_main() {
		su = new int[] {0, 1, 2, 3, 4, 5};
	}
	
	public static void main(String[] args) {
		// 배열
		System.out.println("hello...array");
		
		// 많은 변수를 사용해야 할 때 각 의미가 다를때는 변수를 다 지정해야 한다.
		String name = "kim";
		String user_name = "kim";
		String product_name = "ss_nb004";
		String model_name = "car_911";
		String store_name = "ms_app";
		
		// 변수가 동일한 종류가 많이 필요할 경우
		// 배열의 동적할당을 해준다.
		// 타입앞에 대괄호를 붙이고 변수에 중괄호를 써서 변수의 꾸러미를 설정할 수 있다.
		// 이러한 모양을 array라고 하며 각 타입에 따라 __array라고 한다.
		String[] namea = new String[]{"kim", "lee", "yang", null};  // 기본값 : null
                      	// 주소의 예 : name[0] name[1]...
		System.out.println(namea[0]);
				
		int[] su = new int[] {0, 1, 2, 3, 4, 5}; // 기본값 : 0
		System.out.println(su[3]);
		System.out.println(su.length);  // 배열의 길이를 알려주는 코드
		System.out.println(su[su.length-1]);  // 끝방에 있는 내용을 가져올때는 전체 방 갯수에 -1를 한다, 첫방이 0번방이기 때문
		
		double[] dd = new double[] {0.0, 0.1, 0.2}; // 기본값 : 0.0
		dd = new double[] {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8 ,0.9};
		for (int i = 0; i < dd.length; i++) {
			System.out.print(dd[i] + " ");
		}
		System.out.println();
				
		
		boolean[] bb = new boolean[] {true, false};  // 기본값 : false
		// new 타입[] 은 선언과 동시에 초기화 할때는 생략이 가능한다.
		
		bb = new boolean[] {true, true, false, false};
		// bb = {true, true}; 새롭게 할당해 줄때 new부분을 생략하면 오류가 난다.
		for (int i = 0; i < bb.length; i++) {
			System.out.print(bb[i] + " ");
		}
		System.out.println();
		
		
		Test01array_main[] tm = new Test01array_main[] {null, new Test01array_main()};
		// 주소를 할당한 곳에는 . 을 찍어서 추가적인 기능을 할 수 있다.
		// 주소가 할당되는 것은 참조타입 (첫글자가 대문자로 시작되는 class, 또는 new를 통해서 주소 할당가능.)
		int [] scores = new int [] {0, 0, 0, 0, 0};
		
		int [] scores2 = null; // 주소가 없다.
		scores2 = new int[] {11, 22, 33}; // 주소를 할당
		
		
		// 우리가 직접만든 클래스로 무엇을 넣어야 할지 정해지지 않았다.
		// 생성자를 통해서 내용을 만들어 주어야 한다. null은 빈공간이다.
		// {} 안에있는 내용들은 앞에 선언된 각 타입별로 저장되며 내용과 상관없이 각 타입에 맞는 용량의 크기만큼 저장된다.
		//  ex) int 1, int 10, int 555 모두 4byte의 용량을 가지고 저장되면 각 저장된 공간은 인덱스라고 한다.
		// String은 특수한 class로 ""의 내용을 넣을 수 있다.

	}//end main

}//end class
