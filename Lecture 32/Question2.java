The Math class present in java.lang package contains many useful static methods. These static methods are also called as utility methods.

Classes like Math that have only static methods are also called Utility classes.

Note: Most of the methods in Math class use double as data type, so we will see fractional part in the results.

See the retype the below code.


package q11239;
public class MathExamples {
	public static void main(String[] args) {
		double base = 4;
		double exponent = 3;
		System.out.println(base + " to the power " + exponent + " is : " + Math.pow(base, exponent));
		System.out.println("Square root of " + base + " is : " + Math.sqrt(base));
	}
}