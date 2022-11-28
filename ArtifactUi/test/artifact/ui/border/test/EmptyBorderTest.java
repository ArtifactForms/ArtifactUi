package artifact.ui.border.test;

import org.junit.Assert;
import org.junit.Test;

import artifact.ui.Insets;
import artifact.ui.border.Border;
import artifact.ui.border.EmptyBorder;

public class EmptyBorderTest {

	@Test
	public void implementsBorderInterface() {
		EmptyBorder emptyBorder = new EmptyBorder();	
		Assert.assertTrue(emptyBorder instanceof Border);
	}
	
	@Test
	public void insetsAreNotNullByDefault() {
		EmptyBorder emptyBorder = new EmptyBorder();
		Assert.assertNotNull(emptyBorder.getInsets());
	}
	
	@Test
	public void topIsZeroByDefault() {
		EmptyBorder emptyBorder = new EmptyBorder();
		Insets insets = emptyBorder.getInsets();
		Assert.assertEquals(0, insets.getTop());
	}
	
	@Test
	public void bottomIsZeroByDefault() {
		EmptyBorder emptyBorder = new EmptyBorder();
		Insets insets = emptyBorder.getInsets();
		Assert.assertEquals(0, insets.getBottom());
	}
	
	@Test
	public void leftIsZeroByDefault() {
		EmptyBorder emptyBorder = new EmptyBorder();
		Insets insets = emptyBorder.getInsets();
		Assert.assertEquals(0, insets.getLeft());
	}
	
	@Test
	public void rightIsZeroByDefault() {
		EmptyBorder emptyBorder = new EmptyBorder();
		Insets insets = emptyBorder.getInsets();
		Assert.assertEquals(0, insets.getRight());
	}
	
	@Test
	public void getTop() {
		int top = (int) (Math.random() * Integer.MAX_VALUE);
		EmptyBorder border = new EmptyBorder(top, 0, 0, 0);
		Assert.assertEquals(top, border.getInsets().getTop());
	}
	
	@Test
	public void getBottom() {
		int bottom = (int) (Math.random() * Integer.MAX_VALUE);
		EmptyBorder border = new EmptyBorder(0, bottom, 0, 0);
		Assert.assertEquals(bottom, border.getInsets().getBottom());
	}
	
	@Test
	public void getLeft() {
		int left = (int) (Math.random() * Integer.MAX_VALUE);
		EmptyBorder border = new EmptyBorder(0, 0, left, 0);
		Assert.assertEquals(left, border.getInsets().getLeft());
	}
	
	@Test
	public void getRight() {
		int right = (int) (Math.random() * Integer.MAX_VALUE);
		EmptyBorder border = new EmptyBorder(0, 0, 0, right);
		Assert.assertEquals(right, border.getInsets().getRight());
	}
	
}
