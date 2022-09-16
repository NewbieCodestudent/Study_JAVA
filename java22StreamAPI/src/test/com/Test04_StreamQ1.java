package test.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test04_StreamQ1 {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		List<Double> dList = new ArrayList<Double>();
		
		double[] ds = new double[] {1.1, 2.2, 3.3, 4.4};
		
		for (int i = 0; i < ds.length; i++) {
			dList.add(ds[i]);
		}

		// Stream을 활용하여 구현
		//1. 3.0보다 작은데이터만 컬렉션에 넣기.
		List<Double> result = dList.stream().filter((x)->x<3.0).collect(Collectors.toList());
		System.out.println(result);
		
		//2. 3.0보다 작은데이터는 몇개?
		long count = dList.stream().filter((x)->x<3.0).count();
		System.out.println("3.0보다 작은 수 : " + count);
		
		dList.stream().min((a,b)->a-b);
		System.out.println();
		
	}//end main
}// end class