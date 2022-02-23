In Java, we have 5 arithmetic operators:
Operator	Description
+	Used for addition and string concatenation
-	Used for subtraction
*	Used for multiplication
/	Used for division
%	Remainder/Modulus operator for finding remainder

The usage is
operand1 operator operand2

According to Java coding conventions, a single space should be provided to the left and right of an operator.

Note: When any of the above arithmetic operators is used in an expression, if at least one operand is of type double, float or long then the operation is carried out by automatically widening the other operand also to that former's type (if it is not already of the former's type) and the result is also of the former's type. And for all other numeric types (like byte, short, char) the operands are automatically widened to int and the result is also an int.

See and retype the below code to understand how arithmetic operators are used.

Note: Please don't change the package name.



//Answer 

package q10827;
public class ArithmeticOperatorsDemo {
	public static void main(String[] args) {
		int x = 16;
		int y = 3;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
	}
}