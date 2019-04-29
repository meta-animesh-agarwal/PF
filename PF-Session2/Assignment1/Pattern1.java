/*
 * This file contains a class Pattern1
 */


/**
 * This calss contains htree methoda spaces,numbers and print
 * used for printing of the pattern.
 * @author Animesh Agarwal
 */
public class Pattern1 {
	
	/**
	 * spaces method is a method which returns significant number of spcaes needed
	 * @param row
	 * @param n
	 * @return spaces
	 * @throws PatternException
	 */
	String spaces(int row,int n) throws PatternException {
		String spaces = "";			//Contains the spaces to return
		
		/* Used to throw exception for n and row is less than 0 */
		if((row < 0) || (n < 0)) {
			throw new PatternException("Number can't be less than zero");
		}
		
		/* Used to throw exception for row is greater than total number of rows availabe */
		if(row > ((2 * n) - 1)) {
			throw new PatternException("Row can't be less than pattern width");
		}
		
		/* Checking for condition for n is greater than or less tha row */
		if(row < n) {
			for(int j = 0; j < (n-row); j++) {					//Printing spaces for the upper half of the pattern
				spaces += " ";
			}
		}
		else {
			for(int j = 0; j < (row-n); j++) {					//Printing spaces for the lower half of the pattern
				spaces += " ";
			}
		}
		return spaces;
	}
	
	/**
	 * numbers method is a method which returns significant numbers needed in a particular row
	 * @param row
	 * @param n
	 * @return numbers
	 * @throws PatternException
	 */
	String numbers(int row,int n) throws PatternException {
		String number = "";							//used for storing numbers to return
		int j;
		
		/* Used to throw exception for n and row is less than 0 */
		if((row < 0) || (n < 0)) {
			throw new PatternException("Number can't be less than zero");
		}
		
		/* Used to throw exception for row is greater than total number of rows availabe */
		if(row > ((2 * n) - 1)) {
			throw new PatternException("Row can't be less than pattern width");
		}
		
		/* Checking for condition for n is greater than or less tha row */
		if(row <= n) {
			for(j = 1; j < row ; j++) {							//Printing numbers for the upper half of the pattern
				number += j;
			}
			for(;j>0;--j) {
				number += j;
			}
		}
		else {
			for(j = 1; j <= 2*n-row; j++) {						//Printing numbers for the lower half of the pattern
				number += j;
			}
			j -= 2;
			for(; j > 0; --j) {
				number += j;
			}
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
		print = new String[((2 * n) - 1)];
		for(int i = 0; i < ((2 * n) - 1); i++) {
			print[i] = spaces((i + 1), n) + numbers((i + 1), n);
		}
		return print;
	}
}

