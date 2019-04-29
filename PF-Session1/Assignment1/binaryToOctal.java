/*
 * This file contains the BinaryToOctal class
 * which is used to convert binary number to octal
 */

/**
 * BinaryToOctal Class contains a method which 
 * converts binary number to octal number
 * @author Animesh Agarwal
 *
 */
class BinaryToOctal {
	
	/**
	 * convertBinaryToOctal method is a 
	 * method which converts binary 
	 * number to octal number
	 * @param binaryNum
	 * @return octalNum
	 */
	int convertBinaryToOctal(int binaryNum) {
				
		int octalNum = 0;				//stores our octal number which is to be returned		
		int count = 0;					//counts the number of time the loop is running		
		int intermediateVal = 0;		//stores the intermediate value generated while converting
		int multiplicant = 1;			//stores the multiplicant
		
		/* main loop to calculate octal number */
		while(binaryNum != 0) {				
			intermediateVal += (binaryNum % 10) * Math.pow(2, count);	//Calculating last digit ofoctal number in three iterations
			++count;													//incrementing counter
			binaryNum /= 10;
			
			/* Intermediate value is assigned to the octal number */
			if(count == 3 || binaryNum == 0) {
				octalNum += (intermediateVal * multiplicant);		//Assigning the value to octal number
				count = 0;											//Reinitializing count
				multiplicant *= 10;									//Reinitializing multiplicant
				intermediateVal = 0;								
			}
		}
		return octalNum;
	}
}