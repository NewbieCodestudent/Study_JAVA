package homework.com;

import java.util.Objects;

public class TestCafeVO {

	private TestStarbugs sb;
	private TestMegaCoffee mc;
	
	public TestCafeVO() {
		// TODO Auto-generated constructor stub
	}

	public TestCafeVO(TestStarbugs sb, TestMegaCoffee mc) {
		super();
		this.sb = sb;
		this.mc = mc;
	}

	public TestStarbugs getSb() {
		return sb;
	}

	public void setSb(TestStarbugs sb) {
		this.sb = sb;
	}

	public TestMegaCoffee getMc() {
		return mc;
	}

	public void setMc(TestMegaCoffee mc) {
		this.mc = mc;
	}

	@Override
	public String toString() {
		return "TestCafeVO [sb=" + sb + ", mc=" + mc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mc, sb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestCafeVO other = (TestCafeVO) obj;
		return Objects.equals(mc, other.mc) && Objects.equals(sb, other.sb);
	}
	
	
	
}
