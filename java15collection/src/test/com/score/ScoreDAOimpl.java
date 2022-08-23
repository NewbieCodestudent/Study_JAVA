package test.com.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {

	@Override
	public int insert(ScoreVO vo) {
		System.out.println("inset");
		return 0;
	}

	@Override
	public int update(ScoreVO vo) {
		System.out.println("update");
		return 1;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete");
		return 2;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne");
		return vo;
	}

	@Override
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll");
		List<ScoreVO> list = new ArrayList<ScoreVO>();
		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(i);
			vo.setName("kim" + i);
			vo.setKor(90 + i);
			vo.setEng(80 + i);
			vo.setMath(70 + i);
			vo.setTotal(90+80+70+i*3);
			list.add(vo);
		}
		return list;
	}

	@Override
	public List<ScoreVO> searchList(String x, String y) {
		System.out.println("searchList");
		System.out.println(x);
		System.out.println(y);
		List<ScoreVO> list = new ArrayList<ScoreVO>();
		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			list.add(vo);
		}
		return list;
	}

}
