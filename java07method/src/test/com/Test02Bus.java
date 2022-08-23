package test.com;

public class Test02Bus {

	//start1 x x
	public void start1() {
		System.out.println("start1 : ");
		return;
	}
	
	//start2 x o
	public int[] start2() {
		System.out.print("start2 : ");
		return new int[] {11, 22, 33};
	}
	
	//start3 o x
	public void start3(String[] names) {
		System.out.print("start3 : ");
		for (String name : names) {
			System.out.print(name + " ");
		}
		return;
	}
	
	//start4 o o
	public Car[] start4(Car car) {
		System.out.println("start4 : ");
		System.out.println(car);
		return new Car[] {new Car(), new Car()};
	}
	
	// 매개변수의 개수를 모를 경우 ... 사용
	public void start5(int ... sus) { // ... 으로 sus는 배열로 인식이 되고 Main에서 입력해 주는 값 만큼 배열이 늘어난다.
		System.out.print("start5 : ");
		for (int i : sus) {
			System.out.print(i + " ");
			if(i==66)return;
		}
		System.out.println("end start5");
	}
	
	public int start6(int ... sus) { // ... 으로 sus는 배열로 인식이 되고 Main에서 입력해 주는 값 만큼 배열이 늘어난다.
		System.out.print("start6 : ");
		for (int i : sus) {
			System.out.print(i + " ");
			if(i==66)return 99;
		}
		System.out.print("end start6 : ");
		return 00;
	}
	
	public int start6(String[] ... sus) {
		System.out.print("start6 : ");
		System.out.print("end start6 : ");
		return 00;
	}
	
	public int start6(int x, int y) { // 메소드 오버로딩 : 같은 이름으로 쓰고 싶을 때는 안에 있는 타입이나 갯수를 변경해 주면 사용가능하다.
		System.out.print("start6 : ");
		System.out.print("end start6 : ");
		return 00;
	}
		
}
