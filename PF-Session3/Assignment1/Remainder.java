/*
 * This file consists of a class which is used to find the remainder
 * */

/**
 * Remainder class consists of a method which is used to find 
 * the remainder of two given numbers
 * @author Animesh Agarwal
 *
 */
public class Remainder  {
	
	/**
	 * 
	 * @param {int}x is the dividend of the given two numbers
	 * @param {int}y is the divisor of the numbers
	 * @return {int}x which is the remainder we get on dividing the two numbers
	 * @throws ArithmeticException in case of divide by zero
	 */
	 int rem(int x, int y) throws ArithmeticException {
		 
		 /* Checking for zero condition */
		 if(y == 0){
			 throw new ArithmeticException();
		 }
		 
		 /* base condition */
		 if(x < y) {
			 return x;
		 }
		 return(rem(x - y, y));
	 }
}
