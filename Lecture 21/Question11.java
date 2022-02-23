Write a class SequenceCheck with a public method sequenceCheck that takes one parameter arr of type int[] and returns true if 6, 9, 12 present consecutively in the arr. The return type of sequenceCheck should be boolean.

Assumptions:
arr is never null
Elements 6, 9, 12 are appear consecutiviely
Here are examples:
Cmd Args : 62 32 6 9 12
true
Cmd Args : 99 36 6 12 56 9
false

package q11059;

public class SequenceCheck {
	/**
	 * Find the given elements present consecutively in the array or not
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean sequenceCheck(int[] arr) {
		boolean result=false;
		
		//Write your code here
		for (int i=0;i<arr.length-1;i++){
			if(arr[i]==6){
				if(arr[i+1]==9 && arr[i+2]==12){
					result =true;
				}else{
					return false;
				}
			}
		}
		return result;
	}
}