package test.com;

public class Car {
	private String model;
	private String color;
	private int maxSpeed;
	
	public Car() {
		model = "OOOO";
		color = "은색";
		maxSpeed = 250;
	}
	
	public Car(String model) {
		this();  // super를 this로 수정을 하면 this(); 생성자로 model 값은 바꾸지만 color와 maxSpeed는 위의 값을 받아온다. 
		this.model = model;
	}

	public Car(int maxSpeed) {  // 오버로딩을 할때 위에 사용한 타입은 아래에서 다시 사용할 수 없다.
		this();
		this.maxSpeed = maxSpeed;
	}

	public Car(String model, String color) {
		this(500);
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int maxSpeed) {
		this("SM7", "black");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
		
	
	
	
}
