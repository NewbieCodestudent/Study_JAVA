package test.com;

import java.io.Serializable;

public class TestVO implements Serializable {
	// serializable를 상속하면 직렬화 객체를 사용할 수 있게 해준다.

	private int num;
	private String name;
	private int age;

	@Override
	public String toString() {
		return "TestVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
