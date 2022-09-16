package test.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03_Stream_apply {

	public static void main(String[] args) {
		System.out.println("Hello...StreamAPI");
		
		// 더미그룹 생성
		List<String> names = new ArrayList<String>();
		for (int i = 0; i < 10000000; i++) {
			names.add("abc");
		}
		System.out.println("=======for_if=======");
		System.out.println("names : " + names.size());
		
		// 함수를 이용한 출력
		Stream<String> st = names.stream();
		long count = st.filter((item)->item.startsWith("a")).count();
		System.out.println("count : " + count);
		
		List<String> temp = names.stream().filter((item)->item.startsWith("a")).collect(Collectors.toList());
		System.out.println("=======Stream=======");
		System.out.println("temp : " + temp.size());
		

		temp = names.parallelStream().filter((item)->item.startsWith("a")).collect(Collectors.toList());
		System.out.println("=======parallelStream=======");
		System.out.println("temp : " + temp.size());
		// 1억정도의 갯수를 돌리면 오류가 발생한다.
	}
}