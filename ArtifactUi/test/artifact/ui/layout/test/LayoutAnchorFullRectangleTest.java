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
	
	@Test
	public void notesHorizontalPaddingOfChild() {
		int contentWidth = (int) (Math.random() * Integer.MAX_VALUE);
		int childPaddingLeft = (int) (Math.random() * Integer.MAX_VALUE);
		int childPaddingRight = (int) (Math.random() * Integer.MAX_VALUE);
		int expectedWidth = contentWidth - childPaddingLeft - childPaddingRight;
		LayoutAnchorFullRectangle layoutAnchor = new LayoutAnchorFullRectangle();
		UiElement child = new UiElement();
		UiElement parent = new UiElement();
		parent.setContentBoxWidth(contentWidth);
		parent.add(child);
		child.getPadding().setLeft(childPaddingLeft);
		child.getPadding().setRight(childPaddingRight);
		layoutAnchor.anchor(child);
		Assert.assertEquals(expectedWidth, child.getContentBoxWidth());
	}
	
	@Test
	public void notesVerticalPaddingOfChild() {
		int contentHeight = (int) (Math.random() * Integer.MAX_VALUE);
		int childPaddingTop = (int) (Math.random() * Integer.MAX_VALUE);
		int childPaddingBottom = (int) (Math.random() * Integer.MAX_VALUE);
		int expectedHeight = contentHeight - childPaddingTop - childPaddingBottom;
		LayoutAnchorFullRectangle layoutAnchor = new LayoutAnchorFullRectangle();
		UiElement child = new UiElement();
		UiElement parent = new UiElement();
		parent.setContentBoxHeight(contentHeight);
		parent.add(child);
		child.getPadding().setTop(childPaddingTop);
		child.getPadding().setBottom(childPaddingBottom);
		layoutAnchor.anchor(child);
		Assert.assertEquals(expectedHeight, child.getContentBoxHeight());
	}
	
	@Test
	public void notesHorizontalBorderOfChild() {
		int contentWidth = (int) (Math.random() * Integer.MAX_VALUE);
		int childBorderLeft = (int) (Math.random() * Integer.MAX_VALUE);
		int childBorderRight = (int) (Math.random() * Integer.MAX_VALUE);
		int expectedWidth = contentWidth - childBorderLeft - childBorderRight;
		LayoutAnchorFullRectangle layoutAnchor = new LayoutAnchorFullRectangle();
		UiElement child = new UiElement();
		UiElement parent = new UiElement();
		parent.setContentBoxWidth(contentWidth);
		parent.add(child);
		child.getBorderInsets().setLeft(childBorderLeft);
		child.getBorderInsets().setRight(childBorderRight);
		layoutAnchor.anchor(child);
		Assert.assertEquals(expectedWidth, child.getContentBoxWidth());
	}
	
}
