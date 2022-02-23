Create a class ArrayReverser with a public method reverseArray that takes one parameter arr of type int[] and returns all the elements in the arr in reverse order. The return type of reverseArray should be int.

Assumptions:
arr is never null
Here is an example:
Cmd Args : 1 2 3 4
4
3
2
1

package q10944;

public class ArrayReverser {
	/**
	 * Compute the reverse order of the given array
	 * 
	 * 
	 * @return resultant array
	 */ 
	public int[] reverseArray(int[] arr) {
		//Write your code here
		int ans[]= new int [arr.length];
		int j=arr.length;
		for(int i=0;i<arr.length;i++){
			ans[j-1]=arr[i];
			j--;
		}
		return ans;
	}
}