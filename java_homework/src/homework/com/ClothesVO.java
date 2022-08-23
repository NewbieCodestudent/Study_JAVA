package homework.com;

import java.util.Objects;

public class ClothesVO {
	// 브랜드, 종류(상의, 하의), 색, 가격, 구입일
	private String brand;
	private String kind;
	private String color;
	private int price;
	private String date;
	
	
	public ClothesVO() {
		brand = "uniqlo";
		kind = 	"top";
		color = "black";
		price = 25000;
		date = "2022.3.1";
	}

	
	public ClothesVO(String brand, String kind, String color, int price, String date) {
		super();
		this.brand = brand;
		this.kind = kind;
		this.color = color;
		this.price = price;
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Clothes [brand=" + brand + ", kind=" + kind + ", color=" + color + ", price=" + price + ", date=" + date
				+ "]";
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public int hashCode() {
		return Objects.hash(brand, color, date, kind, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClothesVO other = (ClothesVO) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(date, other.date) && Objects.equals(kind, other.kind) && price == other.price;
	}
	
	
	
}