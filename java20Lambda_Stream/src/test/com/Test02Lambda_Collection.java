package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test02Lambda_Collection {

	public static void main(String[] args) {
		System.out.println("Collection >> Lambda");
		
		// 자동완성시 나타나는 대문자의 의미
		// E:Element  T:Type  K:Key  V:Value  ?:AnyType
		// List를 선언하는 방법
		// #1
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1000);
//		list.add(2000);
//		list.add(3000);
//		list.add(500);
//		list.add(20000);
//		list.add(30);
//		System.out.println(list);

		// #2
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] {1000,2000,3000,500,20000,30}));
		
		// #3
		List<Integer> list = Arrays.asList(7, 5, 123, 5, 42, 95, 68, 30, 42);
		List<Integer> result = list.stream()
				.filter(number -> number < 50)  // 50보다 작은 수를 선택
				.distinct() // 중복 데이터 제거
				.sorted(Integer::compare)  // 정렬
				.collect(Collectors.toList()); // list 타입으로 변환
		System.out.println(result);
		System.out.println("===================================================");
		
		// Collections class의 기능
		// sort : 배열을 크기순으로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		// reverse : 배열을 역순으로 출력(정렬이 되는 것이 아니다.)
		Collections.reverse(list);
		System.out.println(list);
		
		
		System.out.println(list.toArray());
		System.out.println("===================================================");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("lee");
		list2.add("chan");
		list2.add("park");
		
		Collections.sort(list2);
		System.out.println(list2);
		Collections.reverse(list2);
		System.out.println(list2);
		
		System.out.print("end main...");
	}// end main
}//end class
