Write a class CompareArrays with a public method compareArrays that takes two parameters arr1 and arr2 are of type int[] and returns true if the lengths of arr1 and arr2 are equal.

Here is an example:
Enter lenght of the arr1:
5
Enter lenght of the arr2:
5
tru

package q11066;

public class CompareArrays {
	/**
	 * Find the length of the two arrays are equal or not
	 * 
	 * 
	 * @return result
	 */ 
	
	
	
	public boolean compareArrays(int[] arr1, int[] arr2) {
		//Write your code here
	boolean	ans=(arr1.length==arr2.length)?true:false;
	return ans;
	}
}