/* This file contains a class which uses backtracking to solve nqueens problem */

/**
 * NQueens class contains two methods which uses backtracking to solve the nqueens problem
 * @author Animesh Agarwal
 *
 */
public class NQueens {
	
	/**
	 * nQueens is a method which uses backtracking to find the solution for nqueens problem
	 * @param {int[][]}board the board in which we have to implement nqueens
	 * @param {int}row initial row from which we have to start storing the queens
	 * @param {int}dimentionOfMatrix dimention of matrix
	 * @return {boolean} returns wheather it have a solution of not
	 */
	boolean nQueens(int[][] board, int row, int dimentionOfMatrix) {
		
		/* base condition to end recursion */
		if(row >= dimentionOfMatrix) {
			return true;
		}
		
		/* checking every place in a particual loop for required possible solution */
		for(int i = 0; i < dimentionOfMatrix; i++) {
			if(isSafe(board, row, i, dimentionOfMatrix)) {
				board[row][i] = 1;
				
				if(nQueens(board, row + 1, dimentionOfMatrix)) {
					return true;
				}
				
				board[row][i] = 0;				//For backtracking condition
			}
		}
		return false;
	}
	
	/**
	 * isSafe is a method which is used to check for wheather a particular place is safe or not
	 * we have to check it in 3 directions i.e. in the coloumn,left diagonal,right diagonal
	 * @param {int[][]}board the board in which we have to implement nqueens
	 * @param {int}row row in which the queen is placed
	 * @param {int}col coloumn in which the queen is placed
	 * @param {int}dimentionOfMatrix dimention of matrix
	 * @return {boolean} returns wheather it is safe to place the queen there or not
	 */	
	boolean isSafe(int[][] board, int row, int col, int dimentionOfMatrix) {
		
		/* checking the coloumn */
		for(int i = row - 1; i >= 0; i--) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		/* Checking the left upper diagonal*/
		for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		/* Checking the right upper diagonal*/
		for(int i = row - 1, j = col + 1; i >= 0 && j < dimentionOfMatrix; i--, j++) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		return true;	
	}
}