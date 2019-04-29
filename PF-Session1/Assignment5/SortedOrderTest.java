import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortedOrderTest {

	SortedOrder so;
	@Before
	public void init() {
		so=new SortedOrder();
	}
	@Test
	public void test() {
		int[] input = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(1,so.sortedOrder(input));
	}
	@Test
	public void test2() {
		int[] input = {9,8,7,6,5,4,3,2,1,0};
		assertEquals(2,so.sortedOrder(input));
	}
	@Test
	public void test3() {
		int[] input = {1,2,3,4,5,6,7,8,9,10,2};
		assertEquals(0,so.sortedOrder(input));
	}
}
