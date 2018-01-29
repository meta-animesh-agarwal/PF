/*
 * This file contains a class to claculate the GCD of given 2 numbers
 */

/**
 * Gcd class contains a function to calculate GCD of given two numbers.
 * @author Animesh Agarwal
 *
 */
public class Gcd {
	
	/**
	 * gcd function is using Euclidean Algorithm to 
	 * calculate the GCD of two given numbers
	 * @param {int}x First number of the gcd
	 * @param {int}y Second number in the gcd
	 * @return {int}x GCD of the given two numbers
	 */
	int gcd(int x, int y) {
		
		/* Checking for the case when second number is smaller than first */
		if(y > x) {
			int swap = y;
			y = x;
			x = swap;
		}
		
		if(y == 0) {
			return x;
		}
		return (gcd(y, (x % y)));
	}
}
