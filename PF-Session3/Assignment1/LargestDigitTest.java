import static org.junit.Assert.*;

import org.junit.Test;


public class LargestDigitTest {
	LargestDigit ld = new LargestDigit();
	@Test
	public void test() {
		assertEquals(2, ld.largestdigit(-21));	
	}
	@Test
	public void test2() {
		assertEquals(9, ld.largestdigit(1257369));
		
	}
	@Test
	public void test3() {
		assertEquals(4, ld.largestdigit(444));
		
	}
	@Test
	public void test4() {
		assertEquals(2, ld.largestdigit(2));
		
	}
	@Test
	public void test5() {
		assertEquals(4, ld.largestdigit(-2144));
		
	}

}
