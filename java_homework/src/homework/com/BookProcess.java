package homework.com;

public class BookProcess {

	public int insert(BookVO bv) {
		System.out.print("insert : ");
		System.out.println(bv);
		return 0;
	}
	
	public int update(BookVO bv) {
		System.out.print("update : ");
		System.out.println(bv);
		return 1;
	}
	
	public BookVO[] selectAll(BookVO bv1) {
		System.out.print("seletAll : ");
		System.out.println(bv1);
		return new BookVO[] {new BookVO()};
	}
	
	
}
