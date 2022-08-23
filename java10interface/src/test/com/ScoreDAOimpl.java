package test.com;

public class ScoreDAOimpl implements ScoreDAO {

	public ScoreDAOimpl() {
		System.out.println("Class ScoreDAOimpl");
	}
	
	@Override
	public int insert(ScoreVO sv) {
		System.out.println("ScoreDAOex insert");
		return 0;
	}

	@Override
	public int update(ScoreVO sv) {
		System.out.println("ScoreDAOex update");
		return 1;
	}

	@Override
	public int delete(ScoreVO sv) {
		System.out.println("ScoreDAOex delete");
		return 2;
	}

	@Override
	public ScoreVO[] selectAll() {
		System.out.println("ScoreDAOex selectAll");
		ScoreVO[] svo = new ScoreVO[3];
		for (int i = 0; i < svo.length; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(i+1);
			vo.setName("kim" + (i+1));
			vo.setKor(90 + (i+1));
			vo.setEng(80 + (i+1));
			vo.setMath(70 + (i+1));
			svo[i] = vo;
		}
		return svo;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("ScoreDAOex selectOne");
		ScoreVO vo1 = new ScoreVO();
		return vo1;
	}

	@Override
	public ScoreVO[] searchList(String x, String y) {
		System.out.println("ScoreDAOex searchList");
		System.out.println(x);
		System.out.println(y);
		
		ScoreVO[] svo = new ScoreVO[3];
		for (int i = 0; i < svo.length; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(i+1);
			vo.setName("kim" + (i+1));
			vo.setKor(90 + (i+1));
			vo.setEng(80 + (i+1));
			vo.setMath(70 + (i+1));
			svo[i] = vo;
		}
		return svo;
	}

}
