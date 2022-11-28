package artifact.ui.test;

import org.junit.Assert;
import org.junit.Test;

import artifact.ui.Margin;

public class MarginTest {
	
	@Test
	public void getTopReturnsZeroByDefault() {
		Margin margin = new Margin();
		Assert.assertEquals(0, margin.getTop());
	}
	
	@Test
	public void getLeftReturnsZeroByDefault() {
		Margin margin = new Margin();
		Assert.assertEquals(0, margin.getLeft());
	}
	
	@Test
	public void getBottomReturnsZeroByDefault() {
		Margin margin = new Margin();
		Assert.assertEquals(0, margin.getBottom());
	}
	
	@Test
	public void getRightReturnsZeroByDefault() {
		Margin margin = new Margin();
		Assert.assertEquals(0, margin.getRight());
	}
	
	@Test
	public void setTopValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setTop(value);
		Assert.assertEquals(value, margin.getTop());
	}
	
	@Test
	public void setLeftValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setLeft(value);
		Assert.assertEquals(value, margin.getLeft());
	}
	
	@Test
	public void setBottomValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setBottom(value);
		Assert.assertEquals(value, margin.getBottom());
	}
	
	@Test
	public void setRightValueGetReturnsValue() {
		int value = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setRight(value);
		Assert.assertEquals(value, margin.getRight());
	}
	
	@Test
	public void getHorizontalMarginReturnsZeroByDefault() {
		Margin margin = new Margin();
		Assert.assertEquals(0, margin.getHorizontalMargin());
	}
	
	@Test
	public void getHorizontalMarginSetLeftAndRight() {
		int left = (int) (Math.random() * Integer.MAX_VALUE);
		int right = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setLeft(left);
		margin.setRight(right);
		Assert.assertEquals(left + right, margin.getHorizontalMargin());
	}
	
	@Test
	public void getVerticalMarginReturnsZeroByDefault() {
		Margin margin = new Margin();
		Assert.assertEquals(0, margin.getVerticalMargin());
	}
	
	@Test
	public void getVerticalMarginSetTopAndBottom() {
		int top = (int) (Math.random() * Integer.MAX_VALUE);
		int bottom = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setTop(top);
		margin.setBottom(bottom);
		Assert.assertEquals(top + bottom, margin.getVerticalMargin());
	}
	
	@Test
	public void setSizeGetTop() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setSize(size);
		Assert.assertEquals(size, margin.getTop());
	}
	
	@Test
	public void setSizeGetLeft() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setSize(size);
		Assert.assertEquals(size, margin.getLeft());
	}
	
	@Test
	public void setSizeGetBottom() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setSize(size);
		Assert.assertEquals(size, margin.getBottom());
	}
	
	@Test
	public void setSizeGetRight() {
		int size = (int) (Math.random() * Integer.MAX_VALUE);
		Margin margin = new Margin();
		margin.setSize(size);
		Assert.assertEquals(size, margin.getRight());
	}

}
