StackOverflowError is a subclass of Error and hence an unchecked exception. It is thrown by JVM.

While executing code when JVM exhausts the stack space available to store the method call information, it throws this error. StackOverflowError is not an instance (subclass) of an Exception class. It is a subclass of Error.

In the below code, you will notice that the main method calls the someMethod(). And the someMethod() internally calls itself.

The execution starts with the main. At this moment the JVM pushes the main method details in to a stack called method call stack.
Method Call Stack
method-1	main(String[] args)
When the main for the first time calls someMethod(), JVM pushes the method information of someMethod() also into the method call stack. At this moment there are two entries in the method call stack.
Method Call Stack
method-call-2	someMethod()
method-call-1	main(String[] args)
When the someMethod() internally call itself again, JVM pushes the method information of someMethod() once again into the method call stack. At this moment there are three entries in the method call stack.
Method Call Stack
method-call-3	someMethod()
method-call-2	someMethod()
method-call-1	main(String[] args)
Since there is no condition in someMethod() which will stop itself from calling itself, it will infinitely keep calling itself. Eventually JVM will exhaust the stack space available to store the method call information for each and every call of someMethod().

It is at this point when JVM gives up, it throws the StackOverflowError signally that it is out of stack space and just cannot do anything.

As a programmer whenever we see a StackOverflowError, we should analyze our code and remove the infinite recursion.

Subclasses of Error usually signal such fatal problems in JVM, which are not recoverable. Meaning we should not try to enclose such code in a try-catch. We should instead analyze the cause of the problem and try fixing it.

The below code demonstrates how a StackOverflowError occurs.

See and retype the below code. When you execute the code, you will notice how the control transfers into the catch block when the error occurs.



package q11324;
public class StackOverflowErrorDemo {
	public static void main(String ... args) {
		someMethod();
	}
	public static void someMethod() {
		try {
		someMethod();
		}catch(StackOverflowError ste) {
			System.out.println("Stack over flow occured");
		}
	}
}

