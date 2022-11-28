package artifact.ui.test;

import org.junit.Assert;
import org.junit.Test;

import artifact.ui.Padding;

public class PaddingTest {
	
	@Test
	public void getTopReturnsZeroByDefault() {
		Padding padding = new Padding();
		Assert.assertEquals(0, padding.getTop());
	}
	
	@Test
	public void getLeftReturnsZeroByDefault() {
		Padding padding = new Padding();
		Assert.assertEquals(0, padding.getLeft());
	}
	
	@Test
	public void getBottomReturnsZeroByDefault() {
		Padding padding = new Padding();
		Assert.assertEquals(0, padding.getBottom());
	}
	
	@Test
	public void getRightReturnsZeroByDefault() {
		Padding padding = new Padding();
		Assert.assertEquals(0, padding.getRight());
	}
	
	@Test
	public void setTopValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setTop(value);
		Assert.assertEquals(value, padding.getTop());
	}
	
	@Test
	public void setLeftValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setLeft(value);
		Assert.assertEquals(value, padding.getLeft());
	}
	
	@Test
	public void setBottomValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setBottom(value);
		Assert.assertEquals(value, padding.getBottom());
	}
	
	@Test
	public void setRightValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setRight(value);
		Assert.assertEquals(value, padding.getRight());
	}
	
	@Test
	public void getHorizontalPaddingReturnsZeroByDefault() {
		Padding padding = new Padding();
		Assert.assertEquals(0, padding.getHorizontalPadding());
	}
	
	@Test
	public void getHorizontalPaddingSetLeftAndRight() {
		int left = (int) (Math.random() * Integer.MAX_VALUE);
		int right = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setLeft(left);
		padding.setRight(right);
		Assert.assertEquals(left + right, padding.getHorizontalPadding());
	}
	
	@Test
	public void getVerticalPaddingReturnsZeroByDefault() {
		Padding padding = new Padding();
		Assert.assertEquals(0, padding.getVerticalPadding());
	}
	
	@Test
	public void getVerticalPaddingSetTopAndBottom() {
		int top = (int) (Math.random() * Integer.MAX_VALUE);
		int bottom = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setTop(top);
		padding.setBottom(bottom);
		Assert.assertEquals(top + bottom, padding.getVerticalPadding());
	}
	
	@Test
	public void setSizeGetTop() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setSize(size);
		Assert.assertEquals(size, padding.getTop());
	}
	
	@Test
	public void setSizeGetLeft() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setSize(size);
		Assert.assertEquals(size, padding.getLeft());
	}
	
	@Test
	public void setSizeGetBottom() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setSize(size);
		Assert.assertEquals(size, padding.getBottom());
	}
	
	@Test
	public void setSizeGetRight() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Padding padding = new Padding();
		padding.setSize(size);
		Assert.assertEquals(size, padding.getRight());
	}

}
