package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test03Lambda_ScoreVO {

	public static void main(String[] args) {
		System.out.println("Collection >> Lambda");
		
		// ()->{}
		// (A, B)-> A - B
		ArrayList<ScoreVO> vos = new ArrayList<ScoreVO>();
		vos.add(new ScoreVO(1, "kim", 60, 60, 80, 70));
		vos.add(new ScoreVO(6, "hong", 70, 60, 90, 70));
		vos.add(new ScoreVO(3, "choi", 60, 80, 60, 90));
		vos.add(new ScoreVO(5, "yang", 60, 40, 60, 80));
		vos.add(new ScoreVO(4, "park", 70, 60, 50, 70));
		vos.add(new ScoreVO(2, "lee", 60, 70, 60, 70));

		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		
		// Lambda식을 사용해서 num : asc
		
		//1. 기본식
//		Collections.sort(vos, new Comparator<ScoreVO>() {
//			@Override
//			public int compare(ScoreVO vo1, ScoreVO vo2) {
//				return vo1.getNum()-vo2.getNum();
//			}
//		});
		
		//2. Lamda식 변환
		Collections.sort(vos, (vo1, vo2)->vo1.getNum()-vo2.getNum());

		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		System.out.println("========================================================================================");
		
		// Lambda식을 사용해서 name : desc
		Collections.sort(vos, (vo1, vo2)->vo2.getName().compareTo(vo1.getName()));
		// vos에서 바로 sort를 부여해도 된다.
		// vos.sort((vo1, vo2)->vo2.getName().compareTo(vo1.getName()));
		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		

		System.out.println("end main...");
	}// end main
	
}//end class











