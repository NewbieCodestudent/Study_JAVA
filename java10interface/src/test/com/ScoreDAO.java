package test.com;

public interface ScoreDAO {

	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

	public ScoreVO[] selectAll();

	public ScoreVO[] searchList(String x, String y);

}
