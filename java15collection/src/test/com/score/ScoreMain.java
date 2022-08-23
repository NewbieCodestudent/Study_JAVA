package test.com.score;

import java.util.List;

public class ScoreMain {

	public static void main(String[] args) {
		ScoreDAOimpl result = new ScoreDAOimpl();
		ScoreVO vo = new ScoreVO();
		
		System.out.println(result.insert(vo));
		System.out.println();
		
		System.out.println(result.update(vo));
		System.out.println();
		
		System.out.println(result.delete(vo));
		System.out.println();
		
		List<ScoreVO> vos = result.selectAll();
		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		System.out.println();
		
		vo.setMath(100); vo.setEng(100); vo.setKor(100); vo.setTotal(300);
		System.out.println(result.selectOne(vo));
		System.out.println();
		
		List<ScoreVO> vos2 = result.searchList("lee", "kim");
		for (ScoreVO x : vos2) {
			System.out.println(x);
		}
		
		
		

	}// end main

}// end class
