import static org.junit.Assert.*;

import org.junit.Test;


public class LinearSearchTest {
	
	LinearSearch ls = new LinearSearch();
	
	
	@Test
	public void test() {
		int arr[] = {2,5,8,9,10, 77, 55};
		assertEquals(-1, ls.linearSearch(arr, 0, 88));
	}
	
	@Test
	public void test1() {
		int arr[] = {2,5,8,9,10, 77, 55, 11};
		assertEquals(6, ls.linearSearch(arr, 0, 77));
	}
	
	@Test
	public void test2() {
		int arr[] = {};
		assertEquals(-1, ls.linearSearch(arr, 0, 77));
	}

}
