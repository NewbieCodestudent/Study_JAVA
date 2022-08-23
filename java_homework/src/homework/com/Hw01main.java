package homework.com;

public class Hw01main {

	public static void main(String[] args) {
		// Class #1 cafe menu
		CafeMenuVO cm = new CafeMenuVO();
		System.out.println(cm);
		
		cm = new CafeMenuVO(2, "cafeMocha", 4500, "hot", "takeWay");
		System.out.println(cm);
		
		cm = new CafeMenuVO(3, "cafeLatte", 3500, "ice", "takeWay");
		System.out.print(cm.getOrder() + " ");
		System.out.print(cm.getMenu() + " ");
		System.out.print(cm.getPrice() + " ");
		System.out.print(cm.getTem() + " ");
		System.out.println(cm.getPack() + " ");
		System.out.println("==============================================================");
		
		// Class #2 bookstore
		BookVO bs = new BookVO();
		System.out.println(bs);
		
		bs = new BookVO("java", 30000, "james", "amazom", "1991년");
		System.out.println(bs);
		
		bs = new BookVO("home", 50000, "kim", "suwon", "2022년 7월 30일");
		System.out.print(bs.getName() + " ");
		System.out.print(bs.getPrice() + " ");
		System.out.print(bs.getWriter() + " ");
		System.out.print(bs.getCo() + " ");
		System.out.println(bs.getDate() + " ");
		System.out.println("==============================================================");
		
		// Class #3 clothes
		ClothesVO clo = new ClothesVO();
		System.out.println(clo);
		
		clo = new ClothesVO("top10", "pants", "blue", 15000, "2021.12.31");
		System.out.println(clo);
		
		clo = new ClothesVO("nike", "top", "green", 30000, "2022.1.15");
		System.out.print(clo.getBrand() + " ");
		System.out.print(clo.getKind() + " ");
		System.out.print(clo.getColor() + " ");
		System.out.print(clo.getPrice() + " ");
		System.out.println(clo.getDate() + " ");
		System.out.println("==============================================================");

	}

}
