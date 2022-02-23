Write a class SumOfElements with a public method sum that takes one parameter arr of type int[] and returns the sum of all elements in arr. The return type of sum should be long.

Assumptions:
arr is never null
return 0 in case arr is empty
Here is an example:
Cmd Args : 3 5 3 2 0
Sum of all elements in the given array is : 13
Note how the return type of the function is long and not int. The reason for this is to overcome errors due to data overflow while adding multiple int values.

package q11046;
public class SumOfElements {
	
	/**
	 * Computes the sum of all the elements in the given array
	 * 
	 * 
	 * @return the sum 
	 */
	public long sum(int[] arr) {
		// Write the code
		if(arr.length==0){
			return 0;
		}
	long sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}