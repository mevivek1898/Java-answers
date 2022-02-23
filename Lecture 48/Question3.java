Below are some important rule on how try, catch and finally blocks work.

If the code in the try block raises an exception and if that exception is caught by a catch block, then the control is abruptly transferred to that catch block.

If no exception is raised by the code in the try block, the code in the try block executes normally.

A finally block if present is always executed. If there is no exception, finally block is executed after the code in the try block is executed.

If there is an exception in the try block and there is no corresponding catch block to catch the exception, then the control flow which is abruptly transferred from the try block enters into the finally block.

If there is an exception in the try block and there is a corresponding catch block to catch the exception, then the control flow which is abruptly transferred from the try block enters into the catch block first and later enters into the finally block.

The below code demonstrates the above mentioned rules.

See and retype the below code.

Note : Observe in the output how the catch block is skipped while parsing text1, because no exception is raised.

Click on  to understand the working of try, catch and finally constructs when an exception occurs. Make sure to change the same text given in the live demo to see the change in program execution.




package q11327;
public class TryCatchDemo3 {
	public static void main(String[] args) {
		String text1 = "3";
		int value1 = 0;
		try {
			value1 = Integer.parseInt(text1);
			System.out.println("Successfully parsed text1 as integer");
		} catch (NumberFormatException e) {
			System.out.println("Unable to parse text1 as integer");
		} finally {
			System.out.println("Inside finally block 1");
		}
		String text2 = "4g";
		int value2 = 0;
		try {
			value2 = Integer.parseInt(text2);
			System.out.println("Successfully parsed text2 as integer");
		} catch (NumberFormatException e) {
			System.out.println("Unable to parse text2 as integer");
		} finally {
			System.out.println("Inside finally block 2");
		}
	}
}