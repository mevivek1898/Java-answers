A for-loop is used to iterate over a range of values using a loop counter, which is a variable taking a range of values in some orderly sequence (e.g., starting at 0 and ending at 10 in increments of 1).
Loop counter changes with each iteration of the loop, providing a unique value for each individual iteration. The loop counter is used to decide when to terminate the loop.

for (initialization; condition; update) {
    statement(s);
}
The initialization expression initializes the loop counter; it's executed once at the beginning of the loop.
The loop continues to execute as long as the condition evaluates to true.
The update expression is executed after each iteration through the loop, to increment, decrement or change the loop counter.
Example:
for (int i = 0; i < 10; i++) {
   System.out.println(i);
}
Above for-loop statement declares and initializes an integer variable i (which is the loop counter) as part of the initialization expression.
It increments the variable i by 1 in the update expression i++.
The condition is i < 10. The for loop keeps on executing the code inside the loop body as long as this condition evaluates to true. And the loop terminates when the condition evaluates to false.
It is a good practice to always keep the loop body which contains the code to be executed within an opening-brace { and a closing-brace }.
Click on  to understand the working of for-loop.

In the below program, the class ForDemo should print numbers from 1 to 10 on separate lines.
The code in the main method should use a for loop to initialize a loop counter i to 1, then print the value in i and increment i.

The for loop should iterate until i's value is less than or equal to 10.

Note: Pay attention to the less than or equal to condition in the above statement. Make sure to use println(...) and not print(...).

package q10880;
public class ForDemo {
	public static void main(String[] args) {
		
		// Fill in the missing code for the for-loop that prints 1 to 10 
	int i=1;	
		while (i>0 &&i<=10) {
			System.out.println(i);
			i++;
		}
	}
}