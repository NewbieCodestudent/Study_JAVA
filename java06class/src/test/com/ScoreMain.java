package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		// ScoreVO 객체 생성, 출력

//		복 습(배열만들기)
//		int[] sus = new int[] {99, 99, 99};
//		String[] strs = new String[] {"kim", "kim"};
				
		new ScoreVO(); // 출력만 실행
//		ScoreVO vo = new ScoreVO(); // 출력 후 변수에 할당

		// private 속성의 정보를 바꾸는 방법
		// 직접넣어주는 방법 ()에 값을 넣어주고 오류가는 생성자에서 생성을 눌러서 Score 클래스로 넘어간다.
		// 이후 각 값을 할당하여 주면 된다.
		ScoreVO vo = new ScoreVO(11, "yangseem", 88, 88, 88, 88);
		ScoreVO vo2 = new ScoreVO(11, "yangseem", 88, 88, 88, 88);
		
		System.out.println(vo);  // println의 기능 중 toString이 Object의 주소를 자동으로 출력한다.
		System.out.println(vo.equals(vo2));
		// 주소가 다르기 때문에 flase로 나오지만 Score Class에서 우클릭 Source에서
		// hashCode and equals를 통해서 같은 값이면 true로 출력하게 할 수 있다.
		
		// getter and setter 방법 (Score Class에 방법 있음)
		vo.setNum(2);
		vo.setName("kim");
		vo.setKor(99);
		vo.setEng(88);
		vo.setMath(77);
		vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
		System.out.println(vo.toString());
		System.out.println("==================================");
		
		// 학생성적 3개 처리하는 배열을 만들고 출력
		// 세터사용(임의의 테이터)
		// 출력시 게터 사용하시고 총점 평균 등급 출력
		
		ScoreVO[] sc = new ScoreVO[3];
		for (int i = 0; i < sc.length; i++) {
			sc[i] = new ScoreVO();
			sc[i].setNum(i+1);
			sc[i].setName("kim" + (i+1));
			sc[i].setKor(i*10);
			sc[i].setEng((i+1)*10);
			sc[i].setMath((i+2)*10);
		}
		
		for (int i = 0; i < sc.length; i++) {
			System.out.println(sc[i].getNum() + " " + sc[i].getName() + " " + sc[i].getKor() + " " + sc[i].getEng() + " " + sc[i].getMath());
		}
		
		ScoreVO[] vos = new ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			ScoreVO x = new ScoreVO();
			x.setNum(i+1);
			x.setName("lee"+(i+1));
			x.setKor(80+1);
			x.setEng(90+1);
			x.setMath(70+1);
			vos[i] = x;
		}
		
		for (ScoreVO x : vos) {
			int kor = x.getKor();
			int eng = x.getEng();
			int math = x.getMath();
			int total = x.getKor() + x.getEng() + x.getMath(); 
			double avg = total/3.0;
			String grade = "A";
			if(avg>=90) {
				grade = "A";
			}else if(avg>=80) {
				grade = "B";
			}else if(avg>=70) {
				grade = "C";
			}else if(avg>=60) {
				grade = "D";
			}else {
				grade = "F";
			}
			System.out.println(  x.getNum() + ","
		                       + kor + ","
					           + eng + ","
		                       + math + ","
					           + total + ","
					           + avg + ","
					           + grade);
		}
		
				
	}//end main

}//end class
