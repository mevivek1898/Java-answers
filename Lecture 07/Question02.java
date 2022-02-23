// The below statement declares two byte variables x and y initialized to 3 and 4 respectively.
// byte x = 3, y = 4;
// However, when we try to perform an addition operation, such as given below, we get a compilation error: Type mismatch: cannot convert from int to byte.
// byte sum = x + y;
// In Java, when a binary operator (like, *,/, %, +, etc. ) is being used, if at least one operand is of type double , or float or long then the operation is carried out by automatically widening the other operand also to that former's type (if it is not already of the former's type) and the result is also of the former's type.
// And for all other numeric types, the operands are automatically widened to int and the result is also an int.

// Since x and y are of type byte, they both are automatically widened to int, and the resultant int is being assigned to sum which is of type byte.
// The compile-time error occurs while assigning the result which happens to be an int. To fix it, we will have to explicitly typecast the result to a byte, as shown below.
// byte sum = (byte)(x + y);
// Applying the above understanding identify and correct the error so that the correct output is produced.

// Note: Please don't change the package name.



// Answer 

package q10778;
public class ByteDemo {
	public static void main(String[] args) {
		byte b1 = 4;
		byte b2 = 20;
		byte sum = (byte)(b1 + b2);
		System.out.println("sum = " + sum);// should print 24
	}
}