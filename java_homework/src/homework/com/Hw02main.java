package homework.com;

public class Hw02main {

	public static void main(String[] args) {
		// Book
		BookProcess bv = new BookProcess();
		
		int result1 = bv.insert(null);
		System.out.println("result : " + result1);
		
		result1 = bv.update(null);
		System.out.println("result : " + result1);
		
		BookVO[] bvs = bv.selectAll(null);
		//for
		for (BookVO x : bvs) {
			System.out.println(x);
		}
		
		// CafeMenu
		CafeProcess cm = new CafeProcess();
		
		int result2 = cm.insert(null);
		System.out.println("result : " + result2);

		result2 = bv.update(null);
		System.out.println("update : " + result2);
		
		CafeMenuVO[] cms = cm.selectAll(null);
		for (CafeMenuVO x : cms) {
			System.out.println(x);
		}
		
	}

}
