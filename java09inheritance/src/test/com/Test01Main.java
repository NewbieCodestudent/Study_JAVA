package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello inheritance");
		
		// 상속
		// 1. 클래스 간의 상속(클래스는 단일상속만 가능)
		// ex1) Person ← Student
		Person p = new Person(1000);
		System.out.println(p.address);
		System.out.println(p.weight);
		p.sleep();
		System.out.println("=====================");

		Student s = new Student();
		System.out.println(s.address);
		System.out.println(s.weight);
		System.out.println(s.num);
		System.out.println(s.school_name);
		s.sleep();
		s.study();
		System.out.println("=====================");
		
		// 2. 인터페이스 간의 상속(인터페이스는 다중상속을 지원)
		// 3. 클래스와 인터페이스 간의 상속
		//     - 클래스는 인터페이스를 상속받을 수 있지만 인터페이스는 클래스를 상속받을 수 없다.
		
		
		
		
	}// end main

}// end class
