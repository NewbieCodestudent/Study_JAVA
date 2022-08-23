package test.com;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete");
		System.out.println(vo);
		return 0;
	}

	@Override
	public MemberVO[] selectAll() {
		System.out.println("selectAll");
		MemberVO[] vos = new MemberVO[3];
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setId("admin" + i);
			vo.setPw("qwer" + i);
			vo.setName("lee" + i);
			vo.setTel("010" + i);
			vos[i] = vo;
		}
		return vos;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne");
		System.out.println(vo);
		MemberVO vo1 = new MemberVO();
		return vo1;
	}

	@Override
	public MemberVO[] searchList(String x, String y) {
		System.out.println("searchList");
		System.out.println(x);
		System.out.println(y);
		
		MemberVO[] vos1 = new MemberVO[3];
		for (int i = 0; i < vos1.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i+1);
			vo.setId("qwer" + (i+1));
			vo.setPw("asdf" + (i+1));
			vo.setName("kim" + (i+1));
			vo.setTel("123" + (i+1));
			vos1[i] = vo;
		}
		return vos1;
	}
	
	
}
