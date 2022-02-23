In Java 7 and later versions, multiple catch blocks can be combined into a single block.

For example the two catch blocks in the below code:
try {// try block} catch (ExceptionClassName1  referenceName1) {// catch block} catch (ExceptionClassName2  referenceName2) {// another catch block} finally {// finally block}can be combined into a single catch block as given below:
try {// try block} catch (ExceptionClassName1 | ExceptionClassName2  referenceName) {// multi-catch block} finally {// finally block}Note that only Throwable and its subclasses can be caught in the catch statement.

It is always a good practice to catch the exceptions and also print their stack trace by calling the printStackTrace() method. The printStackTrace() method is present in the superclass Throwable, hence it is available in every exception class.

Note there may be situations when you may not want call the printStackTrace() method, however let it be a conscious decision.

The finally block is very useful for writing the cleanup code. Since the finally block is always executed after the try block, any code that is written inside the finally block will be executed before the control is transferred either by a break statement or a continue statement or even by a return statement.

In Java 7 there is a new construct called try-with-resources. We will learn more about it later in sections related to streams in java.io package.

Select all the correct statements for the below code:

public class TrickyExample {
	public static void main(String[] args) {
		String text1 = "3";
		String text2 = "4g";
		System.out.println(getTotal(text1, text2));
	}
	public static int getTotal(String text1, String text2) {
		int value1 = 0;
		int value2 = 0;
		try {
			value1 = Integer.parseInt(text1);
			value2 = Integer.parseInt(text2);
			return value1 + value2;
		} catch (NumberFormatException e) {
			return -1;
		} finally {
			return -2;
		}
	}
}


Answer  

The code will print -2.



