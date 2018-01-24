/*
 * This file contains a class pattern2 for printing a pattern
 */

/**
 * This calss contains htree methoda spaces,numbers and print
 * used for printing of the pattern.
 * @author Animesh Agarwal
 *
 */
public class Pattern2 {

	/**
	 * spaces method is a method which returns significant number of spcaes needed
	 * @param row
	 * @param n
	 * @return spaces
	 * @throws PatternException
	 */
	String spaces(int row, int n) throws PatternException {
		String space = "";
		
		/* Used to throw exception for n and row is less than 0 */
		if((row < 0) || (n < 0)) {
			throw new PatternException("Number can't be less than zero");
		}
		
		/* Used to throw exception for row is greater than total number of rows availabe */
		if(row > n) {
			throw new PatternException("Row can't be less than pattern width");
		}
		for(int i = 1; i < row; i++) {
			space += " ";
		}
		return space;
	}
	
	/**
	 * numbers method is a method which returns significant numbers needed in a particular row
	 * @param row
	 * @param n
	 * @return numbers
	 * @throws PatternException
	 */
	String numbers(int row, int n) throws PatternException {
		String number = "";
		
		/* Used to throw exception for n and row is less than 0 */
		if((row < 0) || (n < 0)) {
			throw new PatternException("Number can't be less than zero");
		}
		
		/* Used to throw exception for row is greater than total number of rows availabe */
		if(row > n) {
			throw new PatternException("Row can't be less than pattern width");
		}
		for(int i = 1; i <= (n - row + 1); i++) {
			number += i ;
		}
		return number;
	}
	
	/**
	 * This method calls the above two method and returns the combination
	 * @param n
	 * @return print
	 * @throws PatternException
	 */
	String[] print(int n) throws PatternException {
		String[] print;
		
		/* Used to throw exception for n is less than 0 */
		if(n < 0) {
			throw new PatternException("Number can't be less than zero");
		}
		print = new String[n];
		for(int i = 1; i <= n; i++) {
			print[i - 1] = spaces(i, n) + numbers(i, n);
		}
		return print;
	}
}