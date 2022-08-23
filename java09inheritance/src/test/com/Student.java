package test.com;

public class Student extends Person {

	int num;
	String school_name;
	double weight = 100;
	
	public Student() {
		 super(10000); // 생략되어 있다. 무조건 첫번째 줄에 들어간다.
		System.out.println("Student()...");
		System.out.println(super.weight);  // 부모클래스에 있는 변수를 사용 super 생략가능
		System.out.println(this.weight);  // 본인클래스에 있는 변수를 사용
		super.sleep();  // 부모클래스에 있는 함수를 call
		this.sleep();
	}
	
	// 부모와 자식클래스에 같은 형식의 함수를 사용하는 것은
	// 슈퍼클래스 함수를 재정의 했다고 한다.(오버라이딩)
	@Override
	public void sleep() {
		System.out.println("Student sleep()...");
	}
	
	//함수의 변수를 넣어 주므로서 Student의 sleep이 된것이고
	//sleep이 두개 있는 것은 오버로딩이 된 것이다.
	public void sleep(int x) {
		System.out.println("Student sleep()...");
	}
	
	public void study() {
		System.out.println("study()...");
	}
	
	
	
	
	
}
