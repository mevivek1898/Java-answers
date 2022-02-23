When an exception occurs while the code is running, the JVM tries to provide as much information as possible regarding the line of code which triggered the exception.

This information usually spans multiple lines which is called the exception stack trace.

Click on Submit button to see the exception stack trace produced while executing the code.

It is very easy to fix the error in this scenario. However, we will first click on the Submit button and then learn to read the stack trace information provided.

Caused by: java.lang.ArithmeticException: / by zero		// it contains the exception class name followed by message
        at ExceptionDemo2.divide(ExceptionDemo2.java: 9 )	//  line - 9 
        at ExceptionDemo2.main(ExceptionDemo2.java: 5 )		//  line - 5 
        ... 6 more

The exception stack trace contains two lines from the ExceptionDemo2 class.

The top most line in the exception stack trace which is from our code (meaning from a class written by us) is responsible for causing the exception.

When the statement in line 9 in our code (ExceptionDemo2 class) is analyzed for the ArithmeticException with error message / by zero , we can easily figure out that the value contained in the variable divisor is 0 (zero).

There can be some scenarios where the top most line is from a class available in Java standard classes or a class written by a third party library provider, in such cases we will have to ignore such lines till we find the lines which are from classes written by us.

After you have understood the above stated rules, correct the error in the code by replacing the value 0 of variable number2 with 2 and click on Submit.


package q11318;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		int number1 = 34;
		int number2 = 2;
		int result = divide(number1, number2);
		System.out.println("result = " + result);
	}
	public static int divide(int number, int divisor) {
		return number / divisor;
	}
}
