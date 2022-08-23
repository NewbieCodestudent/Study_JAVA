package test.com;

public class Test01main {

	public static void main(String[] args) {
		System.out.println("Hello inner interface");
		
		Button btn = new Button();
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("onClick()...");
			}
		});
		btn.touch();
		
		

	}// end main

}// end class
