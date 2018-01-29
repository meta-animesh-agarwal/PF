import static org.junit.Assert.*;
import org.junit.Test;


public class RemainderTest {
	Remainder rem = new Remainder();
	@Test
	public void test() {
		assertEquals(0,rem.rem(2, 1));		
	}
	
	@Test(expected = ArithmeticException.class)
	public void test2() {
		assertEquals(0,rem.rem(2, 0));
	}
	
	@Test
	public void test3() {
		assertEquals(1,rem.rem(100, 3));		
	}
	
	@Test
	public void test4() {
		assertEquals(0,rem.rem(5, 5));		
	}
	
	@Test
	public void test5() {
		assertEquals(2,rem.rem(2, 4));		
	}
}
