package test.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test04_StreamQ4_Streamof {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		Double[] ds = new Double[] {1.1, 2.2, 3.3, 4.4};
		
		// Stream을 활용하여 구현(4)
		//1. 3.0보다 작은데이터만 컬렉션에 넣기.
		//   DoubleStream >> Stream.of(ds)로 변환
		List<Double> result = Stream.of(ds).filter((x)->x<3.0).collect(Collectors.toList());
		System.out.println(result);

		//2. 3.0보다 작은데이터는 몇개?
		//   DoubleStream >> Stream.of(ds)로 변환
		long count = Stream.of(ds).filter((x)->x<3.0).count();
		System.out.println("3.0보다 작은 수 : " + count);
		
	}//end main
}// end class