package homework.com;

public class TestCafeMain {

	public static void main(String[] args) {
		System.out.println("Hello cafe...");
		
		TestCafeVO vo = new TestCafeVO();
		System.out.println(vo);
		
		vo = new TestCafeVO(new TestStarbugs(), new TestMegaCoffee());
		System.out.println(vo);
		
		vo = new TestCafeVO(new TestStarbugs(1,"Ori","Yang",new String[] {"aa","ddaa","ddalgilatte"}), new TestMegaCoffee());
		System.out.println(vo);
		
		
		
		
	}

}
