package duplicate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class duplicateTest {
	Duplicate duptest;
	@Before
	public void init() {
		duptest = new Duplicate();
	}
	@Test
	public void test1() {
		int[] input = {1,1,2,2,2};
		int[] output = {1,2};
		assertArrayEquals(output,duptest.removeDuplicate(input));
	}
	@Test
	public void test2() {
		int[] input = {1,1,2,2,3,4,5,7,3,6,9,5,1,4,7};
		int[] output = {1,2,3,4,5,7,6,9};
		assertArrayEquals(output,duptest.removeDuplicate(input));
	}
	@Test
	public void test3() {
		int[] input = {1,2,-1,-1};
		int[] output = {1,2,-1};
		assertArrayEquals(output,duptest.removeDuplicate(input));
	}
	@Test
	public void test() {
		int[] input = {1,1,2,2,10,20,30,40,50,40,30,20,10};
		int[] output = {1,2,10,20,30,40,50};
		assertArrayEquals(output,duptest.removeDuplicate(input));
	}
}
