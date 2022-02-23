The Double class wraps a primitive double value.
This class provides constants and methods that are useful while working with large precision fractional numbers. For example it has a method Double.parseDouble(String s) which can be used to convert a string value to a double
Double y = Double.parseDouble("380.234d");
//parses the string literal "380.234d"
In the below code, the main method of CalculateDifference will be passed two arguments. Both the values can be any number between Double.MIN_VALUE to Double.MAX_VALUE.

Complete the below code so that it produces the correct output.


Note: Please don't change the package name.

Answer 

package q10857;
public class CalculateDifference {
	public static void main(String[] args) {
		double firstValue =Double.parseDouble(args[0]) ;
		double secondValue =Double.parseDouble(args[1]) ;
		
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}