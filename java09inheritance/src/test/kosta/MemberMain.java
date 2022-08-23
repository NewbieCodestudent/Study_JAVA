package test.kosta;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello member");
		
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPw("hi12345");
		vo.setName("kim");
		vo.setTel("02");
		
		MemberProcess mp = new MemberProcessex();
		int result = mp.insert(vo);
		System.out.println("result : " + result);
		
		vo.setNum(2);
		vo.setId("admin2");
		vo.setPw("hi000");
		vo.setName("Lee");
		vo.setTel("03");
		result = mp.update(vo);
		System.out.println("result : " + result);
		
		vo.setTel("00");
		result = mp.delete(vo);
		System.out.println("result : " + result);
		
		MemberVO[] vos = mp.selectAll();
		System.out.println(vos);
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		MemberVO vo2 = mp.selectOne(vo);
		System.out.println(vo2);
		
		MemberVO[] vos2 = mp.searchList("name", "ki");
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
		

	}//end main

	
}//end class