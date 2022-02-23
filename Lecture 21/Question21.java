Write a class CountEvens with a public method countEvens that takes one parameter arr of type int[] and returns the count of even numbers present in the arr.

Assumptions:
arr is never null
These are examples:
Enter no of elements in the array:
5
Enter elements in the array seperated by space:
1 2 3 4 6
3
Enter no of elements in the array:
5
Enter elements in the array seperated by space:
1 3 7 9 5
0

package q11069;


public class CountEvens {
	/**
	 * Find the count of even numbers in the given array
	 * 
	 * 
	 * 
	 * @return count
	 * 
	 */ 
	
	
	public int countEvens(int[] arr) {
		int count=0;
		//Write your code here
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		return count;
		
		
	}
}