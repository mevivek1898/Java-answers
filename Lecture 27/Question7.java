Strings can be concatenated using the + operator.

For example:
String helloStr = "Hello " + "World"; 
If one operand in the expression is of type String and the other operand is not a String, the latter is converted to a string by automatically invoking the toString() method on it.

The result of string concatenation is a reference to a new String object that is created by merging the contents of the two strings.

Some examples of string concatenation are give below:
"Hello " + "World"	Hello World
"The square root of 2 is " + Math.sqrt(2)	The square root of 2 is 1.4142135623730952
3 + 2 + " monkeys"	5 monkeys
"" + 3 + 2 + " monkeys"	32 monkeys
"monkeys " + 3 + 2	monkeys 32

The + operator is syntactically left-associative, i.e. it evaluates the left side of an expression first.

For example, it evaluates the expression a + b + c as (a + b) + c. As soon as it sees a string in one of the operands, from that point onwards, it converts all the remaining operands as strings.

That is why in the example 3 + 2 + " monkeys", first 3 + 2 is evaluated to 5 using integer addition and later the expression becomes 5 + " monkeys", where 5 is converted to String and concatenated to " monkeys".

Retype and submit the code below. Observe the output.


package q11150;
public class StringConcatenation {
	public static void main(String[] args) {
		System.out.println("Hello!" + " I am learning Java.");
		System.out.println("Total = " + 3 + 2);
		System.out.println("Total = " + (3 + 2));
	}
}