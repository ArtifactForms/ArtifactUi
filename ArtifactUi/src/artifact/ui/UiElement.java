package artifact.ui;

public class UiElement {
	
	private int elementCount;
	private UiElement parent;
	
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

}
