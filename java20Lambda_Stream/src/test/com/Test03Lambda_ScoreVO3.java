package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test03Lambda_ScoreVO3 {

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
		vos.sort(new ComparatorScoreVOnum());
		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		System.out.println("==========================================================");
		
		vos.sort(new ComparatorScoreVOname());
		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		
		System.out.println("end main...");
	}// end main
	
}//end class