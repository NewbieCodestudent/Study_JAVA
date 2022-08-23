package test.com;

public class CMSmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello CMS");

		CMS cms = new CMS();
		System.out.println(cms);
		
//		CMS cms2 = new CMS(new Car("A", "black", 300),
//				           new MemberVO(1, "lee", "qwer1234", "lee", "010"),
//				           new ScoreVO(1, "kim", 99, 88, 77, 99+88+77));
//		System.out.println(cms2); 
		
		Car car = new Car("Benz", "흰색", 200);

		MemberVO member = new MemberVO();
		member.setNum(1);
		member.setName("lee");
		member.setId("lee");
		member.setPw("qwer1234");
		member.setTel("010");
		
		ScoreVO score = new ScoreVO();
		score.setNum(1);
		score.setName("kim");
		score.setKor(99);
		score.setEng(88);
		score.setMath(77);
		score.setTotal(99+88+77);

		CMS cms2 = new CMS(car,member,score);
		System.out.println(cms2);
		System.out.println();
		System.out.print(cms2.getCar().getModel()+" ");
		System.out.print(cms2.getCar().getColor()+" ");
		System.out.print(cms2.getCar().getMaxSpeed());
		System.out.println();
		System.out.print(cms2.getMember().getNum() + " ");
		System.out.print(cms2.getMember().getId() + " ");
		System.out.print(cms2.getMember().getPw() + " ");
		System.out.print(cms2.getMember().getName() + " ");
		System.out.print(cms2.getMember().getTel());
		System.out.println();
		System.out.print(cms2.getScore().getNum() + " ");
		System.out.print(cms2.getScore().getName() + " ");
		System.out.print(cms2.getScore().getKor() + " ");
		System.out.print(cms2.getScore().getEng() + " ");
		System.out.println(cms2.getScore().getMath() + " ");
		
		
	}//end main

}//end class
