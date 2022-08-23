package test.com.member_me;

import java.util.List;

public interface MemberDAO {

	public String insert();

	public void update();

	public void delete();

	public void selectAll();  // Array에 의한 것으로 변경

	public void selectOne();

	public List<MemberVO> searchList(String x, String y);   // Array에 의한 것으로 변경

}
