/*
 *  This file contains a class to calculate the largest digit from the given number
 */

/**
 * LargestDigit is a class which contains a function largestdigit
 * @author Animesh Agarwal
 *
 */
public class LargestDigit {
	
	/**
	 * largestdigit is finding out the largest digit from the given number
	 * @param {int}x The number in which we have to find he largest digit
	 * @return {int} the largest digit present in the number
	 */
	int largestdigit(int x) {
		int maxValue;			//stores the maxvalue
		int value;				//stores the current value
		x = Math.abs(x);		//used for negative numbers
		value = x % 10;			
		if(x < 10) {
			return x;
		}
		maxValue = largestdigit(x / 10);
		if(maxValue < value) {
			return value;
		}
			return maxValue;
	}
}
