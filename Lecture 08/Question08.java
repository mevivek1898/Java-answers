The wrapper class Character, wraps a single char value and provides useful methods to work with its content.

See and type the below code to understand the usage of most commonly used methods in Character class:
isUpperCase()
isLowerCase()
toUpperCase()
toLowerCase()
isWhitespace()


Note: Please don't change the package name.

package q10814;
public class CharacterDemo2 {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'd';
		char ch3 = '-';
		char ch4 = '\t';
		char ch5 = '\n';
		char ch6 = '\b';
		char ch7 = ' ';
		System.out.println("ch1 is an uppercase char: " + Character.isUpperCase(ch1));
		System.out.println("ch1 is a lowercase char: " + Character.isLowerCase(ch1));
		System.out.println("ch2 is a lowercase char: " + Character.isLowerCase(ch2));
		System.out.println("ch2 to uppercase: " + Character.toUpperCase(ch2));
		System.out.println("ch1 to lowercase: " + Character.toLowerCase(ch1));
		System.out.println("ch3 is a letter or digit: " + Character.isLetterOrDigit(ch3));
		System.out.println("ch3 is a whitespace char: " + Character.isWhitespace(ch3));
		System.out.println("ch4 (tab char) is a whitespace char: " + Character.isWhitespace(ch4));
		System.out.println("ch5 (newline char) is a whitespace char: " + Character.isWhitespace(ch5));
		System.out.println("ch6 (backspace char) is a whitespace char: " + Character.isWhitespace(ch6));
		System.out.println("ch7 (space char) is a whitespace char: " + Character.isWhitespace(ch7));
	}
}