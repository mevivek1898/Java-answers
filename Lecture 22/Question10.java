Write a class SequenceOfEvens with a public method checkEvenSequence that takes one parameter arr of type int[] and returns true if three consecutive even numbers are present in the arr. The return type of checkEvenSequence is boolean.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
4
Enter elements in the array seperated by space:
2 4 6 5
true

package q11095;

public class SequenceOfEvens {
	/**
	 * Find three consecutive even numbers are present in the array or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public void checkEvenSequence(int[] arr) {
		//Write your code here
	
int count=0;

for (int i=0; i<arr.length; i++){
	
	if(arr[i]%2==0 && arr[i+1]%2==0 &&arr[i+2]%2==0 ){
		
		System.out.println("true");
		
		count++;
		
		break;
		
	}
	
}

if(count==0){
	
	System.out.println("false");
	
}





	}
}