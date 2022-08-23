package test.com;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello member");
		
		MemberVO vo = new MemberVO();
//		System.out.println(vo);
		vo.setId("admin");
		vo.setPw("hi12345");
		vo.setName("kim");
		vo.setTel("02");
		
		MemberProcess mp = new MemberProcess();
		int result = mp.insert(vo);  // 입력
		System.out.println("result : " + result);
		
		vo.setNum(2);
		vo.setId("admin2");
		vo.setPw("hi000");
		vo.setName("Lee");
		vo.setTel("03");
		result = mp.update(vo);  // 수정
		System.out.println("result : " + result);
		
		vo.setTel("00");
		result = mp.delete(vo);  // 삭제
		System.out.println("result : " + result);
		
		MemberVO[] vos = mp.selectAll();  // 모든값 출력
		System.out.println(vos);  // 배열은 foreach로 출력해야 한다.
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		MemberVO vo2 = mp.selectOne(vo);  // 하나의 값 출력
		//selectOne(MemberVO(매개변수)) : MemberVO(반환타입)
		System.out.println(vo2);
		
		MemberVO[] vos2 = mp.searchList("name", "ki");
		// 특정 키워드로 검색하는 방법
		// 결과 값이 0~여러개 이기 때문에 배열로 생성
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
//		MemberVO[] vos2 = mp.searchList("tel", "010");
		

	}//end main

	
}//end class
