The Float class wraps a primitive float value.

This class provides constants and methods that are useful while working with float(s).

For example, it has a method Float.parseFloat(String s) which can be used to convert a string value to its corresponding float value.
float x = Float.parseFloat("4.5");
//parses the string literal "4.5" and returns a float value of 4.5f In the below code, the main method of CalculateDifference will be passed two arguments.
Both the values can be any number between Float.MIN_VALUE to Float.MAX_VALUE.

Complete the below code so that it produces the correct output.

Note: You can assume that the first string value passed in args[0] and the second string value passed in args[1] will always contain a decimal number with fractional part (like 2.99, 3.782, 4.7, etc.). It means that you can directly use the Float.parseFloat(text) method.

[Hint: You can convert arg[0] to float by the statement float value = Float.parseFloat(args[0]);]

Note: Please don't change the package name.



Answer 

package q10782;
public class CalculateDifference {
	public static void main(String[] args) {
		// In the below two lines write code to convert
		// the string value passed in args[0] and args[1] into int values using Float.parseFloat method
		// convert the value in args[0] to int and store in firstValue
		// convert the value in args[1] to int and store in secondValue
		float firstValue =Float.parseFloat(args[0]) ;
		float secondValue = Float.parseFloat(args[1]);
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}