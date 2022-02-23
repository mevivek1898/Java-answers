Write a class CheckSurroundedElement with a public method checkElement that takes one parameter arr of type int[] and print all the elements in the arr that are surrounded by left and right elements and not equal to the left and right elements.

Here is an example:
Enter·no·of·elements·in·the·arr1:
5
Enter·elements·in·the·arr1·seperated·by·space:
1 2 1 1 3
2


package q11088;

public class CheckSurroundedElement {
	/**
	 * Find the elements in the array surrounded by left and right and not equal to the left and right elements
	 * 
	 * 
	 * 
	 * @print the result
	 */ 
	
	public void checkElement(int[] arr) {
		//Write your code here
		int count=0;
		
		for (int i=1;i<arr.length; i++) {
			
			if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
				
				System.out.println(arr[i]);
				
				
				
				}
				
				
		}
		
	}
}