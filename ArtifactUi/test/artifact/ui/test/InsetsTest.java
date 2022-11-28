package artifact.ui.test;

import org.junit.Assert;
import org.junit.Test;

import artifact.ui.Insets;

public class InsetsTest {
	
	@Test
	public void getTopReturnsZeroByDefault() {
		Insets insets = new Insets();
		Assert.assertEquals(0, insets.getTop());
	}
	
	@Test
	public void getLeftReturnsZeroByDefault() {
		Insets insets = new Insets();
		Assert.assertEquals(0, insets.getLeft());
	}
	
	@Test
	public void getBottomReturnsZeroByDefault() {
		Insets insets = new Insets();
		Assert.assertEquals(0, insets.getBottom());
	}
	
	@Test
	public void getRightReturnsZeroByDefault() {
		Insets insets = new Insets();
		Assert.assertEquals(0, insets.getRight());
	}
	
	@Test
	public void setTopValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setTop(value);
		Assert.assertEquals(value, insets.getTop());
	}
	
	@Test
	public void setLeftValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setLeft(value);
		Assert.assertEquals(value, insets.getLeft());
	}
	
	@Test
	public void setBottomValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setBottom(value);
		Assert.assertEquals(value, insets.getBottom());
	}
	
	@Test
	public void setRightValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setRight(value);
		Assert.assertEquals(value, insets.getRight());
	}
	
	@Test
	public void getHorizontalInsetsReturnsZeroByDefault() {
		Insets insets = new Insets();
		Assert.assertEquals(0, insets.getHorizontalInsets());
	}
	
	@Test
	public void getHorizontalInsetsSetLeftAndRight() {
		int left = (int) (Math.random() * Integer.MAX_VALUE);
		int right = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setLeft(left);
		insets.setRight(right);
		Assert.assertEquals(left + right, insets.getHorizontalInsets());
	}
	
	@Test
	public void getVerticalInsetsReturnsZeroByDefault() {
		Insets insets = new Insets();
		Assert.assertEquals(0, insets.getVerticalInsets());
	}
	
	@Test
	public void getVerticalInsetsSetTopAndBottom() {
		int top = (int) (Math.random() * Integer.MAX_VALUE);
		int bottom = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setTop(top);
		insets.setBottom(bottom);
		Assert.assertEquals(top + bottom, insets.getVerticalInsets());
	}
	
	@Test
	public void setSizeGetTop() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setSize(size);
		Assert.assertEquals(size, insets.getTop());
	}
	
	@Test
	public void setSizeGetLeft() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setSize(size);
		Assert.assertEquals(size, insets.getLeft());
	}
	
	@Test
	public void setSizeGetBottom() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setSize(size);
		Assert.assertEquals(size, insets.getBottom());
	}
	
	@Test
	public void setSizeGetRight() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Insets insets = new Insets();
		insets.setSize(size);
		Assert.assertEquals(size, insets.getRight());
	}

}
