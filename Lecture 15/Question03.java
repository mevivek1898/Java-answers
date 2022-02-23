Create a class SameNumbers with a public method checkNumbers that takes two parameters firstNo and secondNo are of type int and returns true if firstNo and secondNo are equal. The return type of checkNumbers should be boolean.

For example:
Cmd Args : 10 10
true
Cmd Args : 2 3
false
Note: Please don't change the package name.

package q10864;

public class SameNumbers {
	/**
	 * Check if the two numbers are equal or not
	 * 
	 * 
	 * 
	 * @return result
	 */
	 
	 
	public boolean checkNumbers(int a, int b) {
		//Write your code here
		if(a==b){
			return true;
		}else{
			return false;
		}
		
	}
}