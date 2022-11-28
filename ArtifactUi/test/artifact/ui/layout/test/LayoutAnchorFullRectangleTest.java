package artifact.ui.layout.test;

import org.junit.Assert;
import org.junit.Test;

import artifact.ui.UiElement;
import artifact.ui.layout.LayoutAnchor;
import artifact.ui.layout.LayoutAnchorFullRectangle;

public class LayoutAnchorFullRectangleTest {

	@Test
	public void implementsAnchorInterface() {
		LayoutAnchorFullRectangle layoutAnchor = new LayoutAnchorFullRectangle();
		Assert.assertTrue(layoutAnchor instanceof LayoutAnchor);
	}
	
	@Test
	public void anchorsFullToParentContentWidth() {
		int contentWidth = (int) (Math.random() * Integer.MAX_VALUE);
		LayoutAnchorFullRectangle layoutAnchor = new LayoutAnchorFullRectangle();
		UiElement child = new UiElement();
		UiElement parent = new UiElement();
		parent.setContentBoxWidth(contentWidth);
		parent.add(child);
		layoutAnchor.anchor(child);
		Assert.assertEquals(contentWidth, child.getContentBoxWidth());
	}
	
	@Test
	public void anchorsFullToParentContentHeight() {
		int contentHeight = (int) (Math.random() * Integer.MAX_VALUE);
		LayoutAnchorFullRectangle layoutAnchor = new LayoutAnchorFullRectangle();
		UiElement child = new UiElement();
		UiElement parent = new UiElement();
		parent.setContentBoxHeight(contentHeight);
		parent.add(child);
		layoutAnchor.anchor(child);
		Assert.assertEquals(contentHeight, child.getContentBoxHeight());
	}
	
}
