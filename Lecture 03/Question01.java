A Java program is usually composed of multiple lines. Each line is composed of one or a combination of the below three input elements:
Comments
Whitespace characters
Tokens
A comment is a sequence of non-executable characters. There are three types of comments in Java which we will learn later.

In Java, the whitespace characters are:
Space ’ ’ – (ASCII SP) produced by pressing spacebar
Tab ’\t’ – (ASCII HT) produced by pressing the tab key
Form Feed character ’\f’ – (ASCII FF) usually used as the page separator char between lines/paragraphs
Line Terminator chars (used to separate two lines) – produced by pressing Enter key:
Line Feed - ’\n’ (ASCII LF also called NL - New Line) - used in all Unix and Mac OS X systems
Carriage Return - ’\r’ (ASCII CR) – used in MAC OS 9 and below
Carriage Return followed by Line Feed- ’\r\n’ (ASCII CRLF) – used in Windows systems
All other input elements other than comments and whitespace are called as tokens. The tokens are further classified as:
Identifiers – Names used to refer or identify are called Identifiers. For example, names of variables, methods and classes are all called Identifiers.
Keywords – one of the 50 reserved words in Java language like public, new, for, if etc are called Keywords. These have a special meaning when used as part of the program.
Literals – these are the fixed values assigned in a source code. They can be of primitive, String or a null type.
Operators – in Java language we have 38 different operators like - = > < == >= etc..(which we will learn later)
Separators – in Java language we have 12 Separators - ( ) { } [] ; , . ... @ ::
Select all the correct statements for the below code:
public class Test {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
}
Answer 

The token Test which is the name of the class is called an Identifier.
The token sum which is the name of the method is called an Identifier.