Create a class ArrayElementCounter with a public method countElement that takes two parameters one is arr of type int[] and second one is element of type int and returns the count of element occures in the arr. The return type of countElement should be int.

Assumptions:
arr is never null
Here is an example:
Cmd Args : 1 1 2 3 1
2

package q10943;

public class ArrayElementCounter {
	/**
	 * Find number of times the element present in the given array
	 * 
	 * 
	 * 
	 * @retrun count
	 */
	 
	public int countElement(int[] arr, int element) {
		//Write your code here
	
	
	int count = 0;
	
	for (int i = 0; i< arr.length; i++) {
		
		if (arr[i] == element) {
			
			count++;
			
		}
		
	}	return count;
		

		
	}
}