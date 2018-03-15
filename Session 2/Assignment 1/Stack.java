/*
 * This file contains main implementation of stack
  */

/**
 * This class is used implement stack
 * @author Animesh Agarwal
 */
public class Stack {

	Node top;
	
	/**
	 * Push function is used to insert an element in the stack
	 * @param {char}data - the data to be entered in the stack
	 */
	void push(char data) {
		Node newNode = new Node();
		newNode.data = data;
		
		/*to check whether stack is already created or not*/
		if(top != null) {
			newNode.next = top;
		}
		
		top =newNode;
	}
	
	/**
	 * Pop function is used to pop out an element of the array
	 * @return
	 */
	char pop() {
		if(top != null) {
			char data = top.data;
			if(top.next != null) {
				top = top.next;
			}
			else {
				top = null;
			}
			return data;
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	

}
