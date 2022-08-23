package homework.com;

public class CafeProcess {
	
	public int insert(CafeMenuVO cm) {
		System.out.print("insert : ");
		System.out.println(cm);
		return 0;
	}
	
	public int update(CafeMenuVO cm) {
		System.out.print("insert : ");
		System.out.println(cm);
		return 3;
	}
	
	public CafeMenuVO[] selectAll(CafeMenuVO cm) {
		System.out.print("selectAll : ");
		System.out.println(cm);
		return new CafeMenuVO[] {new CafeMenuVO()};
	}
	
}
