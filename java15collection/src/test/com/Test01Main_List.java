package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import test.com.member.MemberVO;

public class Test01Main_List {

	public static void main(String[] args) {
		System.out.println("Hello Collection");
		
		//** 중복데이터 허용, 순서있음, 널 허용
		// 수정(set), 삭제(remove), 추가(add), 검색(get) 가능
		List list = new ArrayList(); // object 타입으로 모든 타입을 넣을 수 있다.
		list.add(1000); // 1000을 Integer에도 넣을 수 있기 때문에 인식
		list.add("kim"); // String
		list.add("kim"); // String 같은 값도 넣을 수 있다.
		list.add(3.14); // Double
		list.add(null); // null 값도 받을 수 있다.

		System.out.println(list.get(0)); // 1번방 추가한 값
		System.out.println(list.get(1)); // 2번방 추가한 값
		System.out.println("====================================================");
		
		for (int i = 0; i < list.size(); i++) { // list 배열을 전부 출력시 length 대신 size()를 사용한다.
			System.out.println(list.get(i));
		}
		System.out.println("====================================================");
		
		list.remove(0); // 0번방 삭제
		list.set(1, 999); // 1번방 수정
		for (Object x : list) {
			System.out.println(x);
		}
		System.out.println("====================================================");

		// <> 제네릭 : 타입을 정해주는 것, <>안에는 기본타입은 안되며 참조타입만 넣을 수 있다. (int, char 같은 타입은 넣을 수 없다.)
		// String, Integer, int[](배열로 가능), 내가만든 타입 등
		String[] strs = new String[] { "A", "B" }; // 타입으로 생성된 객체는 그 타입만 넣어야 한다...
		List<Integer> list2 = new ArrayList<Integer>(); // 우측 <Integer>는 생략 가능
		list2.add(100);
		list2.add(101);
		list2.add(102);
		list2.add(0, 103); //0번에 103입력하여 하나씩 뒤로 밀림
		Object[] objs = list.toArray();  // object 배열로 변환
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
		System.out.println("====================================================");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		vos.add(new MemberVO());  // 기본 null 생성자
		vos.add(new MemberVO(1,"admin","1234","kim","010"));  // 설정된 생성자
		vos.add(new MemberVO());  // 기본 null 생성자
		vos.add(new MemberVO(1,"admin","1234","kim","010"));  // 설정된 생성자
		
		MemberVO vo = new MemberVO();
		vo.setNum(1);
		vo.setId("tester");
		vo.setPw(null);
		vo.setName("lee");
		vo.setTel("02");
		vos.add(vo);
		
		System.out.println(vos.size());
		System.out.println("============================");
		for (int i = 0; i < vos.size(); i++) {
			MemberVO x = vos.get(i);
			System.out.print(x.getNum() + " ");
			System.out.print(x.getId() + " ");
			System.out.print(x.getPw() + " ");
			System.out.print(x.getName() + " ");
			System.out.println(x.getTel());
		}
		
		System.out.println("============================");
		vos.clear();
		for (MemberVO x : vos) {
			System.out.print(x.getNum() + " ");
			System.out.print(x.getId() + " ");
			System.out.print(x.getPw() + " ");
			System.out.print(x.getName() + " ");
			System.out.println(x.getTel());
			System.out.println();
		}
		
		System.out.println("============================");
//		for (Iterator iterator = vos.iterator(); iterator.hasNext();) {
//			MemberVO memberVO = (MemberVO) iterator.next();
//			
//		}
//		while (vos.iterator().hasNext()) {
//			MemberVO x = (MemberVO) vos.iterator().next();
//			
//		}
		
		

	}// end main

}// end class