Write a class CheckAlternateNo with a public method checkAlternate that takes two parameters one is arr of type int[] and second one is arg of type int and returns true the element arg is present at every odd position of the arr. The return type of checkAlternate is boolean.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
5
Enter elements in the array seperated by space:
32 65 32 84 32
Enter the arg element to find:
32
true


package q11076;

public class CheckAlternateNo {
	/**
	 * Check if the arg element is present at every odd postition of the arr
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkAlternate(int[] arr, int arg) {
		
		//Write your code here
		int n=arr.length;
		int c1=0,c2=0;
		for(int i=0;i<n;i+=2){
			
				if(arr[i]==arg) return true;
				else return false;

		}
		 return true;

		
		
	}
}