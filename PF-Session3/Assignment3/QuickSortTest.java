import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSortTest {
	QuickSort qs = new QuickSort();
	
	@Test
	public void test() {
		int[] input = {2,5,8,9,10,77,55,11};
		int[] output = {2,5,8,9,10,11,55,77};
		assertArrayEquals(output, qs.sort(input,0,input.length-1));
	}
	
	@Test
	public void test1() {
		int[] input = {};
		int[] output = {};
		assertArrayEquals(output, qs.sort(input,0,input.length-1));
	}
}
