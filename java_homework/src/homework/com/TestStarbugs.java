package homework.com;

import java.util.Arrays;
import java.util.Objects;

public class TestStarbugs {
	private int num;
	private String location;
	private String ceo_name;
	private String[] menu = new String[3];  // {ice_coffee, hot_coffee}
	
	public TestStarbugs() {
		// TODO Auto-generated constructor stub
	}

	public TestStarbugs(int num, String location, String ceo_name, String[] menu) {
		super();
		this.num = num;
		this.location = location;
		this.ceo_name = ceo_name;
		this.menu = menu;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCeo_name() {
		return ceo_name;
	}

	public void setCeo_name(String ceo_name) {
		this.ceo_name = ceo_name;
	}

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Starbugs [num=" + num + ", location=" + location + ", ceo_name=" + ceo_name + ", menu="
				+ Arrays.toString(menu) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(menu);
		result = prime * result + Objects.hash(ceo_name, location, num);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestStarbugs other = (TestStarbugs) obj;
		return Objects.equals(ceo_name, other.ceo_name) && Objects.equals(location, other.location)
				&& Arrays.equals(menu, other.menu) && num == other.num;
	}
	
	
	
	
}
