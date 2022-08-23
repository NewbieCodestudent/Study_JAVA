package test.com.member;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAOimpl result = new MemberDAOimpl();
		MemberVO vo = new MemberVO();
		
		System.out.println(result.insert(vo));
		System.out.println();

		System.out.println(result.update(vo));
		System.out.println();

		System.out.println(result.delete(vo));
		System.out.println();
		
		for (MemberVO x : result.selectAll()) {
			System.out.println(x);
		}
		System.out.println();

		vo.setNum(3);
		System.out.println(result.selectOne(vo));
		System.out.println();
		
		for (MemberVO  x : result.searchList("kim", "lee")) {
			System.out.println(x);
		}
		System.out.println();
		
	}//end main

}//end class
