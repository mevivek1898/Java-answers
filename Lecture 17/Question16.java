A break; statement is used to transfer control out of the enclosing switch, for, while and do-while statements.
A break statement can be written simply as break; or with a label as break targetLabelName;

for (int i = 1; i < 10; i++) {
	if (i % 5 == 0) {
		break; // breaks from for-loop, if i is divisible by 5. 
	}
	System.out.println(i);
}
Click on  to understand the working of break; statement.

Write a class BreakDemo with a public method calculateSum that takes one parameter arr of type int and returns the sum of all elements, untill it encounters a negative number. The return type of calculateSum should be int.

During the iteration if the code encounters a negative integer, the code should break (stop) from the iteration and return the sum of integers it encountered till then.

For example:
Cmd Args : 1 2 3 -4 5
6
Fill the missing code in the below program.

Hint: You can use for-each statement to iterate over the elements of the array.


package q10897;

public class BreakDemo {
	/**
	 * Calculate sum of numbers till the -ve number occures
	 * 
	 * 
	 * @return sum
	 */ 
	
	public int calculateSum(int[] arr) {
	
		//Write your code here
		int sum =0 ;
		
		for (int i=0;i<arr.length;i++){
			
			if(arr[i]<0){
				
				break;
				
			}else{
				
				sum+=arr[i];
				
			}
			
		}
		
		return sum;
		
	
		
		
	}
}
