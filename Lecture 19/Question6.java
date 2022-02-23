Create a class with name IndexFinder with public method printIndex that takes two parameters one is intArr of type int[] and second one is element of type int and returns only the first index match of the element in the intArr.

Assumptions:
arr is never null
arr may contain duplicate elements but returns the index of the first match of the element
Here is an example:
Cmd Args : 69 25 89 54 89
First match of the element 89 index is: 2


package q10941;

public class IndexFinder {
	/**
	 * Find the first index match of the element in the array
	 * 
	 * 
	 * @return index
	 */ 
	
	public int printIndex(int[] intArr, int element) {
		
		//Write your code here
		int ans=0;
		
		for (int i = 0; i < intArr.length; i++) {
			
			if (intArr[i] == element) {
				
			ans= i;
				
				break;
				
			}
			
			}
		return ans;
		
	}
}