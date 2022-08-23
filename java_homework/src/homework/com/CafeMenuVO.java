package homework.com;

import java.util.Objects;

public class CafeMenuVO {
	// �ֹ���ȣ, �޴�, ����, �µ�(���̽�, ��), ����ũ�ƿ�
	private int order;
	private String menu;
	private int price;
	private String tem;

	private String pack;	
	
	public CafeMenuVO() {
		// �ۼ���
		order = 1;
		menu = "americano";
		price = 3000;
		tem = "ice";
		pack = "To-go";		
	}	
	
	
	// �Ű����� ����
	public CafeMenuVO(int order, String menu, int price, String tem, String pack) {
		this.order = order;
		this.menu = menu;
		this.price = price;
		this.tem = tem;
		this.pack = pack;
	}

	// toString
	@Override
	public String toString() {
		return "Cafe_menu [order=" + order + ", menu=" + menu + ", price=" + price + ", tem=" + tem + ", pack=" + pack
				+ "]";
	}
	
	// getter and setter
	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getTem() {
		return tem;
	}


	public void setTem(String tem) {
		this.tem = tem;
	}


	public String getPack() {
		return pack;
	}


	public void setPack(String pack) {
		this.pack = pack;
	}


	@Override
	public int hashCode() {
		return Objects.hash(menu, order, pack, price, tem);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CafeMenuVO other = (CafeMenuVO) obj;
		return Objects.equals(menu, other.menu) && order == other.order && Objects.equals(pack, other.pack)
				&& price == other.price && Objects.equals(tem, other.tem);
	}
	
	//������ Ŭ������ �ؽ��ڵ�
}
