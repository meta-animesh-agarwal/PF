/*
 * This file contains a class to join array
 */

/**
 * This class contains a method which 
 * joins two sorted arrays into one 
 * @author Animesh Agarwal
 *
 */
public class JoinArray {
   
	/**
	 * join method is used to join two sorted array and 
	 * return a sorted array without using actual sort
	 * @param a
	 * @param aSize
	 * @param b
	 * @param bSize
	 * @param c
	 * @return
	 */
    int[] join(int[] a, int aSize, int[] b, int bSize, int[] c){
        int aStartIndex = 0;			//Array a starting index
        int bStartIndex = 0;			//Array b starting index
        int cStartIndex = 0;			//Array c starting index
        
        /* Used to transfer a and b array until one of them ends */
        while((aStartIndex < aSize) && (bStartIndex < bSize)){
            if(a[aStartIndex] <= b[bStartIndex]){
                c[cStartIndex] = a[aStartIndex++];
            } 
            else{
                c[cStartIndex] = b[bStartIndex++];
            }
            cStartIndex++;
        }
        
        /* Used to transfer a array if left any */
        while(aStartIndex < aSize){
            c[cStartIndex] = a[aStartIndex++];
            cStartIndex++;
        }
        
        /* Used to transfer b array if left any */
        while(bStartIndex < bSize){
            c[cStartIndex] = b[bStartIndex++];
            cStartIndex++;
        }
        return c;
    }
	
}