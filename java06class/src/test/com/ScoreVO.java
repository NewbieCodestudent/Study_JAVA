package test.com;

import java.util.Objects;

public class ScoreVO {
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total = kor + eng + math;

	//매개변수가 없는 생성자 - 디폴트 생성자
	//생략가능
	public ScoreVO() {
		//test, 더미 값, 고정값을 넣을 때 사용
		num = 100;
		name = "yang";
		kor = 11;
		eng = 22;
		math = 33;
		total = kor + eng + math;
	}
	
	public ScoreVO(int num, String name, int kor, int eng, int math, int total) {  // 생성자
		System.out.println("ScoreVO");
		this.num = num;       // this.___ 을 하면 Main에서 입력한 값이 넘어와서 입력된다. 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}

	// 우클릭 Source > Constructor and feild 로 자동생성이 가능하다. 
//	public ScoreVO(int num, String name, int kor, int eng, int math, int total) {
//		super();
//		this.num = num;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.total = total;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(eng, kor, math, name, num, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreVO other = (ScoreVO) obj;
		return eng == other.eng && kor == other.kor && math == other.math && Objects.equals(name, other.name)
				&& num == other.num && total == other.total;
	}

	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + "]";
	}

	
	// 우클릭 > source > Generated getter and setter()을 누르고 Generate를 하면 다른
	// 다른 class에서 private 속성 값을 수정할 수 있다.	
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}
