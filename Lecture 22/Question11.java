Write a class SymmetricalArrayCheck with a public method checkSymmetry that takes two parameters one is arr of type int[] and second one is n of type int and returns true if the first n numbers are same as the last n numbers in the arr.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
8
Enter elements in the array seperated by space:
1 2 3 5 6 1 2 3
Enter the search number you want to search:
3
true

package q11096;

public class SymmetricalArrayCheck {
	/**
	 * Find if the first n numbers or equal to the last n numbers or not
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkSymmetry(int[] arr, int n) {
		//Write your code here
		boolean t=false;
		
		for (int i=0; i<n; i++){
			
			if(arr[i]==arr[arr.length-n+i]){
				
				t=true;
				
				
				
			}else{
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	
		
	
}