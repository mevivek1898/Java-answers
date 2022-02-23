A do-while loop statement is used to execute one or more code statements once and then repeatedly execute the same code statements as long as the condition is true.
Its syntax is similar to the reverse of while loop, and note the extra ; which we have to provide at the end of while(condition)
do {
	statement1; 
	statement2;
	....
} while (condition);
Note: The statements inside the do-while block will be executed once before the condition in the while is evaluated.
The condition is an expression which should always evaluate to a boolean value.
If it evaluates to true, the body containing one or more code statements is executed.
If the expression evaluates to false, the body containing code statements is not executed.
For example:
	int value = 4, sum = 0;
	do { // start of do-while loop body
		sum = sum + value;
		value--;
	} while (value > 0);// end of do-while loop body
The condition in the above example is value > 0.
The code inside the do-while loop's block between the opening-brace { and the closing-brace }, will be repeatedly executed until the condition evaluates to false.
In our case, since in every iteration the value is decremented using value--;, after four iterations the value will be equal to 0 and the condition value > 0 will become false.
A do-while loop's body can contain two branching statements, break; and continue;, which we will learn later.
Click on  to understand the working of do-while loop.

In the below program with class DoWhileDemo, fill in the missing code inside the printNumbers(...) method using a do-while loop to print numbers from 1 to max (including max).

Note: Please don't change the package name.

package q10895;
public class DoWhileDemo {
	public void printNumbers(int max) {
		int num = 1;
		
		// Fill in the missing code using do-while statement to print 1 to max
		
		  do {
			System.out.println(num);
			num++;
		}while (num<=max) ;
	}
}