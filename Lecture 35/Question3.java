Scope can be defined as a portion or block of code in which a variable is visible.

We apply the word scope to variables/references and not so much to methods as methods are members of classes and interfaces.

Variables and references can be declared in:
Blocks - these can be if/else/switch, for/while loops, methods and constructors or named blocks. These are also called local variables. For example:
public static void main(String[] args) {
	int x = Integer.parseInt(args[0]); // x is visible only inside this main method
	if (x > 1) { //if-block-start
		int y = 2 * x;  // y is visible only inside this if block
		System.out.println("y = " + y);
	} //if-block-end
}
Method and Constructor parameters. For example:
public int sum(int num1, int num2) { //method-block-start
	return num1 + num2; // num1 and num2 are only visible inside this method block	
} //method-block-end
Class - as instance fields
class A { //class-block-start
	private String name; //reference name is visible anywhere inside the class block
	public String getName() {
		return name; // example usage 1
	}
	public String toString() {
		return "A [ name = " + name + " ]"; // example usage 2
	}
} //class-block-endIn Java, before using a variable/reference we need to first declare it.

Select all the correct statements for the below code:
class A {
	public A(int value1) { //statement 1
		this.value1 = value1; //statement 2
		value2 = value1 * 2; //statement 3
	}
	private int getValue2() {
		return value2; //statement 4
	}
	private int value1; //statement 5
}

Answer

Statements 3 and 4 will produce compiler errors saying value2 cannot be resolved, since value2 is neither declared locally in the enclosing block nor as a field in the class.