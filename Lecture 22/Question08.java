Write a class FindSumIgnoringSection with a public method findSum that takes three parameters one is arr of type int[] and other two are ignore1 and ignore2 are of type int and returns the sum of all the elements in the array, if the numbers ignore1 and ignore2, both appear in the array, ignore all the elements between them, including these two numbers.

Assumptions:
arr is never null
arr will not contain duplicate elements
Here is an example:
Enter no of elements in the array:
5
Enter elements in the array separated by space:
1 3 6 9 5
Enter the first element:
3
Enter the second element:
9
Sum of remaining elements is:
6

package q11093;
public class FindSumIgnoringSection {
	/**
	 * Compute the sum of all the elements in the array ignoring the elements between two ignore1 and ignore2 elements
	 * 
	 * 
	 * @return sum
	 * 
	 */ 
	public int findSum(int[] arr, int ignore1, int ignore2) {
		int a=0,b=0,sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == ignore1){
				
				a = i;
			}	
				if(arr[i] == ignore2){
					
					b = i;
				}
			}
					for(int i=0; i<arr.length; i++){
						
						if(i>=a && i<=b){
							
							continue;
						}	
							else{
							
							sum = sum + arr[i];
				}		
					}
							return sum;
	
	}
}