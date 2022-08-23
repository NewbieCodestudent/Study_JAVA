package test.kosta;

public abstract class ScoreDAO {

	public abstract int insert(ScoreVO sv);
	
	public abstract int update(ScoreVO sv);
	
	public abstract int delete(ScoreVO sv);
	
	public abstract ScoreVO[] selectAll();
	
	public abstract ScoreVO selectOne(ScoreVO vo);
	
	public abstract ScoreVO[] searchList(String x, String y);

	// 추상클래스 내부에 있는 함수는 아래에 오버라이딩하지 않고
	// ScoreDAOex와 같이 클래스를 하나더 만들어서 정리한다.
	// 오버라이딩을 할 경우 Class 안의 내용이 길어지고 복잡해 진다.
	// ↓ (inner class)
//	ScoreDAO dao = new ScoreDAO() {
//
//		@Override
//		public int insert() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public int update() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public int delete() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public ScoreVO[] selectAll() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public ScoreVO selectOne(ScoreVO vo) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public ScoreVO[] searchList(String x, String y) {
//			// TODO Auto-generated method stub
//			return null;
//		}};
	
}
