package test.kosta;

public class MemberDAOex extends MemberDAO {

	public MemberDAOex() {
		System.out.println("MemberDAOex()...");
	}
	
	@Override
	public int insert(MemberVO vo) {
		System.out.println("MemberDAOex insert");
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("MemberDAOex update");
		return 1;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("MemberDAOex delete");
		return 0;
	}

	@Override
	public MemberVO[] selectAll() {
		System.out.println("MemberDAOex selectAll()");
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
		System.out.println("MemberDAOex selectOne");
		MemberVO vo1 = new MemberVO();
		return vo1;
	}

	@Override
	public MemberVO[] searchList(String x, String y) {
		System.out.println("MemberDAOex searchList");
		System.out.println(x);
		System.out.println(y);
		
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

}