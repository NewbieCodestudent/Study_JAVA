package test.com;

import java.util.Comparator;

public class ComparatorScoreVOnum implements Comparator<ScoreVO> {

	@Override
	public int compare(ScoreVO vo1, ScoreVO vo2) {
		return vo1.getNum() - vo2.getNum();
	}

}
