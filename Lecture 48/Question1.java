The syntax for try-catch-finally syntax is as given below:
try {// try block} catch (ExceptionName1referenceName1) {// catch block} catch (ExceptionName2referenceName2) {// another catch block} finally {// finally block}The block of code which is just after the try keyword is called the try block.

The block of code which is just after the catch keyword is called the catch block.

The block of code which is just after the finally keyword is called the finally block.

There can be a try block with only catch blocks and without the finally block.

Similarly there can be a try block without catch blocks and with just one finally block.

Below is an example which demonstrates the usage of try, catch and finally.

Note that in the below code line 6 : Integer.parseInt(text1); will throw an NumberFormatException, since reference text1 has a value "3g" which cannot be parsed into an integer.

When the exception is thrown, the try block does not complete normally, meaning the control flow will jump from line 6 into the catch block. And after the catch block is executed it will later enter into the finally block and execute the code it.

Click on  to understand the working of try, catch and finally constructs.


package q11325;
public class TryCatchDemo2 {
	public static void main(String[] args) {
		String text1 = "3g";
		int value1 = 0;
		try {
			value1 = Integer.parseInt(text1);
			System.out.println("Successfully parsed text1 as integer");
		} catch (NumberFormatException e) {
			System.out.println("Unable to parse text1 as integer");
		} finally {
			System.out.println("Inside finally block");
		}
	}
}

