package test.com;

@FunctionalInterface
public interface MyValidator {

	public boolean test();
	// @FunctionalInterface는
	// 매서드를 하나만 가지는 Interface로 하겠다는 선언
	// 더 이상 추상메소드는 추가할 수 없다.
	// 단, default, static은 추가가능
	
}
