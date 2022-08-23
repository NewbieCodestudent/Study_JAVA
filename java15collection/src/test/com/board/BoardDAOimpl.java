package test.com.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAOimpl implements BoardDAO {

	@Override
	public int input(BoardVO vo) {
		System.out.println("input");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("update");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("delete");
		System.out.println(vo);
		return 2;
	}

	@Override
	public BoardVO searchOne(BoardVO vo) {
		System.out.println("searchOne");
		return vo;
	}

	@Override
	public List<BoardVO> searchAll() {
		System.out.println("searchAll");
		List<BoardVO> list = new ArrayList<BoardVO>();
		for (int i = 0; i < 3; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i+1);
			vo.setTitle("title" + (i+1));
			vo.setContent("java" + (i+1));
			vo.setWriter("lee" + (i+1));
			list.add(vo);
		}
		return list;
	}

	@Override
	public List<BoardVO> searchList(String title_name, String content_name, String writer_name) {
		System.out.println("searchList");
		List<BoardVO> list = new ArrayList<BoardVO>();
		for (int i = 0; i < 3; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i+1);
			vo.setTitle(title_name + (i+1));
			vo.setContent(content_name + (i+1));
			vo.setWriter(writer_name + (i+1));
			list.add(vo);
		}
		return list;
	}

	@Override
	public Map<Integer, BoardVO> test() {
		System.out.println("test");
		Map<Integer, BoardVO> m = new HashMap<Integer, BoardVO>();
		for (int i = 0; i < 4; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i+1);
			vo.setTitle("title" + (i+1));
			vo.setContent("java" + (i+1));
			vo.setWriter("lee" + (i+1));
			m.put(i, vo);
		}
		return m;
	}



}
