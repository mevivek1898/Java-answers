An anonymous class can:
have its own fields and custom methods which may not be there in the interface it is implementing or the class it is extending
access members of its enclosing class
have static fields provided they are also marked as final
have local classes
An anonymous class cannot:
be reused. They are just like expressions, whose complete implementation is provided in the accompanying code block.
access non-final local variables that are declared in its enclosing block
have static methods or interfaces
Select all the correct statements from the below code:
interface Printer {
	public void printMe();
}
class Prefixer {
	protected String prefix;
	public Prefixer(String prefix) {
		this.prefix = prefix;
	}
	public String getPrefixedName(String name) {
		return prefix + " " + name;
	}
}
class AnonymousExample {
	public static void main(String[] args) {
		Printer printer = new Printer(String text) { // statement 1
			this.text = text; // statement 2
			public void printMe() {
				System.out.println("printMe is called!");
			}
			public static void printMe2() { // statement 3
				System.out.println("printMe2 is called!");
			}
		};
		Prefixer doublePrefixer = new Prefixer("Hello") { // statement 4
			public String getOnlyPrefix() { // statement 5
				return prefix;
			}
			public String getPrefixedName(String name) {
				return prefix + " " + prefix + " " + name;
			}
		};
		printer.printMe();
		System.out.println(doublePrefixer.getPrefixedName("James"));
	}
}



Answer 

Statements 1 and 2 will result in compilation errors.

