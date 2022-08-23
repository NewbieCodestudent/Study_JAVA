package test.com;

import java.util.Objects;

public class CMS {
	// Car Member Score

	private Car car;
	private MemberVO member;
	private ScoreVO score;

	public CMS() {
		car = new Car();
		member = new MemberVO();
		score = new ScoreVO();
	}

	public CMS(Car car, MemberVO member, ScoreVO score) {
		super();
		this.car = car;
		this.member = member;
		this.score = score;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}

	public ScoreVO getScore() {
		return score;
	}

	public void setScore(ScoreVO score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "CMS [car=" + car + ", member=" + member + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(car, member, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMS other = (CMS) obj;
		return Objects.equals(car, other.car) && Objects.equals(member, other.member)
				&& Objects.equals(score, other.score);
	}

}
