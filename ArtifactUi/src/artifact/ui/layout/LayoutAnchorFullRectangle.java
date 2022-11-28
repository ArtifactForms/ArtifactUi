package artifact.ui.layout;

import artifact.ui.UiElement;

public class LayoutAnchorFullRectangle implements LayoutAnchor {

	@Override
	public void anchor(UiElement uiElement) {
		UiElement parent = uiElement.getParent();
		int parentContentBoxWidth = parent.getContentBoxWidth();
		int parentContentBoxHeight = parent.getContentBoxHeight();
		uiElement.setContentBoxWidth(parentContentBoxWidth);
		uiElement.setContentBoxHeight(parentContentBoxHeight);
	}
	
}
