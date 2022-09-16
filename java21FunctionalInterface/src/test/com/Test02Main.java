package test.com;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello_FunctionlInterface");
		
		// 1. Supplier<T>는 Type get() 메서드가 선언되어 있는 인터페이스이다.
			// 매개변수 없음, 리턴 타입 T
			Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);
			System.out.println(randomNumber.get());
	
			// Supplier 활용
			Supplier<String> user = ()-> "yangssem";
			System.out.println(user.get());
			System.out.println("=============================================================");

		// 2. Consumer<T>는 void accept(T) 메서드가 선언되어 있는 인터페이스이다.
			// 매개변수 있음, 리턴 타입 void
			Consumer<String> print = (name) -> System.out.println(name + "안녕?");
			print.accept("필자");
	
			// Consumer 할용
			Consumer<Double> avg_print = (avg) -> System.out.println("avg : " + avg);
			avg_print.accept(99.99);
			System.out.println("=============================================================");
		
		// 3. Predicate<T>는 boolean test(T) 매서드가 선언되어 있는 인터페이스이다.
			Predicate<Integer> isEven = (number) -> number % 2 == 0;
			System.out.println(isEven.test(10));;
			    
			// Predicate<T>는 and(), or(), negate() 메서드가 있다.
			Predicate<Integer> isMultipleOfTwo = (number) -> number % 2 == 0;   // 2의 배수이면 참
			Predicate<Integer> isMultipleOfThree = (number) -> number % 3 == 0; // 3의 배수이면 참
	
			// and() : (1)Predicate<T>와 (2)Predicate<T>의 and 연산
			boolean b1 = isMultipleOfTwo.and(isMultipleOfThree).test(9);
			System.out.println(b1);
	
			// or() : (1)Predicate<T>와 (2)Predicate<T>의 or 연산
			boolean b2 = isMultipleOfTwo.or(isMultipleOfThree).test(9);
			System.out.println(b2);
	
			// negate() : Predicate<T>의 !연산
			boolean b3 = isMultipleOfTwo.negate().test(12);
			System.out.println(b3);
			System.out.println("=============================================================");
			
		// 4. Function<T, R>은 R apply(T) 메서드가 선언되어 있는 인터페이스이다.
		// T(매개변수), R(리턴타입)
			Function<Integer, String> ageToString = (age) -> age + "살 입니다.";
			System.out.println(ageToString.apply(10));

			// Function<T, R>는 compose(), andThen() 메서드가 있다.
			Function<String, String> hi = (str) -> str + " hi";
			Function<String, String> bye = (str) -> str + " bye";

			// compose() : A.compose(B)일 때 실행 순서는 B -> A이다.
			String f1 = hi.compose(bye).apply("tigger");  // 결과: "tigger bye hi"
			System.out.println(f1);
					    
			// andthen() : A.andThen(B)일 때 실행 순서는 A -> B이다.
			String f2 = hi.andThen(bye).apply("tigger");  // 결과: "tigger hi bye"
			System.out.println(f2);
			
			// 여러개로도 조합이 가능...
			String f3 = hi.andThen(bye).compose(bye).apply("tigger");  // 결과: "tigger bye hi bye"
			System.out.println(f3);
		
		
	}//end main

}//end class
