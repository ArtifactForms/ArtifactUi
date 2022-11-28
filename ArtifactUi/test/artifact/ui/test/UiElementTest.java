package artifact.ui.test;

import org.junit.Assert;
import org.junit.Test;

import artifact.ui.Insets;
import artifact.ui.Margin;
import artifact.ui.Padding;
import artifact.ui.UiElement;

public class UiElementTest {

	@Test
	public void isRootReturnsTrueByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertTrue(uiElement.isRoot());
	}

	@Test
	public void getParentReturnsNullByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertNull(uiElement.getParent());
	}

	@Test
	public void getParentAfterAddingChildElement() {
		UiElement child = new UiElement();
		UiElement uiElement = new UiElement();
		uiElement.add(child);
		Assert.assertTrue(uiElement == child.getParent());
	}

	@Test
	public void isNoRootAfterAdded() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		Assert.assertFalse(child.isRoot());
	}

	@Test
	public void isRootAfterRemoved() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		parent.remove(child);
		Assert.assertTrue(child.isRoot());
	}

	@Test
	public void getParentReturnsNullAfterRemove() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		parent.remove(child);
		Assert.assertNull(child.getParent());
	}

	@Test
	public void getRootRetunsSelfByDefault() {
		UiElement uiElement = new UiElement();
		UiElement root = uiElement.getRoot();
		Assert.assertTrue(root == uiElement);
	}

	@Test
	public void getRootReturnsParentAfterAdded() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		Assert.assertTrue(parent == child.getRoot());
	}

	@Test
	public void getRootOfNestedElement() {
		UiElement root = new UiElement();
		UiElement childA = new UiElement();
		UiElement childB = new UiElement();
		childA.add(childB);
		root.add(childA);
		Assert.assertTrue(root == childB.getRoot());
	}

	@Test
	public void getElementCountReturnsZeroByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertEquals(0, uiElement.getElementCount());
	}

	@Test
	public void getElementCountIsOneAfterAddingOneElement() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		Assert.assertEquals(1, parent.getElementCount());
	}

	@Test
	public void getElementCountIsZeroAfterAddAndRemove() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		parent.remove(child);
		Assert.assertEquals(0, parent.getElementCount());
	}

	@Test
	public void getElementCountAfterAddingElements() {
		UiElement element = new UiElement();
		for (int i = 0; i < 10; i++) {
			element.add(new UiElement());
			Assert.assertEquals(i + 1, element.getElementCount());
		}
	}

	@Test
	public void getElementCountAfterAddRemoveAdd() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		parent.remove(child);
		parent.add(child);
		Assert.assertEquals(1, parent.getElementCount());
	}

	@Test
	public void getElementCountAfterAddRemoveAddTwice() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		parent.remove(child);
		parent.add(child);
		parent.remove(child);
		Assert.assertEquals(0, parent.getElementCount());
	}

	@Test
	public void getElementCountAfterAddRemove() {
		UiElement parent = new UiElement();
		UiElement child = new UiElement();
		parent.add(child);
		parent.add(child);
		parent.add(child);
		parent.remove(child);
		Assert.assertEquals(2, parent.getElementCount());
	}

	@Test
	public void getElementAtZeroReturnsNullByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertNull(uiElement.getElementAt(0));
	}

	@Test
	public void getPaddingIsNotNullByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertNotNull(uiElement.getPadding());
	}

	@Test
	public void paddingIsConsistent() {
		int random = (int) (Math.random() * Integer.MAX_VALUE);
		UiElement uiElement = new UiElement();
		Padding padding = uiElement.getPadding();
		padding.setBottom(random);
		Assert.assertEquals(random, uiElement.getPadding().getBottom());
	}

	@Test
	public void getMarginIsNotNullByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertNotNull(uiElement.getMargin());
	}

	@Test
	public void marginIsConsistent() {
		int random = (int) (Math.random() * Integer.MAX_VALUE);
		UiElement uiElement = new UiElement();
		Margin margin = uiElement.getMargin();
		margin.setLeft(random);
		Assert.assertEquals(random, uiElement.getMargin().getLeft());
	}

	@Test
	public void borderInsetsAreNotNotNullByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertNotNull(uiElement.getBorderInsets());
	}

	@Test
	public void borderInsetsAreConsistent() {
		int random = (int) (Math.random() * Integer.MAX_VALUE);
		UiElement uiElement = new UiElement();
		Insets insets = uiElement.getBorderInsets();
		insets.setRight(random);
		Assert.assertEquals(random, uiElement.getBorderInsets().getRight());
	}

	@Test
	public void getContentBoxWidthIsZeroByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertEquals(0, uiElement.getContentBoxWidth());
	}

	@Test
	public void getContentBoxHeightIsZeroByDefault() {
		UiElement uiElement = new UiElement();
		Assert.assertEquals(0, uiElement.getContentBoxHeight());
	}

	@Test
	public void setContentBoxWidthToValueGetReturnsValue() {
		int random = (int) (Math.random() * Integer.MAX_VALUE);
		UiElement uiElement = new UiElement();
		uiElement.setContentBoxWidth(random);
		Assert.assertEquals(random, uiElement.getContentBoxWidth());
	}

	@Test
	public void setContentBoxHeightToValueGetReturnsValue() {
		int random = (int) (Math.random() * Integer.MAX_VALUE);
		UiElement uiElement = new UiElement();
		uiElement.setContentBoxHeight(random);
		Assert.assertEquals(random, uiElement.getContentBoxHeight());
	}

	@Test
	public void getBorderBoxWidth() {
		int contentWidth = (int) (Math.random() * Integer.MAX_VALUE);
		int paddingLeft = (int) (Math.random() * Integer.MAX_VALUE);
		int paddingRight = (int) (Math.random() * Integer.MAX_VALUE);
		int borderLeft = (int) (Math.random() * Integer.MAX_VALUE);
		int borderRight = (int) (Math.random() * Integer.MAX_VALUE);
		int expectedWidth = contentWidth + paddingLeft + paddingRight + borderLeft + borderRight;
		UiElement uiElement = new UiElement();
		uiElement.setContentBoxWidth(contentWidth);
		uiElement.getPadding().setLeft(paddingLeft);
		uiElement.getPadding().setRight(paddingRight);
		uiElement.getBorderInsets().setLeft(borderLeft);
		uiElement.getBorderInsets().setRight(borderRight);
		Assert.assertEquals(expectedWidth, uiElement.getBorderBoxWidth());
	}

	@Test
	public void getBorderBoxHeight() {
		int contentHeight = (int) (Math.random() * Integer.MAX_VALUE);
		int paddingTop = (int) (Math.random() * Integer.MAX_VALUE);
		int paddingBottom = (int) (Math.random() * Integer.MAX_VALUE);
		int borderTop = (int) (Math.random() * Integer.MAX_VALUE);
		int borderBottom = (int) (Math.random() * Integer.MAX_VALUE);
		int expectedHeight = contentHeight + paddingTop + paddingBottom + borderTop + borderBottom;
		UiElement uiElement = new UiElement();
		uiElement.setContentBoxHeight(contentHeight);
		uiElement.getPadding().setTop(paddingTop);
		uiElement.getPadding().setBottom(paddingBottom);
		uiElement.getBorderInsets().setTop(borderTop);
		uiElement.getBorderInsets().setBottom(borderBottom);
		Assert.assertEquals(expectedHeight, uiElement.getBorderBoxHeight());
	}

}
