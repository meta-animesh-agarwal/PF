/*
 * This file contains a class LinearSearch used 
 * for searching an array in linear form
 */


/**
 * LinearSearch is a class which is used to 
 * search an element in a given array
 * @author Animesh Agarwal
 */
class LinearSearch {

   /**
    * This method uses recurssion to search an element present in a 
    * particular array if element isn't present then it return -1 else it returns the index of that element
    * @param {int[]}arr array of integers to be searched
    * @param {int}fIndex starting index
    * @param {int}searchNum value to be searched
    * @return {int} the index of the element if found else -1 if not found
    */
    public int linearSearch(int[] arr, int fIndex, int searchNum) {
    	
    	/* checking for condition when element is not found */
        if(arr.length == fIndex) {
            return -1;
        }
        
        /* checking for condition when index is present of present index */
        if(arr[fIndex] == searchNum) {
                return fIndex + 1;
            }
        return linearSearch(arr, fIndex + 1, searchNum);
    }
}
