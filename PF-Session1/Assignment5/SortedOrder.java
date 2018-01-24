/*
 * This file contains a class SortedOrder used to determine the 
 * order of the given array.
 */

/**
 * SortedOrder is a class used to determine 
 * the order of the given array
 * @author Animesh Agarwal
 *
 */
public class SortedOrder {
	
	/**
	 * sortedOrder method is used to determine the order of a given array.
	 * @param input
	 * @return 0 if unsorted
	 * @return 1 if Ascending
	 * @return 2 if Descending
	 */
	int sortedOrder(int[] input) {
		int n=input.length;								//Length of the input array
		
		/* Used to see if the array is in ascending */
		if(input[0] < input[1]) {
			for(int i = 2; i < n; i++) {
				if(input[i-1] > input[i]) {				//Used for unsorted array
					return 0;
				}
			}
			return 1;
		}
		else {											
			for(int i = 2; i < n; i++) {						//Used for descending array
				if(input[i - 1] < input[i]) {				//used for unsorted array
					return 0;
				}
			}
			return 2;
		}
	}
}