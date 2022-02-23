Write a class FindMiddle with a public method findMiddle that takes one parameter arr of type int[] and print the middle element in the arr

Assumptions:
arr is never null
arr length is even it should print the middle two numbers
arr length is odd it prints the middle element
Here are examples for your understanding:
Cmd Args : 1 6 3 5 4
3
Cmd Args : 3 2 1 6 5 4
1
6

package q11061;

public class FindMiddle {
	/**
	 * Find the middle element in the given array
	 * 
	 * 
	 * 
	 * @ return element
	 */ 
	public void findMiddle(int[] arr) {
		
		//Write your code here
		int left=0;
		int right=arr.length;
		int mid =(right+left)/2;
	if(right%2==0)
		System.out.println(arr[right/2-1]+"\n"+ arr[right/2]);
		else
		System.out.println(arr[right/2]);
		
		
}
}