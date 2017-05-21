package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Combination;

public class CombinationContructorTest {

	@Test
	public void testConstructor() {
		System.out.println("Combination(2,4)");
		int subItems = 2;
		int items = 4;
		long expectCombinations = 6L;
		Combination instance = new Combination(subItems, items);
		assertEquals(expectCombinations, instance.combinations());
		assertEquals(subItems, instance.size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testContructorSubItemError() {
		System.out.println("Combination(0,1)");
		int subItems = 0;
		int items = 1;
		Combination instance = new Combination(subItems, items);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testContructorItemError() {
		System.out.println("Combination(5,1)");
		int subItems = 5;
		int items = 1;
		Combination instance = new Combination(subItems, items);
	}

}
