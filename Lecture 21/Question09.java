Write a class SumOfElements with a public method sum that takes one parameter arr of type int[] and returns sum of all positive elements in the arr. The return type of sum should be int.

Assumptions:
arr is never null
arr may contain -ve numbers
These are examples:
Cmd Args : -35 -52 -12 -99
Sum of all positive elements in the array is : 0
Cmd Args : 36 12 -11 10
Sum of all positive elements in the array is : 58

package q11057;

public class SumOfElements {
	/**
	 * Compute sum of all +ve elements in the array excluding -ve numbers
	 * 
	 * 
	 * @return sum
	 */ 
	
		public int sum(int[] arr) {
			
			//Write your code here
			int sum=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>=0){
					
				
				sum+=arr[i];
				}
			}
			return sum;
	
	}
}