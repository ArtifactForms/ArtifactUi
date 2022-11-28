package artifact.ui.test;

import org.junit.Assert;
import org.junit.Test;

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
	
}
