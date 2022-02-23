Write a class ElementCheck with a public method elementFinder that takes two parameters one is arr of type int[] second one is element of type int that returns true if the element present in the arr only one time.

Assumptions:
arr is never null
These are examples for your understanding:
Enter no of elements in the array:
5
Enter elements in the array seperated by space:
9 5 12 35 6
Enter the search element:
5
true
Enter no of elements in the array:
4
Enter elements in the array seperated by space:
1 2 2 3
Enter the search element:
2
false

package q11054;

public class ElementCheck {
	/**
	 * Compute if the given elemetn is present in the array only one time
	 * 
	 * 
	 * @return true if it is present else return false
	 */
	
	public boolean elementFinder(int[] arr, int element) {
		
		//Write your code here
	int	count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element){
				count++;
				//break;
			}
		}
	if(count==1){
		return true;
	}else{
		return false;
	}
		
	}
}