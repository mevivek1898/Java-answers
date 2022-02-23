Retype the below code and submit it to see the result.
If you expect it to print 0.3, there is a nasty surprise for you!! It actually evaluates to 0.30000000000000004

To understand what is wrong, you should know more about how floating point numbers are represented in binary format(base-2). The number of bits used for precision limits the set of rational numbers that can be represented exactly using a float or a double. This is why we get results like these when we use float or double in arithmetic operations.

Note: Never use float or double in currency calculations which require a high degree of precision. 
BigDecimal is the right choice in Java for such calculations.
We will learn about BigDecimal in the next sections.

Note: Please don't change the package name.

Answer 

package q10859;
public class FloatingPointArithmetic {
	public static void main(String[] args) {
		double x = 0.2;
		double y = 0.1;
		System.out.print(x + y);
	}
}