Write a class ElementDiff with a public method findDiff that takes one parameter arr of type int[] and returns the difference between largest and smallest elements in the arr.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the arr:
5
Enter elements in the arr seperated by space:
33 78 95 14 45
Difference between largest and smallest elements in the array is: 8

package q11071;

public class ElementDiff {
	/**
	 * Compute the difference between large and small elements in the given arry
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findDiff(int[] a) {
		
		//Write your code here
		int max,min;
		
		int n=a.length;
		
		max=a[0];
		
		for(int i=0;i< n;i++){
			
			if(a[i]>max)
			
			{
				
				max=a[i];
				
			}
			
		}
		
		//find minimum
		
		min=a[0];
		
		for(int i=0;i< n;i++){
			
			if(a[i]< min)
			
			{
				
				min=a[i];
				
			}
			
		}
	return (max-min);
	
		}
	}
