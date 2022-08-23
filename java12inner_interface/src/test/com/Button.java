package test.com;

public class Button {

	OnClickListener onClickListener;
	
	public void touch() {
		onClickListener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
}
