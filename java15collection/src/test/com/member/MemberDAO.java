package test.com.member;

import java.util.List;

public interface MemberDAO {

	public int insert(MemberVO vo);

	public int update(MemberVO vo);

	public int delete(MemberVO vo);

	public List<MemberVO> selectAll();  // Array에 의한 것으로 변경

	public MemberVO selectOne(MemberVO vo);

	public List<MemberVO> searchList(String x, String y);   // Array에 의한 것으로 변경

}
