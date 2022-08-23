package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import test.com.member.MemberVO;

public class Test03Main_Map {

	public static void main(String[] args) {
		System.out.println("Hello Map");

		// key, value 로 데이터를 여러개저장.
		// 맵핑, 바인딩 : put(K, V), putXXX(K, V), setAttrXXX(K, V)

		// K, V = K에는 key의 타입 / V에는 value 타입을 설정한다.
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(0, 111); // 0번 key에 111입력
		m.put(0, 1111); // 0번 key에 1111입력 (중복허용안함)
		m.put(1, 11111);
		m.put(2, 111111);
		System.out.println(m.size());

		System.out.print(m.get(0) + " ");
		System.out.print(m.get(1) + " ");
		System.out.println(m.get(2));

		System.out.println("==================");

		Map<String, Double> m2 = new Hashtable<String, Double>();
		m2.put("pi", 3.14);
		m2.put("avg", 99.99);
		m2.put("ball_speed", 74.5);

		System.out.println(m2.size());
		System.out.print(m2.get("pi") + " ");
		System.out.print(m2.get("avg") + " ");
		System.out.println(m2.get("ball_speed"));

		// m2.clear();
		System.out.println(m2.keySet()); // key의 종류를 출력
		m2.remove("pi"); // pi를 삭제
		m2.put("ball_speed", 68.8);
		System.out.println(m2.keySet().iterator().next());
		for (String key : m2.keySet()) {
			System.out.println(key + ":" + m2.get(key));
		}
		System.out.println(m2.values());
		for (Double x : m2.values()) {
			System.out.println(x);
		}

		System.out.println("======================");
		Map<String, MemberVO> m3 = new HashMap<String, MemberVO>();
		m3.put("vo1", new MemberVO());
		m3.put("vo2", new MemberVO(2, "ad1004", "ad1212", "askim", "080"));
		MemberVO vo = new MemberVO();
		vo.setNum(3);
		vo.setId("ad3");
		vo.setPw("ad3");
		vo.setName("askim33");
		vo.setTel("303");
		m3.put("vo3", vo);
		for (String x : m3.keySet()) {
			System.out.println(x);
		}

		System.out.println("=====================================");
		Map<String, List<MemberVO>> m4 = new HashMap<String, List<MemberVO>>();
		List<MemberVO> vos = new ArrayList<MemberVO>();
		vos.add(new MemberVO());
		vos.add(new MemberVO());

		m4.put("vos", vos);

		for (MemberVO x : m4.get("vos")) {
			System.out.println(x);
		}

		for (List<MemberVO> x : m4.values()) {
			System.out.println(x);
		}
		System.out.println("=====================================");

	}// end main

}// end class