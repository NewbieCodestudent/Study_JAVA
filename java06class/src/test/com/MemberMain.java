package test.com;

public class MemberMain {

	public static void main(String[] args) {
		MemberVO mb = new MemberVO();
		System.out.println(mb);

		mb = new MemberVO(2, "asdf", "5678", "lee", "010-0100-0100");
		System.out.println(mb);
		
		mb = new MemberVO(3, "tester", "hy2424", "yang", "123456879");
		System.out.println(mb);
		
		// 하나의 값을 뽑아내기
		System.out.print(mb.getId() + " ");
		System.out.print(mb.getName() + " ");
		System.out.print(mb.getNum() + " ");
		System.out.print(mb.getPw() + " ");
		System.out.println(mb.getTel() + " ");
		
		
		// 서로 다른 회원 4명의 정보를 담는 회원배열 생성 및 출력
		// 값은 임의의 값을 넣는데 세터상용할 것, 반복문 사용권장
		
		MemberVO[] mb4 = new MemberVO[4];
		mb4[0] = new MemberVO(1, "test01", "qwer", "kim", "010-1234-5678");
		mb4[1] = new MemberVO(2, "test02", "asdf", "lee", "010-1234-5678");
		mb4[2] = new MemberVO(3, "test03", "zxcv", "park", "010-1234-5678");
		mb4[3] = new MemberVO(4, "test04", "qaz", "hee", "010-1234-5678");
		
		for (MemberVO x : mb4) {
			System.out.println(x);
		}
		
		MemberVO[] vos = new MemberVO[4];
		for (int i = 0; i < vos.length; i++) {
			vos[i] = new MemberVO();
			vos[i] = new MemberVO();
			vos[i].setNum(i+1);
			vos[i].setId("admin" + (i+1));
			vos[i].setPw("admin" + (i+1));
			vos[i].setName("admin" + (i+1));
			vos[i].setTel("010" + (i+1));
		}
		
		for (MemberVO x : vos) {
			System.out.println(x);
		}
				
		
		
	}//end main

}//end class
