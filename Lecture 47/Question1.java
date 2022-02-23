An exception by its very definition is something which is not normal.

In programming, if the program does not run as expected due to some abnormal event or situation, the error produced is called an exception.

Java provides easy to use constructs to handle such situations.

Even before we learn how to handle exceptions let us see an exception and try fixing it.

The below example code when run produces an exception called java.lang.ArithmeticException.

Click on Submit button to see the exception details as given below.

Caused by: java.lang.ArithmeticException:  / by zero // it has exception class name followed by  error message 
        at ExceptionDemo1.main(ExceptionDemo1.java: 5 )	// it has the class/method name and the  line number  which triggered the exception
        ... 6 more

After you click on Submit and see the exception message, replace the value 0 of the divisor variable with 2 to fix the problem.

Important: Please note that the blue animating arrow which is shown when you click Submit, is shown by our intelligent error detection system. When you start coding using a regular IDE during work, you will not be helped like this. You will only be provided the error information (stack trace) without this animating arrow. Hence, learning how to read and understand exception stack traces becomes an essential part of programming.


package q11317;
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int number = 34;
		int divisor = 2;
		int result = number / divisor;
		System.out.println("result = " + result);
	}
}
