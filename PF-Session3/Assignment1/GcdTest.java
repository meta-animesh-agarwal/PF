import static org.junit.Assert.*;

import org.junit.Test;


public class GcdTest {
	Gcd gcd = new Gcd();
	@Test
	public void test() {
		assertEquals(1, gcd.gcd(2, 1));
	}
	
	@Test
	public void test2() {
		assertEquals(6, gcd.gcd(12, 18));
	}
	
	@Test
	public void test3() {
		assertEquals(1, gcd.gcd(100, 3));
	}
	
	@Test
	public void test4() {
		assertEquals(5, gcd.gcd(25, 15));
	}
}
