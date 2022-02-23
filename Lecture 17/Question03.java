Factorial of a non-negative integer n is denoted by n!. It is the product of all positive integers less than or equal to n.

Write a class FactorialCalculator with a public method factorial. The method receives one parameter n of type int. Fill in the missing code in the below program to calculate the factorial of a given number and print the output.

For example:
Cmd Args: 4
Factorial of 4 = 24
Hint: You can use the integer variable factorial initialized to 1, to store the computed factorial value. You can write a for loop which iterates from 2 to n multiplying the loop counter in each iteration with factorial and storing the product again in factorial.

Note: Please don't change the package name.

package q10883;
public class FactorialCalculator {
	public void factorial(int n) {
		int factorial = 1;
		//Fill in the missing code using the for loop
		int i=1;
		while(i<=n){
			factorial*=i;
			i++;
		}
		
		System.out.println("Factorial of " + n + " = " + factorial);
	}
}