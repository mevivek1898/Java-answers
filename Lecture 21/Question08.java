Write a class ElementCheck with a public method elementFinder that takes one parameter arr of type int[] and returns true if the first four elements in the arr contains number 4 else returns false.

Assumptions:
arr is never null
Length of arr may be less than four
These are examples for understanding,
Cmd Args : 36 51 42 4
true
Cmd Args : 1 2
false


package q11056;

public class ElementCheck {
	
	/**
	 * Find if the first four elements in the array contains number 4 or not
	 * 
	 * 
	 * @return result
	 */
	 
	public boolean elementFinder(int[] arr) {
		
		//Write your code here
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=4 || arr.length>4){
				flag= false;
			}else{
				return true;
			}
		
		}	
			
	return flag;
			
	

}
}