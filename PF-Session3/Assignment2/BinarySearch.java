/*
 * This file contains a class which is used to search a element in an given sorted array
 */


/**
 * BinarySearch is a class which is used to 
 * search an element in a given sorted array its complexity is than liner search
 * @author Animesh Agarwal
 */
public class BinarySearch {

	/**
	 * This is a recurssive function to implement binary search is which we move to the middle 
	 * of the element compare it with that element if it is smaller move to left array, if it is
	 * greater move to right array and perform the same operation untill the element is found. 
	 * @param {int[]}sortedArray Array in which we have to search for the number
	 * @param {int}start index from which we have to start searching
	 * @param {int}end index till which we have to search
	 * @param {int}key the element to be searched
	 * @return {int} the index of the element if found else -1 if not found
	 */
    public int binarySearch(int[] sortedArray, int start, int end, int key) { 
    	int mid = (end + start) / 2;  								//storrint the middle of an array
    	
    	/* checkinh for the codition when element is not found */
        if (start < end) {
            
        	/*checking for the condition when middle element is greater than key */
            if (key < sortedArray[mid]) {
                return binarySearch(sortedArray, start, mid, key);		//moving toward the left array
            } 
            
            /*checking for the condiation when the middle element is less than the key */
            else if (key > sortedArray[mid]) {
                return binarySearch(sortedArray, mid+1, end , key);				//moving towards the right array
                 
            } 
            else {
                return mid;   
            }
        }
        return -1;  
    }
}
    