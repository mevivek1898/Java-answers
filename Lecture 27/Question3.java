Since a string literal is enclosed in double quotes, if we want to have a literal with a double quote as part of its content, we need to escape the double quote.

The way to escape a double quote is by providing the escape character \ before the double quote.

For example:
 
String text = "He said, \"Hi\"";
Escape character is also used to represent non-graphic characters like the new line(\n) and tab(\t) characters.

See and retype the code below:



package q11146;
public class EscapeSequence {
	public static void main(String[] args) {
		String textStr = "She said, \"It is wrongly called 'common sense' because it is rarely used\". \nWhat a wise saying!";
		System.out.println(textStr);
		char singleQuoteChar = '\'';
		System.out.println("Single Quote Char = " + singleQuoteChar);
		char backSlashChar = '\\';
		System.out.println("Back Slash Char = " + backSlashChar);
	}
}