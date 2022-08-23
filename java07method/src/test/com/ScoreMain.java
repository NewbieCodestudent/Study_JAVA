package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("Hello Score");
		
		ScoreDAO sdao = new ScoreDAO();
		
		ScoreVO sv = new ScoreVO();
		sv.setNum(1);
		sv.setName("lee");
		sv.setKor(11);
		sv.setEng(22);
		sv.setMath(33);
		sv.setTotal(11+22+33);
		
		int result = sdao.insert(sv);
		System.out.println("result : " + result);
		
		result = sdao.update(sv);
		System.out.println("result : " + result);
		
		sv.setNum(3);
		result = sdao.delete(sv);
		System.out.println("result : " + result);
		
		sv = new ScoreVO();
		sv.setNum(4);
		ScoreVO sv2 = sdao.selectOne(sv);
		System.out.println(sv2);
		
		ScoreVO[] svs = sdao.selectAll();
		for (ScoreVO x : svs) {
			System.out.println(x);
		}
		
		ScoreVO[] svs2 = sdao.searchList("name", "Le");
		for (ScoreVO x : svs2) {
			System.out.println(x);
		}
		
	}// end main

}// end class
