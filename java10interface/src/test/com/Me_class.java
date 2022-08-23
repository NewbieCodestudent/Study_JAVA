package test.com;

public class Me_class implements Father, Mother {

	@Override
	public int work() {
		System.out.println("Me_class work()...");
		return 0;
	}
	
	public void aaa() {}
	public void bbb() {}
	public void ccc() {}

	@Override
	public void play() {
		System.out.println("Me_class play()...");
		
	}



}
