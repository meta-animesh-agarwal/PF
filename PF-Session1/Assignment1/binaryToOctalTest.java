import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class binaryToOctalTest {
	
	BinaryToOctal bto;
	@Before
	public void initialize() {
		bto = new BinaryToOctal();
	}

	@Test
	public void test1() {
		assertEquals(65,bto.convertBinaryToOctal(110101));
	}
	
	@Test
	public void test2() {
		assertEquals(52,bto.convertBinaryToOctal(101010));
	}
	
	@Test
	public void test3() {
		assertEquals(70,bto.convertBinaryToOctal(111000));
	}
	
	@Test
	public void test4() {
		assertEquals(57,bto.convertBinaryToOctal(101111));
	}
}
