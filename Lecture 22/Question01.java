Write a class ElementCheckInEveryPair with a public method checkElement that takes two parameters one is arr of type int[] and second one is arg of type int and returns true if every pair of arr contains at least one arg.

Assumptions:
arr is never null
These are examples for your understanding:
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
52 2 3 2 65 2
Enter the search element:
2
true
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
4 5 4 1 1 4
Enter the search element:
4
false


Note: Please don't change the package name.
Sample Test Cases
Test Case 1:
Expected Output:
Enter·no·of·elements·in·the·array:
7
Enter·elements·in·the·array·seperated·by·space:
1 2 3 2 2 4 2
Enter·the·search·element:
2
true

Test Case 2:
Expected Output:
Enter·no·of·elements·in·the·array:
6
Enter·elements·in·the·array·seperated·by·space:
1 2 2 1 1 2
Enter·the·search·element:
2
false

Test Case 3:
Expected Output:
Enter·no·of·elements·in·the·array:
6
Enter·elements·in·the·array·seperated·by·space:
52 2 3 2 65 2
Enter·the·search·element:
2
true

Test Case 4:
Expected Output:
Enter·no·of·elements·in·the·array:
6
Enter·elements·in·the·array·seperated·by·space:
4 5 4 1 1 4
Enter·the·search·element:
4
false

package q11082;

public class ElementCheckInEveryPair {
	/**
	 * Find every pair of array contains atleast one arg
	 * 
	 * 
	 * 
	 * 
	 *@return result 
	 */ 
	
	public boolean checkElement(int[] arr, int arg) {
		//Write your code here
	
	
	boolean t = false;
	
	for(int i=0; i<arr.length-1; i++){
		
		if(arr[i] == arg || arr[i+1] == arg){
			
			t = true;
		}		
			else{
				
				return false;
			}
	}
				return t;

			
		
	}
}