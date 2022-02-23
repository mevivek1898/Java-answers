Write a class ReversePrint with a public method reversePrint that takes one parameter arr of type int[] and returns the elements of arr in reverse order. The return type of ReversePrint should be int.

Assumptions:
arr is never null
Here is an example:
Cmd Args : 32 56 85 1
Array in reverse order is : 
1
85
56
32

package q11047;
public class ReversePrint {
	/**
	 * write a logic to find the array of elements in reverse order.
	 * 
	 * 
	 * @return the reverseArray 
	 */
	 
	 public int[] reversePrint(int[] arr) {
	 	//Wrtie code here
	 	int j=arr.length,ans[]=new int [arr.length];
	 	for(int i=0;i<arr.length;i++){
	 		ans[j-1]=arr[i];
	 		j--;
	 	}
	 	return ans;
	 }
}