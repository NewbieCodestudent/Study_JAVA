package test.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test04_StreamQ3_asList {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		Double[] ds = new Double[] {1.1, 2.2, 3.3, 4.4};
		
		List<Double> dList = Arrays.asList(ds);
		
		// Stream을 활용하여 구현(3)
		//1. 3.0보다 작은데이터만 컬렉션에 넣기.
		//   double >> Double 변환 후 list에 담기
		List<Double> result = Arrays.asList(ds).stream().filter((x)->x<3.0).collect(Collectors.toList());
		System.out.println(result);
		
		//2. 3.0보다 작은데이터는 몇개?
		//   double >> Double 변환 후 list에 담기
		long count = dList.stream().filter((x)->x<3.0).count();
		System.out.println("3.0보다 작은 수 : " + count);
		
	}//end main
}// end class