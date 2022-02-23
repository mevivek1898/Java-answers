The Boolean class wraps a primitive boolean value.
This class provides constants and methods that are useful while working with booleans. For example it has a method Boolean.parseBoolean(String s) which can be used to convert a string value representing one of the two logical states of being true or false into their corresponding boolean value
boolean x = Boolean.parseBoolean("true");
boolean y = Boolean.parseBoolean("false");
In the below code, the main method of GuessHoliday will be passed an argument. The argument can be either "true" or "false".
You can assume that the string value passed in args[0] will always contain a boolean value of either true or false.
Complete the below code so that it produces the correct output.


Note: Please don't change the package name.

Answer 

package q10810;
public class GuessHoliday {
	public static void main(String[] args) {
		//write code to convert the value pased in args[0] into a boolean
		boolean isHoliday =Boolean.parseBoolean(args[0]) ;
		if (isHoliday) {
			System.out.println("I am sleeping!");
		} else {
			System.out.println("I am working hard!");
		}
	}
}