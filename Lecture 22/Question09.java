Write a class EitherOfASequence with a public method checkSequences that takes one parameter arr of type int[] and returns true only if one of these two sequences is present in the array: 18, 28 and 33, 36, returns false if none of these sequences are present or both are present. The return type of checkSequences is boolean.

Assumptions:
arr is never null
These are examples for understanding:
Enter no of elements in the array:
5
Enter elements in the array seperated by space:
18 28 36 4 2
true
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
18 28 5 6 33 36
false

package q11094;

public class EitherOfASequence {
	/**
	 * Find the given sequences are present in the arry or not 
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkSequences(int[] arr) {
		//Write your code here
		int count=0;
		
		for (int i=0; i<arr.length; i++){
			
			if(arr[i]==18 && arr[i+1] ==28){
				
				for(int j=0; j<arr.length; j++){
					
					if(arr[j] == 33 && arr[j+1] == 36){
						
						return false;
						
					}
				}
					
					return true;
					
				}
				
				if(arr[i]==33 && arr[i+2]==36){
					
					return true;
					
				}
				
			}
		
			
			return false;
			
	
	}
}