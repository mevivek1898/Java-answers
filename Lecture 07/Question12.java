Java provides a class called BigDecimal for representing and computing decimal numbers with any required precision.

BigDecimal is not a wrapper class of any primitive data type. It is a convenience class for handling large decimal numbers with arbitrary precision. The value to be represented by BigDecimal should be passed to one of the BigDecimal constructors.

Retype the code below.

You will notice an import statement at the beginning of the program to use BigDecimal class. We will learn about packages and import statements in other sections.

Note: Please don't change the package name.


package q10860;
import java.math.BigDecimal;
public class BigDecimalUsage {
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("3.14159265358");
		System.out.print(x);
	}
}