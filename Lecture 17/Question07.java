A while statement is used to execute one or more code statements repeatedly as long as a condition is true.
Its syntax is
while (condition) {
	statement_1;
	statement_2;
	... 
}
The condition is an expression which should always evaluate to a boolean value (either true or false).
If it evaluates to true, the body containing one or more code statements is executed.
If the expression evaluates to false, the body containing code statements is not executed.
For example:
	int value = 4, sum = 0;
	while (value > 0) { // start of while loop body
		sum = sum + value;
		value--;
	} // end of while loop body
The condition in the above example is value > 0.
The code inside the while loop's block between the opening-brace { and the closing-brace }, will be repeatedly executed until the condition evaluates to false.
In our case, since in every iteration the value is decremented using value--;, after four iterations the value will be equal to 0 and the condition value > 0 will evaluate to false.
A while loop's body can contain two branching statements, break; and continue;, which we will learn later.
Click on  to understand the working of while-loop.

In the below program with class WhileDemo, fill in the missing code inside the printNumbers(...) method using a while loop to print numbers from 1 to max (including max).


package q10888;
public class WhileDemo {
	public void printNumbers(int max) {
		int num = 1;
		// Fill in the missing code using a while loop to print from 1 to max
		  while(num<=max) {
			System.out.println(num);
			num++;
			
		}
	}
}