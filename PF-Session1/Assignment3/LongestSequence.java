/*
 * This file contains a class  which 
 * finds the first longest sequence
 */

import java.util.Arrays;
 
/**
 * LongestSequence is a class which contains a methond 
 * which is used to find the longest sequence
 * @author Animesh Agarwal
 *
 */
public class LongestSequence {
	
	/**
	 * longestSequence is a method which is used to find 
	 * the longest sequence in an array
	 * @param input
	 * @return sub array of longest sequence
	 */
	int[] longestSequence(int input[]) {
		
		int n = input.length;				//Length of input array
		int currentPosition = 0;			//Current possition of loop
		int currentCount = 1;				//Current sequence count
		int maxCount = 1;					//Count of the longest sequence
		int sequencePosition = 0;			//Starting position of the longest sequence
		
		/* used for traversing the whole input array */
		for(int i = 1; i < n; i++) {
			if(input[i-1] < input[i]) {			//checking the condition
				currentCount++;
			}
			else if(maxCount < currentCount) {		//checking the value of max count
				maxCount = currentCount;
				sequencePosition = currentPosition;
				currentCount = 1;
				currentPosition = i;
			}
			else {									//if maxCount is still greater
				currentCount = 1;
				currentPosition = i;
			}
		}
		if(maxCount < currentCount) {				//Finally checking the condition
			maxCount = currentCount;
			sequencePosition = currentPosition;
		}		
		return Arrays.copyOfRange(input, sequencePosition, sequencePosition+maxCount);
	}
}