Write a class InitializeArray with a public method initialize that takes two parameters len and ele are of type int returns an array of length len and set all the elements in the array to ele. Assumptions:
 arr is never null
Here is an example:
Enter length of array:
4
Enter element in the array:
3
The output array is:
3
3
3
3

package q11063;

public class InitializeArray {
	/**
	 * Set all the elemets in the array to given element and set to length of array to given length
	 * 
	 * 
	 * 
	 * @return arry 
	 */
	 
	public int[] initialize(int len, int ele) {
		//Write  your code here
		int a[]= new int [len];
		for(int i=0;i<len;i++){
			a[i]=ele;
		}
		return a;
		
	}
}