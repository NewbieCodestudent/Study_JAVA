package test.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		// 더미그룹 생성
		List<String> names = new ArrayList<String>();
		for (int i = 0; i < 10000000; i++) {
			names.add("abc");
		}
		System.out.println("names : " + names.size());
		
		// a로 시작되는 인자 검색
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("a")) {
				count++;
			}
		}
		System.out.println("count : " + count);
		System.out.println("======================================");
		List<String> temp = new ArrayList<String>();
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("a")) {
				temp.add("abc");
			}
		}
		System.out.println("temp : " + temp.size());
		
		
	}
}