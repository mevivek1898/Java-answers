Write a class SumOfIntegers with a public method calcSum that takes one parameter arr of type int[] and returns the sum of all integers in the arr. The return type of calcSum should be int.

Here is an example:
Cmd Args : 1 3 5 7 9
Sum = 25
Fill in the missing in the below program.

Note: Please don't change the package name.

package q10876;
public class SumOfIntegers {
	public int calcSum(int[] arr) {
		int sum = 0;
		// Fill in the missing code for the for-each statement given below
	for	 ( int value : arr) {
			sum += value;
		}
		return  sum;
	}
}

