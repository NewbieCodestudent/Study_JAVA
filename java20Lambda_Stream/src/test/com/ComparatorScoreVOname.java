package test.com;

import java.util.Comparator;

public class ComparatorScoreVOname implements Comparator<ScoreVO> {

	@Override
	public int compare(ScoreVO vo1, ScoreVO vo2) {
		return vo1.getName().compareTo(vo2.getName());
	}

}
