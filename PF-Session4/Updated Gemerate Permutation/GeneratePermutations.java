/*
 * This program will implements the logic of
 * generating all set of permutations of letters
 * of a string
 */
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements algorithm for generating
 * all possible combination of letters in a string.
 * @author Animesh Agarwal
 * @version 1.0
 */
public class GeneratePermutations {

	/**
	 * This method recursively generate permutation of a string
	 * @param {String}string - the string of which we have to generate permutation
	 * @return {List}set - list of string
	 */
	List<String> generatePermutations(String string) {
		int n = string.length();					//store length of string
		List<String> set = new ArrayList<>();		//list which contains list of all permutations
		
		/*	Return condition	 */
		if(n == 1) {
			set.add(string);
			return set;
		}
		
		/*loop to perform the action*/
		for(int i=0; i < n; i++) {
			
			/*check for empty string*/
			if (string.length() == 0) {
				throw new ArithmeticException("String size should be greater than zero");
			}
			
			char character = string.toCharArray()[i];									//Assign the ith element of string to character
			String remaining = string.substring(0, i) + string.substring(i+1, n);		//Assign the remaining sting
			List<String> temp = generatePermutations(remaining);						//Recursive call with rest of the string
			
			/*Appending character to all the elements of list*/
			for(int j = 0; j <  temp.size(); j++) {
				set.add(character + temp.get(j));
			}
		}
		return set;
	}
}