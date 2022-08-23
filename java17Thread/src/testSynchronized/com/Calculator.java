package testSynchronized.com;

public class Calculator {
	
	private int memory;
	
	public int Calcuator() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
	// synchronized를 통한 동기화를 통해 user1에서의 값이 user2에서 변경하지 못하도록 보호한다.
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
