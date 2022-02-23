The Float.NaN and Double.NaN refer to a result that is not a number.
For example we get a NaN (not a number result) when dividing zero by zero or when we try to calculate the square root of a negative number.

While coding in Java, to verify if the result of an expression is not a number, we should never compare the result (using == operator) to either Float.NaN or Double.NaN.

The correct way of verifying if the value is not a number is to use the method Float.isNaN() or Double.isNaN().

See and retype the below code, which shows the correct usage of isNaN() method.

Note: Please don't change the package name.

package q10823;
public class CorrectUsageOfNaN {
	public static void main(String[] args) {
		double x = 0d / 0d;
		System.out.println("x == Double.NaN : " + (x == Double.NaN));
		System.out.println("Double.isNaN(x) : " + Double.isNaN(x));
	}
}