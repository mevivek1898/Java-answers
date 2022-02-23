An exception is thrown to signal an error condition.

Java provides a way to catch the exceptions and handle them by either taking corrective course of action or notifying the user or doing what ever is needed.

This handling is done using a try-catch block or propagating the exception to the caller.

The compiler flags an error if we invoke methods which throw checked exceptions and do not handle them.

For example, the static method Thread.sleep(long milliSeconds) in Thread class throws an InterruptedException, which is of type checked exception. Below code demonstrates the usage of try-catch block. Notice how the statement containing the call to the sleep method is wrapped in the try-catch block.

try{// try-catch block start
	Thread.sleep(2000);
}catch (InterruptedException e) {// catch clause 
	e.printStackTrace();
}// try-catch block endClick on Submit to see the error.

To fix the code, write the try-catch block appropriately.



package q11322;
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("Before sleep...");
	try{	Thread.sleep(2000);
	}catch(InterruptedException e) {	
		e.printStackTrace();
		
	}
		System.out.println("After sleep...");
	
}
}