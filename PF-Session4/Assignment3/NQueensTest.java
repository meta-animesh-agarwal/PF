import static org.junit.Assert.*;

import org.junit.Test;


public class NQueensTest {

	NQueens nq = new NQueens();
	
	@Test
	public void test() {
		int [][] board = new int [][] {
	             { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0} };
		assertEquals(true, nq.nQueens(board, 0, 4));
	}

}
