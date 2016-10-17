import static org.junit.Assert.*;

import org.junit.Test;


public class DarkRoastTest {

	@Test
	public void testCost() {
		double actual;
		Coffee darkRoast = new DarkRoast();
		actual = darkRoast.cost();
		
		
		double expected = 2.5;
		
		assertTrue(actual == expected);
		
		
		
	}

	@Test
	public void testDarkRoast() {
		Coffee darkRoast = new DarkRoast();
		String desc = "Testing";
		
		darkRoast.setDescription(desc);
		
		String actual =darkRoast.getDescription();
		String expected = desc;
		
		assertTrue (actual == expected);
	}

}
