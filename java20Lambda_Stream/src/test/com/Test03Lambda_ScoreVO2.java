package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test03Lambda_ScoreVO2 {

	public static void main(String[] args) {
		System.out.println("Collection >> Lambda");
		
		ArrayList<ScoreVO> vos = new ArrayList<ScoreVO>();
		vos.add(new ScoreVO(1, "kim", 60, 60, 80, 70));
		vos.add(new ScoreVO(6, "hong", 70, 60, 90, 70));
		vos.add(new ScoreVO(3, "choi", 60, 80, 60, 90));
		vos.add(new ScoreVO(5, "yang", 60, 40, 60, 80));
		vos.add(new ScoreVO(4, "park", 70, 60, 50, 70));
		vos.add(new ScoreVO(2, "lee", 60, 70, 60, 70));
		
		// Lambda식을 사용해서 num : asc
		Collections.sort(vos, Comparator.comparing(ScoreVO::getNum));
		for (ScoreVO x : vos) {
			System.out.println(x);
		}

		// num 모든 표현
		Collections.sort(vos, (ScoreVO vo1, ScoreVO vo2)->vo1.getNum() - vo2.getNum());
		Collections.sort(vos, (vo1, vo2) -> vo1.getNum() - vo2.getNum());
		Collections.sort(vos, Comparator.comparing((vo)->vo.getNum()));
		Collections.sort(vos, Comparator.comparing(ScoreVO::getNum));
		vos.sort((ScoreVO vo1, ScoreVO vo2) -> vo1.getNum() - vo2.getNum());
		vos.sort((vo1, vo2) -> vo1.getNum() - vo2.getNum());
		vos.sort(Comparator.comparing((vo)->vo.getNum()));
		vos.sort(Comparator.comparing(ScoreVO::getNum));
		
		// name 모든 표현
		Collections.sort(vos, (ScoreVO vo1, ScoreVO vo2) -> vo2.getName().compareTo(vo1.getName()));
		Collections.sort(vos, (vo1, vo2) -> vo2.getName().compareTo(vo1.getName()));
		Collections.sort(vos, Comparator.comparing((vo)->vo.getName()));
		Collections.sort(vos, Comparator.comparing(ScoreVO::getName));
		vos.sort((ScoreVO vo1, ScoreVO vo2) -> vo2.getName().compareTo(vo1.getName()));
		vos.sort((vo1, vo2) -> vo2.getName().compareTo(vo1.getName()));
		vos.sort(Comparator.comparing((vo)->vo.getName()));
		vos.sort(Comparator.comparing(ScoreVO::getName));
		
		System.out.println("end main...");
	}// end main
	
}//end class











