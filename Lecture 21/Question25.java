Write a class FindDuplicate with a public method findDuplicate that takes two parameters one is arr of type int[] and second one is arg of type int and returns true if arg present more than once in the arr. The return type of findDuplicate should be boolean.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
999 77 77 88 54 -8
Enter the element you want to search:
77
true

package q11073;

public class FindDuplicate {
	/**
	 * Find the arg element occures in the arr more than once
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean findDuplicate(int[] arr, int arg) {
		//Write your code here
		boolean ans=false;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arg){
		count++;
			
			if(count>1){
			return true;
			}
		}
		}
		return false;
	}
}