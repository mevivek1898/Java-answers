In Java, we can classify variables or references into 5 different types:
Parameters - these are the variables/references that appear in a method signature inside the parenthesis ().
Local variables/references - the variables/references that are declared inside a method are called local variables. Their scope/visibility is restricted only to their enclosing method block.
Instance fields - these are the fields declared in the class. They hold the state information of the class. Every instance of the class holds a copy of these fields.
Static fields - these are the fields declared in the class with a static keyword. Only one copy of such fields exists in memory and are shared by (or available to) all the instances of that class.
Constants - these are the variables/references declared in the class with both static and final keywords. Only one copy of such fields exist in memory like the static fields. However, these variables/references cannot be reassigned another value once they have been assigned a value.
Note:If a variable is only declared as final and not static, then it is not called a constant. It is simply called a final variable.

Select all the correct statements from the below code:
public class A {
	private int value1; // statement 1
	private final int value2; // statement 2
	private static int value3; // statement 3
	private static final int value4; // statement 4
}


Answer
value4 declared in statement 4 is called a constant.