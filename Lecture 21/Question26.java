Write a class SumOfSameNumber with a public method findSumOf that takes two parameters one is arr of type int[] and second one is arg of type int and returns true if sum of all arg elements present in the arr is greater than or equal to 10.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
1 3 4 4 4 5
Enter the search element:
4
true

package q11074;

public class SumOfSameNumber {
	/**
	 * Compute the sum of all arg elments in the arr is greater than 10 or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean findSumOf(int[] arr, int arg) {
		//Write your code here
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arg) count++;
		}
		if(count*arg>=10) return true;
		else return false;
	}
}

