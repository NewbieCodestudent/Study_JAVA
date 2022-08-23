package test.com;

public class Test03Main_Member {

	public static void main(String[] args) {

		MemberDAOimpl daoimpl = new MemberDAOimpl();
		MemberVO vo = new MemberVO();
		daoimpl.insert(vo);
		System.out.println();
		
		daoimpl.update(vo);
		System.out.println();
		
		daoimpl.delete(vo);
		System.out.println();
		
		MemberVO[] vos = daoimpl.selectAll();
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		System.out.println();
		
		vo.setNum(4);
		daoimpl.selectOne(vo);
		System.out.println();
		
		vos = daoimpl.searchList("lee", "kim");
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		
	}// end main

}// end class
