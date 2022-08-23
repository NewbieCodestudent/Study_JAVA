package test.kosta;

public abstract class MemberDAO {
	//abstract class는 문법에 abstract를 작성해 주어야 한다.

	public MemberDAO() {
		System.out.println("MemberDAO()...");
	}
	
	public abstract int insert(MemberVO vo);
	
	public abstract int update(MemberVO vo);
	
	public abstract int delete(MemberVO vo);
	
	public abstract MemberVO[] selectAll();
	
	public abstract MemberVO selectOne(MemberVO vo);
	
	public abstract MemberVO[] searchList(String x, String y);
	
//	public int insert(String vo); {  // 일반 매소드도 받지만 abstract 매소드도 받는다.
//		return 1;
//	}
	
	
}
