package homework.com;

import java.util.Objects;

public class BookVO {
	// 책이름, 가격, 저자, 출판사, 출판일
	private String name;
	private int price;
	private String writer;
	private String co;
	private String date;
	
	public BookVO() {
		name = "code";
		price = 10000;
		writer = "kim";
		co = "kosta";
		date = "2022년 7월 25일";
	}

	// toString
	@Override
	public String toString() {
		return "BookStore [name=" + name + ", price=" + price + ", writer=" + writer + ", co=" + co + ", date=" + date
				+ "]";
	}

	public BookVO(String name, int price, String writer, String co, String date) {
		super();
		this.name = name;
		this.price = price;
		this.writer = writer;
		this.co = co;
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(co, date, name, price, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookVO other = (BookVO) obj;
		return Objects.equals(co, other.co) && Objects.equals(date, other.date) && Objects.equals(name, other.name)
				&& price == other.price && Objects.equals(writer, other.writer);
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
