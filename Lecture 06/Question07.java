// The Long class wraps a primitive long value.
// This class provides constants and methods that are useful while working with large numbers. For example it has a method Long.parseLong(String s, int radix) which can be used to convert a string value representing a binary, octal, hex or a decimal integer within the valid range of a long.
// long x = Long.parseLong("C", 16);
// //parses the string literal "C" using base-16 and returns decimal 12 as a long

// long y = Long.parseLong("380");
// //parses the string literal "380" using base-10 and returns decimal 380 as a long
// In the below code, the main method of CalculateDifference will be passed two arguments. Both the values can be any number between Long.MIN_VALUE to Long.MAX_VALUE .
// You can assume that the string values passed in args[0] and args[1] will always contain numbers represented in base-10.
// Complete the below code so that it produces the correct output.


// Note: Please don't change the package name.

// Answer 

package q10772;
public class CalculateDifference {
	public static void main(String[] args) {
		long firstValue =Long.parseLong(args[0]) ;
		long secondValue =Long.parseLong(args[1]);
		
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}