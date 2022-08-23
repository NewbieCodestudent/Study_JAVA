package test.com;

public class ScoreDAO {

	public ScoreDAO() {
		System.out.println("ScoreDAO!!!");
	}	
	
	// (public) + insert(ScoreVO) : int(return)
	public int insert(ScoreVO sv) {
		System.out.print("insert : ");
		System.out.println(sv);
		return 0;
	}
	// + update(ScoreVO) : int(return)
	public int update(ScoreVO sv) {
		sv.setNum(2);
		sv.setName("kim2");
		sv.setKor(92);
		sv.setEng(82);
		sv.setMath(72);
		System.out.print("update : ");
		System.out.println(sv);
		return 1;
	}
	// + delete(ScoreVO) : int(return)
	public int delete(ScoreVO sv) {
		System.out.print("delete : ");
		System.out.println(sv);
		return 2;
	}
	// + selectOne(ScoreVO) : ScoreVO
	public ScoreVO selectOne(ScoreVO sv) {
		System.out.print("selectOne : ");
		System.out.println(sv);
		
		ScoreVO sv2 = new ScoreVO();
		sv2.setNum(1);
		sv2.setName("kim");
		sv2.setKor(90);
		sv2.setEng(80);
		sv2.setMath(70);
		
		return sv2;
	}
	// + selectAll() : ScoreVO[]
	public ScoreVO[] selectAll() {
		System.out.print("selectAll : ");
		ScoreVO[] svs = new ScoreVO[3];
		for (int i = 0; i < svs.length; i++) {
			ScoreVO sv = new ScoreVO();
			sv.setNum(i+1);
			sv.setName("Test" + (i+1));
			sv.setKor(10*(i+1));
			sv.setEng(20*(i+1));
			sv.setMath(30*(i+1));
//			sv.setTotal(sv.setKor(10*(i+1)) + sv.setEng(20*(i+1)) + sv.setMath(30*(i+1)));
			svs[i] = sv;
		}
		return svs;
	}
	// + searchList(String, String) : ScoreVO[]
	public ScoreVO[] searchList(String searchKey, String searchWord) {
		System.out.print("searchList : ");
		System.out.print(searchKey + " ");
		System.out.println(searchWord);
		
		ScoreVO[] svs = new ScoreVO[3];
		for (int i = 0; i < svs.length; i++) {
			ScoreVO sv = new ScoreVO();
			sv.setNum(i+1);
			sv.setName("Test" + (i+1));
			sv.setKor(10*(i+1));
			sv.setEng(20*(i+1));
			sv.setMath(30*(i+1));
//			sv.setTotal(sv.setKor(10*(i+1)) + sv.setEng(20*(i+1)) + sv.setMath(30*(i+1)));
			svs[i] = sv;
		}
		return svs;
	}
	
}