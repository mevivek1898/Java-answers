While a break; transfers control out (meaning terminates), a continue; statement transfers control to (meaning continues with next iteration) the innermost enclosing for, while and do statements.

Similar to a break statement, a continue statement can be written simply as continue; or with a label as continue targetLabelName;

for (int i = 1; i < 10; i++) {
	if (i % 2 == 0) {
		continue; // transfers control to for-loop, if i is divisible by 2. 
	}
	System.out.println(i);
}
The above code skips printing all even numbers.

Click on  to understand the working of continue in action.

In the below program the method skipEven(int[] args) receives an array of integers.

Fill in the missing code inside the skipEven(...) such that it uses a for-each loop to iterate over the array arr elements and uses the continue; statement to printing the even numbers.

Note: Please don't change the package name.'

package q10899;
public class ContinueDemo {
	public void skipEven(int[] arr) {
		// Fill in the missing code
		for ( int i=0;i<arr.length;i++) {
			if(arr[i]%2==0){
				continue;
			}
			
			System.out.println(arr[i]);
		}
	}
}