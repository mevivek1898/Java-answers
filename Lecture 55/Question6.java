An assertion is used to verify if an assumption made by the programmer is valid or not. For example, there could be a piece of code which assumes that the int value stored in a variable is always positive and greater than zero.

For example in the below code :
assert (x > 0);
int total = x * x;
The line containing assert statement evaluates the expression x > 0. If the expression evaluates to false, meaning x is not greater than 0, then AssertionError is thrown during the execution of the code. If the value of x is found to be greater than 0, the execution continues normally.

Assertions are used during the development and testing to capture bugs early. Assertions are usually disabled in the code when deployed in production. Disabling of assertions is done by passing a flag -enableassertions or -ea.

For example:
java -ea MyMainClassName
Please note assertions that should not be used to check validity of parameters for public methods. Exceptions are the correct way for signalling such parameter validation errors. Assertions are also used in many test frameworks while writing test cases.

The syntax for using the assert keyword is :
assert <boolean_expression> ;
assert <boolean_expression> : <reason_text_expression> ;
In the above syntax, the <reason_text_expression> is optional, however when provided, it is converted to a String and that text is used as the error message for the AssertionError thrown.

Note the AssertionError extends Error and hence is an unchecked exception and should not be handled in the code.

See and retype the below code. You will notice that the code in the method getPositiveInt() provides negative int values for numbers less and or equal to 2. This is written to demonstrate how assertions are written.



package q11359;
public class AssertionDemo {
	public static void main(String[] args) {
		int x = getPositiveInt(7);
		int y = getPositiveInt(2);
		assert (x > 0);
		assert (y > 0);
		int total = x + y;
		System.out.println("total = " + total);
	}
	public static int getPositiveInt(int num) {
		return num - 3;
	}
}