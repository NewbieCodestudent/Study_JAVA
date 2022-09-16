package test.com;

import java.util.ArrayList;
import java.util.Comparator;

public class Test02Lambda_Collection4 {

	public static void main(String[] args) {
		System.out.println("Collection >> Lambda");
		
		// 정렬하는 방법 : sort 내 Comparator 이용
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(500);
		list.add(20000);
		list.add(30);
		System.out.println(list);
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//				return 0; //same
//				return o1-o2; //asc 
				return o2-o1; //desc
			}
		});
		
		System.out.println(list);
		
		System.out.println("end main...");
	}// end main
}//end class
