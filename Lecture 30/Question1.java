Java provides support for printf style formatting of strings. Printf style formatting contains a format string and a number of different data type parameters. The format string contains plain text as well as format specifiers, which are special characters that format the parameters. The function produces an output string with parameters applied as per the format specifiers.

For example:
System.out.format("Fees = %f,  Age = %d and Name = %s", 12.95, 24, "Raj"); 
produces an output of : Fees = 12.950000,  Age = 24 and Name = RajIn the above example,
the format string is : "Fees = %f, Age = %d and Name = %s"
the format specifiers are : %f, %d and %s
the parameters are 12.95, 24 and "Raj"
The format(...) method formatted the parameter values as per the format specifiers and produced the output string.

Java's PrintStream.format(String format, Object... args), PrintStream.printf(String format, Object... args) and String.format(String format, Object... args) methods are equivalent methods that provide this functionality.

There are many converters, flags and specifiers, which are documented in java.util.Formatter class.

For example, if you want to know about the formatting character %n, click on the above link to Formatter and go to the formatting character conversion table under Conversions section.

We will learn more about formatting in the later sections. Retype the code below and submit.


'
package q11185;
public class StringFormatting {
	public static void main(String[] args) {
		int iVar = 432000;
		System.out.printf("Integer variable = %d%n", iVar);
		double dVar = 3.14159;
		System.out.printf("Double variable = %f%n", dVar);
		String str = "Demo";
		System.out.printf("String variable = %s%n", str);
	}
}
