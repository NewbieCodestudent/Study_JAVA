package test.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test04_StreamQ2_boxed {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		double[] ds = new double[] {1.1, 2.2, 3.3, 4.4};
		
		// Stream을 활용하여 구현(2)
		//1. 3.0보다 작은데이터만 컬렉션에 넣기.
		//   DoubleStream >> Stream : boxed()로 변환
		List<Double> result = Arrays.stream(ds).boxed().filter((x)->x<3.0).collect(Collectors.toList());
		System.out.println(result);
		
		//2. 3.0보다 작은데이터는 몇개?
		//   Arraus.stream()으로 변환
		long count = Arrays.stream(ds).filter((x)->x<3.0).count();
		System.out.println("3.0보다 작은 수 : " + count);
		
	}//end main
}// end class