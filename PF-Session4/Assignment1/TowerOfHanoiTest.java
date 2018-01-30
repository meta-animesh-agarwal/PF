import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class TowerOfHanoiTest {
	TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

	@Test
	public void testTowerOfHanoi() {
		int n = 3;
		List<String> expected=Arrays.asList("Move disk 1 from rod A to rod C",
				"Move disk 2 from rod A to rod B",
				"Move disk 1 from rod C to rod B" ,
				"Move disk 3 from rod A to rod C" ,
				"Move disk 1 from rod B to rod A" ,
				"Move disk 2 from rod B to rod C" ,
				"Move disk 1 from rod A to rod C" );
		try {
			assertEquals(expected, towerOfHanoi.towerOfHanoi(n, 'A', 'C', 'B'));
		} catch (DiskException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DiskException.class)
	public void testTowerOfHanoi1() throws DiskException {
		int n = 0;
		List<String> expected=Arrays.asList("");
		assertEquals(expected, towerOfHanoi.towerOfHanoi(n, 'A', 'C', 'B'));
	}
	
	@Test(expected = DiskException.class)
	public void testTowerOfHanoi2() throws DiskException {
		int n = -2;
		List<String> expected=Arrays.asList("");
		assertEquals(expected, towerOfHanoi.towerOfHanoi(n, 'A', 'C', 'B'));
	}

}
