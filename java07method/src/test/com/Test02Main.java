package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bus");
		Test02Bus bus = new Test02Bus();
		
		//start1 x x
		bus.start1();
		
		//start2 x o
		int[] sus = bus.start2();
		for (int i = 0; i < sus.length; i++) {
			System.out.print(sus[i] + " ");
		}
		System.out.println();
		
		//start3 o x
		bus.start3(new String[] {"aaa", "bbb", "ccc"});
		System.out.println();
		
		//start4 o o
		Car[] cars = bus.start4(new Car());
		for (Car car : cars) {
			System.out.println(car);
		}
		
		// 매개변수의 개수를 모를 경우 ... 를 이용하는 방법
		bus.start5(11, 22, 33, 44);
		bus.start5(new int[] {55, 66, 77});
		System.out.println();
		
		int buss = bus.start6(11, 22, 33, 44);
		System.out.println(buss);
		buss = bus.start6(new int[] {55, 66, 77});
		System.out.println(buss);
		

	}//end main

}//end class
