import static org.junit.Assert.*;

import org.junit.Test;


public class BinarySearchTest {
	
	BinarySearch ls = new BinarySearch();
	
	
	@Test
	public void test() {
		int arr[] = {2,5,8,9,10, 55, 77};
		assertEquals(-1, ls.binarySearch(arr, 0, arr.length, 88));
	}
	
	@Test
	public void test1() {
		int arr[] = {2,5,8,9,10, 55, 77};
		assertEquals(6, ls.binarySearch(arr, 0, arr.length, 77));
	}
	
	@Test
	public void test2() {
		int arr[] = {};
		assertEquals(-1, ls.binarySearch(arr, 0, arr.length, 77));
	}

}