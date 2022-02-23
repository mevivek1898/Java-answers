An anonymous class is very similar to a local class except that an anonymous class combines both the declaration and definition of the class into a single expression statement.

Secondly an anonymous class usually implements an interface or extends a class.

For example the below code shows the difference between an inner class and an anonymous class:
interface Printer { //this is a top-level interface
	public void printMe();
}
class A {  //this is a normal top-level class
	public static void main(String[] args) {
		class PrinterImpl implements Printer { // an example of a normal local class
			public void printMe() {
				//do something....
			}
		}

		Printer myPrinter1 = new PrinterImpl();

		Printer myPrinter2 = new Printer() {// an example of an anonymous class 
			public void printMe() {
				//do something....
			}
		};
		
		myPrinter1.printMe();
		myPrinter2.printMe();
	}
}
In the above code, PrinterImpl is a local class that implements the interface Printer. An instance of this local class is created using the statement:
Printer myPrinter1 = new PrinterImpl();
The anonymous class which is initializing the reference myPrinter2 has the below properties:
Anonymous classes do not have names
An anonymous class is an expression containing a block of code which is terminated by a semicolon ;
Anonymous class instantiation is done using the new keyword, just like a constructor invocation
Anonymous class can either implement an interface and there by provide the implementation for its methods or extend a class and override required methods.
When an anonymous class is implementing an interface, the new keyword is prefixed to the interface name, that is followed by empty parenthesis.
When an anonymous class is extending a class, the new keyword is prefixed to one of the existing constructors in that class.
See and retype the below code.

package q11297;
interface Printer {
	public void printMe();
}
class A {
	public static void main(String[] args) {
		class PrinterImpl implements Printer {
			public void printMe() {
				System.out.println("I am in printMe method of the local class PrinterImpl instance");
			}
		}
		Printer myPrinter1 = new PrinterImpl();
		Printer myPrinter2 = new Printer() {
			public void printMe() {
				System.out.println("I am in printMe method of the anonymous class");
			}
		};
		myPrinter1.printMe();
		myPrinter2.printMe();
	}
}