Write a class SumOfArrays with a public method sum that takes two parameters arr1 and arr2 are of type int[] and returns the sum of arr1 and arr2 elements in to the third array.

Assumptions:
arr1 and arr2 will never null
arr1 and arr2 are of same length
Here is an example:
Enter no of elements in the arr1:
3
Enter elements in the arr1 seperated by space:
1 2 3
Enter no of elements in the arr2:
3
Enter elements in the arr2 seperated by space:
4 5 6
5
7
9

package q11065;
public class SumOfArrays {
	/**
	 * Find sum of two array elements and store the elements in the third array
	 * 
	 * 
	 * 
	 * 
	 * @return resultant arry
	 */ 
	
	public int[] sum(int[] arr1, int[] arr2) {
		//Write your code here
		int ans[]=new int [arr1.length];
		for(int i=0;i<arr1.length;i++){
			ans[i]=arr1[i]+arr2[i];
		}
		return ans;
		
	}
}