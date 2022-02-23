Write a class CompareArrays with a public method compare that takes two parameters arr1 and arr2 of type int[] find the difference between the corresponding arr1 and arr2 elements and returns the count of elements whose difference is less than 2 and greater than -2. The return type of compare should be int.

Assumptions:
arr1 and arr2 never will null
arr1 and arr2 have same length
Here is an example:
Enter no of elements in the arr1:
3
Enter elements in the arr1 seperated by space:
1 2 3
Enter no of elements in the arr2:
3
Enter elements in the arr2 seperated by space:
2 3 4
3

package q11087;

public class CompareArrays {
	/**
	 * Compute the difference between two arrays
	 * 
	 * Find the count of elements which have difference less than 2 and greater than -2
	 * 
	 * 
	 * 
	 * @return count
	 */ 
	
	public int compare(int[] arr1, int[] arr2) {
		//Write your code here
		int count=0;
		
		for (int i=0;i<arr1.length; i++) {
			
			int d = arr1[i] - arr2[i];
			
			if(d>-2 && d<2){
				
				count++;
				
			}
		}		
			return count;
			
	
	}
}