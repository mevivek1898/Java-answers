we want to replace every character in a string with another character, the method public String replace(char target, char replacement) can be used.

Example:
 "An Apple".replace('A', '@') returns "@n @pple"
There is an equivalent method to the above one where we can use strings as arguments instead of chars.
Examples:
 "An Apple".replace("An", "The") returns "The Apple"

Many times during text processing, we should make sure that a string has no preceding or trailing space characters. A typical scenario is, if we are reading a name from a file, it is possible that there are extra spaces after the name in the file. When we compare it with an expected value, the comparison fails because of the spaces.

For example, if we read "Giza " from file and compare it with "Giza" using "Giza ".equals("Giza"), the method returns false. Solution to this problem is to use the public String trim() method. This method returns a string whose value is this string, with any leading and trailing white spaces removed.
Examples:
 "  Galaxy  ".trim() returns "Galaxy"
 "   Galaxy".trim() returns "Galaxy"
 "Galaxy   ".trim() returns "Galaxy"
 "Ga la xy".trim() returns "Ga la xy"
Click on the  button to see live execution of the String replace method. Make sure to provide your custom text and also change the oldChar and newChar to see the change in their working.

Retype the program below which demonstrates the usage of the above methods.



package q11179;
public class StringMethods {
	public static void main(String[] args) {
		String str = " Six seasons   ";
		System.out.println("length = " + str.length());
		System.out.println("length after trim = " + str.trim().length());
		System.out.println(str.replace(' ', '*'));
		System.out.println(str.trim().replace("Six", "Four"));
	}
}