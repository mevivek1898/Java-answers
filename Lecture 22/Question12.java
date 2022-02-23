Write a class SequenceCheck with a public method checkSequence that takes one parameter arr of type int[] and returns true if any three consecutive elements in arr are in incremental order.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
1 2 3 7 4 6
true

package q11097;

public class SequenceCheck {
	/**
	 * Find three consecutive elements in the array are in incremental order or not
	 * 
	 * 
	 * 
	 * @return result
	 */
	
	public boolean checkSequence(int[] arr) {
		//Write your code here
		boolean t=false;
		
		for (int i=0; i<arr.length-2; i++){
			
			if(arr[i+1]==arr[i]+1 && arr[i+2]==arr[i+1]+1){
				
				return true;
				
				
				
			}
			
		}
		
		return t;
		
	
	
	
	}
}