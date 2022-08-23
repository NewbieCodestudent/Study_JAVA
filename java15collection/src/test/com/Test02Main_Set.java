package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import test.com.member.MemberVO;

public class Test02Main_Set {

	public static void main(String[] args) {
		// Set
		System.out.println("Hello Set...");
		
		// 데이터의 중복을 허용하지 않는다.
		// 데이터가 추가되는 순서가 없다.(인덱스가 없다.)
		
		Set<String> s = new HashSet<String>();
		s.add("kim");
		s.add("kim");
		s.add("kim2");
		s.add("kim2");
		s.add(null);
		s.add(null);
		System.out.println(s.size()); // 동일 문자는 하나로 인식
		
		for (String x : s) {
			System.out.println(x);
		}
		
		System.out.println("=============");
		s.remove("kim2");
		for (String x : s) {
			System.out.println(x);
		}
		
		System.out.println("=============");
		s.add("lee1");
		s.add("lee2");
		s.add("lee3");
		s.add("lee4");
		s.add("lee1");
		for (String x : s) {
			System.out.println(x);
		}
		
		System.out.println("=============");
		System.out.println(s.toArray());  // 배열로 전환한다.
		Object[] strs = s.toArray();
		for (Object x : strs) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(strs[0]);
		
		System.out.println("=================================");
//		for (Iterator<String> iterator = s.iterator(); iterator.hasNext();) {
//			String x = (String) iterator.next();
//			
//		}
//		
//		while (s.iterator().hasNext()) {
//			String x = (String) s.iterator().next();
//			
//		}
		
		System.out.println("=================================");
		Set<MemberVO> vos = new HashSet<MemberVO>();
		// Set은 주소가 다른데 데이터가 같으면 같은거로 인식 (데이터클래스용 함수에서 hashCode and equals를 설정해주어야 한다.)
		vos.add(new MemberVO());
		vos.add(new MemberVO());
		vos.add(new MemberVO(1,"admin","1234","kim","010"));
		vos.add(new MemberVO(1,"admin","1234","kim","010"));
		
		MemberVO vo = new MemberVO();
		vo.setNum(1);
		vo.setId("tester");
		vo.setPw(null);
		vo.setName("lee");
		vo.setTel("02");
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		System.out.println(vos.size());
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		

	}//end main

}//end class
