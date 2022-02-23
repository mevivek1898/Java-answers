Unchecked exceptions are those which are not checked/verified during compile time for their exception handling code.

We have earlier used Integer.parseInt(String text) to parse some text and convert it into an integer value. Whenever this method is unable to parse the text, it throws an exception called NumberFormatException. However, the compiler does not enforce us to handle the NumberFormatException because NumberFormatException is an unchecked exception.

Among the unchecked exceptions, subclasses of RuntimeException can be handled using try-catch block, even though it is not mandated by the compiler. However, subclasses of Error which are also unchecked exceptions should not be handled using try-catch blocks.

Subclasses of Error usually indicate some serious irrecoverable error conditions which should not be caught using the the try-catch block.

See and retype the below code.

You will notice that one call to parseInt is not surrounded in a try-catch block, while the other is surrounded.

When you execute the code, you will also notice how the control transfers into the catch block when the exception occurs, skipping the statement:
System.out.println("value1 = " + value1);



package q11323;
public class TryCatchDemo2 {
	public static void main(String[] args) {
		String text1 = "33";
		String text2 = "44a";
		System.out.println("before parsing text1");
		int value1 = Integer.parseInt(text1);
		System.out.println("value1 = " + value1);
		try {
			int value2 = Integer.parseInt(text2);
			System.out.println("value2 = " + value2);
		} catch (NumberFormatException e) {
			System.out.println("could not parse text2 = " + text2);
		}
	}
}