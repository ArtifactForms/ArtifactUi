package artifact.ui;

public class UiElement {

	private int contentBoxWidth;
	private int contentBoxHeight;
	private int elementCount;
	private Padding padding;
	private Margin margin;
	private Insets insets;
	private UiElement parent;

	public UiElement() {
		padding = new Padding();
		margin = new Margin();
		insets = new Insets();
	}

	public void add(UiElement uiElement) {
		elementCount++;
		uiElement.parent = this;
	}

	public void remove(UiElement uiElement) {
		elementCount--;
		uiElement.parent = null;
	}

	public boolean isRoot() {
		return parent == null;
	}

	public UiElement getParent() {
		return parent;
	}

	public UiElement getRoot() {
		if (parent == null)
			return this;
		return parent.getRoot();
	}

	public int getElementCount() {
		return elementCount;
	}

	public UiElement getElementAt(int index) {
		return null;
	}

	public Padding getPadding() {
		return padding;
	}

	public Margin getMargin() {
		return margin;
	}

	public Insets getBorderInsets() {
		return insets;
	}

	public int getContentBoxWidth() {
		return contentBoxWidth;
	}

	public void setContentBoxWidth(int contentBoxWidth) {
		this.contentBoxWidth = contentBoxWidth;
	}

	public int getContentBoxHeight() {
		return contentBoxHeight;
	}

	public void setContentBoxHeight(int contentBoxHeight) {
		this.contentBoxHeight = contentBoxHeight;
	}

	public int getBorderBoxWidth() {
		return getContentBoxWidth() + getHorizontalPadding() + getHorizontalInsets();
	}

	public int getBorderBoxHeight() {
		return getContentBoxHeight() + getVerticalPadding() + getVerticalInsets();
	}

	private int getHorizontalPadding() {
		return padding.getHorizontalPadding();
	}

	private int getHorizontalInsets() {
		return insets.getHorizontalInsets();
	}
	
	private int getVerticalPadding() {
		return padding.getVerticalPadding();
	}
	
	private int getVerticalInsets() {
		return insets.getVerticalInsets();
	}

}
