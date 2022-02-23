The format specifier for integers is %d. For float or doubles, it is %f. For String, the format specifier is %s. To put a new line character in the string, we should use %n.

Some additional flags can be specified to these data types.
A number after %. Example: %8d	Means the output value should have a minimum of 8 characters for width. If the number is smaller, it puts spaces in the front.
Zero and a number after %. Example: %08d	Same as above, but instead of spaces, it puts zeros in the front.
+ Example: %+d	Shows a + or - sign in the output depending on the parameter value.
, Example: %,d	Formats the output with commas (or any other locale specific grouping characters).
- Example: %-8d	Left justifies the output value. Should be used in combination with a number.
. Example: %.3f or %8.3f	For displaying decimal points. Should be followed by a number which indicates the number of decimal points.

Invalid combination of the formatters will result in an error.
For example, %.3d is invalid because it is trying to specify 3 decimal places for integer data type.

Similarly if the combination of the formatter and the data is not matching, Java flags an error.
For example, if we specify %f for integer data type, Java will flag an error.

See and retype the code below.

Note: Please don't change the package name.'



package q11186;
public class StringFormatting {
	public static void main(String[] args) {
		int iVar = 2435;
		
		System.out.printf("%6d%n", iVar);
		System.out.printf("%06d%n", iVar);
		System.out.printf("%+06d%n", iVar);
		System.out.printf("%+,06d%n", iVar);
		System.out.printf("%-,6d%n", iVar);
	}
}