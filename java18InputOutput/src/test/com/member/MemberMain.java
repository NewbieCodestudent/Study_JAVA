package test.com.member;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello Member....");
		
		MemberDAO dao = new MemberDAOimpl();
		
		MemberVO vo = new MemberVO();
		vo.setId("admin1");
		vo.setPw("hi123451");
		vo.setName("kim1");
		vo.setTel("021");
		
		int result = dao.insert(vo);
		System.out.println("result:"+result);
		
		vo = new MemberVO();
		vo.setId("admin1");
		vo.setPw("hi123451");
		vo.setName("kim1");
		vo.setTel("021");
		result = dao.insert(vo);
		System.out.println("result:"+result);
		
		vo = new MemberVO();
		vo.setId("admin1");
		vo.setPw("hi123451");
		vo.setName("kim1");
		vo.setTel("021");
		result = dao.insert(vo);
		System.out.println("result:"+result);

		vo = new MemberVO();
		vo.setId("admin99");
		vo.setPw("hi123499");
		vo.setName("kim99");
		vo.setTel("0299");
		vo.setNum(2);
		result = dao.update(vo);
		System.out.println("result:"+result);//1
		
		vo = new MemberVO();
		vo.setNum(3);
//		vo.setId("admin88");
		result = dao.delete(vo);
		System.out.println("result:"+result);//1
		
		List<MemberVO> vos = dao.selectAll();
		//for~
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		
		vo.setNum(77);
		MemberVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		List<MemberVO> vos2 = dao.searchList("name","ki");
//		List<MemberVO> vos2 = dao.searchList("tel","010");
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
		
	}//end main

}//end class
