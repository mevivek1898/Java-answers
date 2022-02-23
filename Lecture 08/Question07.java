In Java, the primitive char type has a wrapper class called Character, which provide useful methods to work with characters.

See and type the below code to understand the usage of most commonly used methods in Character class:
isLetter()
isDigit()
isLetterOrDigit()


Note: Please don't change the package name.

package q10813;
public class CharacterDemo {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '7';
		char ch3 = '*';
		char ch4 = '\'';
		char ch5 = '"';
		char ch6 = ' ';
		System.out.println("ch1 is a character: " + Character.isLetter(ch1));
		System.out.println("ch2 is a character: " + Character.isLetter(ch2));
		System.out.println("ch2 is a digit: " + Character.isDigit(ch2));
		System.out.println("ch1 is a letter or digit: " + Character.isLetterOrDigit(ch1));
		System.out.println("ch3 is a letter or digit: " + Character.isLetterOrDigit(ch3));
		System.out.println("ch4 contains escape sequence to print single-quote: " + ch4);
		System.out.println("ch5 contains a double-quote char, which is treated as a normal char : " + ch5);
		System.out.println("ch6 is a space char: >" + ch6 + "<");
	}
}