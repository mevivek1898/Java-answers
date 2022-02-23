The exception stack trace can include classes which are not written by us. The below code when submitted will terminate with an exception whose stack trace will contain method call information from Java classes in java.lang package.

As a learner it is easy to get lost when we see so many error lines.

However, it is extremely easy to pinpoint the line with error if we follow a simple thumb rule.

To start with let us click on Submit button to see the exception stack trace produced by the code.

Do not try to fix the code. First let us try to understand the exception stack trace we get when we click Submit.

Caused by: java.lang.NumberFormatException: For input string: "4a"// notice the exception class name and error message
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at ExceptionDemo3.convertAndAdd(ExceptionDemo3.java: 10 )
        at ExceptionDemo3.main(ExceptionDemo3.java:5)
        ... 6 more

The first thing we should read in the exception stack trace is the line starting with Caused by: which contains the name of the exception class and the error message.

In our case the name of the exception class is NumberFormatException

And the error message is For input string: "4a"

It is always a good practice to read about the exception class. [Hint: Click on the name of the exception class to read about it.]

The exception stack trace in total contains 5 lines. Out of which 2 lines are from our class ExceptionDemo3 and the remaining 3 lines are from classes in Java's standard library.

Our goal is to find out which line in our code is responsible for triggering the exception. For all practical purposes we can safely assume that classes in Java code are not responsible for this exception.

Which means we can safely ignore all the top 3 lines in the stack trace which are from classes java.lang.NumberFormatException and java.lang.Integer.

As mentioned earlier we should scan from top to bottom to find the top most line in the exception stack trace which is from our code (meaning from a class written by us, which in our case is ExceptionDemo3).

We will notice that line 10 is what we are looking for.

When the statement in line 10 in our code (in ExceptionDemo3 class) is analyzed for the NumberFormatException with error message For input string: "4a", we can easily figure out that the value contained in the reference number2Text is 4a which is not being properly parsed into an integer value.

We can see from the stack trace that the current method convertAndAdd is being called by code in line 5 which is inside the main method.

From that line 5 we can again figure out that text2 is being passed as number2Text. Which means that the value of text2 i.e 4a is responsible for the NumberFormatException.

To fix the problem, change the string literal initialized to reference text2 from "4a" to "4" and click Submit.



package q11319;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		String text1 = "3";
		String text2 = "4";
		int result = convertAndAdd(text1, text2);
		System.out.println("result = " + result);
	}
	public static int convertAndAdd(String number1Text, String number2Text) {
		int number1 = Integer.parseInt(number1Text);
		int number2 = Integer.parseInt(number2Text);
		return number1 + number2;
	}
}