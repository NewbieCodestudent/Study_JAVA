package test.com;

public interface Mother {

	String POWER = "100마력";
	
	public void play(); 
	
	public static void sleep() {
		System.out.println("sleep()...");
	}
	
	public default int waiting() {
		System.out.println("wait()...");
		return 1;
	}
	
}
