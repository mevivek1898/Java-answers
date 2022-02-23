The length of a string can be obtained using the method public int length() of the String class.

For Example:
"Pentagon".length() returns 8.
The characters in a string are indexed from 0, just like in an array. The method public char charAt(int index) returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the string is at index 0, the next at index 1, and so on, as for array indexing.

If we want to convert a string to lowercase, we should use public String toLowerCase() method. It returns a new string that has all the characters of the original string in lower case. Similarly, we have a public String toUpperCase() method for converting to upper case.

Click on the  button to see live execution of the above mentioned methods. Make sure to provide your custom text to see the changes.

Retype the code below which demonstrates the usage of the above methods.


package q11151;
public class StringMethods {
	public static void main(String[] args) {
		String str = "FiveTimesFive";
		System.out.println("Length : " + str.length());
		System.out.println("5th character : " + str.charAt(4));
		System.out.println("Upper case : " + str.toUpperCase());
		System.out.println("Lower case : " + str.toLowerCase());
	}
}