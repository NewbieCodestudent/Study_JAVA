package test.com;

//import java.lang.Object; 자주 사용하기 때문에 생략

public class Person /* extends Object */{  // java의 최상위 클래스 Object(생략)

	double weight = 50;
	String address;
	
	public Person() {
		System.out.println("Person()...");
	}
	
	public Person(double weight) {
		System.out.println("Person(double weight)...");
		this.weight = weight;
	}
	
	public void sleep() {
		System.out.println("Person sleep()...");
	}
	
}
