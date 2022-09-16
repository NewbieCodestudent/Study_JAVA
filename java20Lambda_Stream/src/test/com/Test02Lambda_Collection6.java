package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test02Lambda_Collection6 {

	public static void main(String[] args) {
		System.out.println("Collection >> Lambda");
		
		// ()->{}
		// (A, B)-> A - B
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(500);
		list.add(20000);
		list.add(30);
		System.out.println(list);
//		Collections.sort(list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//				return o2-o1;
//			}
//		});
		// 함수를 Lambda식으로 하여 줄여서 작성이 가능하다.

		Collections.sort(list, (o1,o2)->o1-o2);
		System.out.println(list);
		
		Collections.sort(list, (o1,o2)->o2-o1);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("lee");
		list2.add("chan");
		list2.add("park");
		
		//Anonymous inner : String의 경우 compareTo를 사용한다.
		Collections.sort(list2, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		//Lambda
		Collections.sort(list2, (o1, o2) -> o1.compareTo(o2));
		System.out.println(list2);
		
		Collections.sort(list2, (o1, o2) -> o2.compareTo(o1));
		System.out.println(list2);
		
		System.out.println("end main...");
	}// end main
	
}//end class











