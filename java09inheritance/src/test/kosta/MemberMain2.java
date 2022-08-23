package test.kosta;

public class MemberMain2 {

	public static void main(String[] args) {
		System.out.println("Hello abstract...");
		
		MemberDAO dao = new MemberDAOex();
		// abstract class에 ex를 붙이고 class를 생성하면 MemverDAO를
		// 상속하는 class를 자동으로 설정하여 준다.
		dao.insert(new MemberVO());
		System.out.println();
		
		dao.update(new MemberVO());
		System.out.println();

		dao.delete(new MemberVO());
		System.out.println();
		
		MemberVO[] vos = dao.selectAll();
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		System.out.println();
		
		MemberVO vo = dao.selectOne(new MemberVO());
		System.out.println(vo);
		
		vos = dao.searchList("kim", "lee");
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		
		
	}//end main

}//end class
