package test.com;

public class MemberProcess {

	public int insert(MemberVO vo) {
		// TODO Auto-generated method stub
		System.out.print("insert : ");
		System.out.println(vo);
		return 0;
	}

	public int update(MemberVO vo) {
		System.out.print("update : ");
		System.out.println(vo);
		return 1;
	}

	public int delete(MemberVO vo) {
		System.out.print("delete : ");
		System.out.println(vo);
		return 2;
	}

	public MemberVO[] selectAll() {
		System.out.print("selectAll : ");
		
		MemberVO[] vos = new MemberVO[3];
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i+1);
			vo.setId("admin" + (i+1));
			vo.setPw("hi" + (i+1));
			vo.setName("kim" + (i+1));
			vo.setTel("0" + (i+1));
			vos[i] = vo;
		}
		return vos;
	}

	public MemberVO selectOne(MemberVO vo) {
		System.out.print("selectOne : ");
		System.out.println(vo);
		
		MemberVO vo2 = new MemberVO();
		vo2.setNum(77);
		vo2.setId("admin77");
		vo2.setPw("hi77");
		vo2.setName("kim77");
		vo2.setTel("077");
		
		return vo2;
	}

	public MemberVO[] searchList(String serchKey, String serchWord) {
		System.out.print("searchList : ");
		System.out.print(serchKey + " ");
		System.out.println(serchWord);
		
		MemberVO[] vos = new MemberVO[4];
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(55+i);
			vo.setId("admin55" + i);
			vo.setPw("hi55" + i);
			vo.setName("kim55" + i);
			vo.setTel("055" + i);
			vos[i] = vo;
		}
		
		return vos;
	}

	
	

}
