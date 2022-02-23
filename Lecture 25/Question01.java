In Java, a method (also called as function) is a named block of code that performs a task.

Like a mathematical function f(x) (read as f of x), in Java, a method (or a function) can act on some input data to produce an output.

The input is not always compulsory, for example we could have a method called void printCurrentTime(), which could internally fetch the System's current time and print the same.

Similarly, the output of a function need not always be printed to a console, the function could store the output to a file, or a database or even return the calculated value to be used for further processing.

There are 5 basic parts to a method:
Method Name - the name used identify and invoke/execute the method.
Method Body - contains the code statements which will be executed when the method is called/invoked.
Method Parameters - [optional] contain the input values which are used by the statements in the method body.
Method Return Type - indicates what type of value is returned, if the method returns nothing, then void is used as the return type.
Modifiers - [optional] modifiers constitute one or more keywords that inform how the method can be used. We will learn more about them later.
Below is an example of a method which has parameters and returns a value:
public int sum(int num1, int num2) {
	return num1 + num2;
}
sum is the method name.
the content between opening { and closing } braces constitutes the method body.
int num1, int num2, which are passed between opening ( and closing ) parentheses are called the method parameters.
int which is before the method name sum is the return type of the method.
the keyword public used before the int return type is part of the method modifiers.
Below is an example of a method which has no parameters and does not return a value:
public void printHello() {
	System.out.println("Hello");
}
printHello is the method name.
the content between opening { and closing } braces constitutes the method body.
since there are no parameters we have empty opening ( and closing ) parentheses.
since the method does not return any value, we have provided void as the return type for the method.
the keyword public used before the void return type is part of the method modifiers.

'

Answer   

Method name should always start a lowercase letter.
