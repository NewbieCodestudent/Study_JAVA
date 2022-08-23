package homework2.com;

public class Button {

	static interface OnClickListener {
		void OnClick();
	}

	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.OnClick();
	}

}
