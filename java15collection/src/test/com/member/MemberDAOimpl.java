package test.com.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert");
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update");
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete");
		return 0;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll");
		List<MemberVO> vos = new ArrayList<MemberVO>();
		MemberVO vo = new MemberVO();
		vos.add(vo);
		vos.add(vo);
//		for (MemberVO x : vos) {
//			System.out.println(x);
//		}
		return vos;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne");
		return new MemberVO();
	}

	@Override
	public List<MemberVO> searchList(String x, String y) {
		System.out.println("searchList");
		System.out.println(x);
		System.out.println(y);
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 3; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setName("kim" + i);
			vo.setId("admin" + i);
			vo.setPw("qwer" + i);
			vo.setTel("010-" + i);
			vos.add(vo);
		}
		return vos;
	}
	
}
