package artifact.ui.border;

import artifact.ui.Insets;

public class EmptyBorder implements Border {

	private int top;
	private int bottom;
	private int left;
	private int right;

	public EmptyBorder() {
	}

	public EmptyBorder(int top, int bottom, int left, int right) {
		this.top = top;
		this.bottom = bottom;
		this.left = left;
		this.right = right;
	}

	@Override
	public Insets getInsets() {
		Insets insets = new Insets();
		insets.setTop(top);
		insets.setBottom(bottom);
		insets.setLeft(left);
		insets.setRight(right);
		return insets;
	}

}
