In Java, backslash character (\) is used to mark an escape sequence. An Escape Sequence is an escape character \ followed by a character, like \n or \t. The presence of the escape character changes the meaning of the character which follows it. For example when we print the String literal "Hello\tWorld" we would see the result as
Hello	World
In the String literal "Hello\tWorld", \t represents the TAB character.

Similarly if we want to print a double quote inside a double quoted String literal, we need to escape the double quote by the escape character \. For example :
String escapedDoubleQuote = "Hello \" (Quote)";
System.out.println(escapedDoubleQuote);
Would produce the below output'
Hello " (Quote)''
Similarly if we want to print a single quote inside a char literal, we need to escape the single quote by the escape character. For example :
char singleQuoteChar = '\'';
See the below code and retype the same. Note the effects of \t and \n in the resulting output when executed successfully.

//Note: Please don't change the package name.'






package q10818;
public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.print("One\tTwo");
		System.out.print(" ");
		System.out.print("Three\nFour");
	}
}