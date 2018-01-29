/*
 * This file contains a class which
 * detects and deletes the duplicates numbers in array
 */
package duplicate;

import java.util.Arrays;

/**
 * Duplicate class contains a method which delete all 
 * the duplicate elements in an array
 * @author Animesh Agarwal
 *
 */
class Duplicate {
	
	/**
	 * removeDuplicate method is a method which 
	 * deletes the duplicate element in an array
	 * @param input
	 * @return arraywithoutduplicates
	 */
	 int[] removeDuplicate(int input[]) {
		 
		 int n = input.length;						//contains the length of input array
		 int count = 1;								//used to count the number of unique elements
		 int[] uniqueElements = new int[n];			//stores unique elements
		 
		 uniqueElements[0] = input[0];
		 
		 /* loop for deleting the duplicate elements */
		 for(int i = 1; i < n; i++) {
			 for(int j = 0; j < count; j++) {
				 if(input[i] == uniqueElements[j]) {			//checking each element
					 break;
				 }
			 }
			 if(j == count) {						//used to assign the unique element
				 uniqueElements[count] = input[i];
				 count++;
			 }
		 }
			 return Arrays.copyOfRange(uniqueElements, 0, count);				//Function is used to return a sub array
	 }
}
