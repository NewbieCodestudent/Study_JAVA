package test.com;

import java.util.ArrayList;

public class Test02Lambda_Collection5 {

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

		list.sort((o1,o2)->o1-o2);
		System.out.println(list);
		
		list.sort((o1,o2)->o2-o1);
		System.out.println(list);
		
		list.sort((o1,o2)->o1.compareTo(o2));
		System.out.println(list);
		
		list.sort((o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		
		System.out.println("end main...");
	}// end main
}//end class