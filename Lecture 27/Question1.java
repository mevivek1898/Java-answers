A string literal consists of zero or more characters (also called Unicode code points) enclosed in double quotes. Some examples of string literals are
"Ganga" , "123", "", "  ", "Practice makes perfect", " 24@3yApp_"

String literals are instances of java.lang.String class.

An instance of String is immutable. Meaning, once a string object is created in memory, the contents of the string cannot be changed. For example, when a string is created as given below :
String str = "Ganga";
The contents of "Ganga" cannot be changed. However, str can be made to point to some other string object like "Yamuna".

Below program creates some String literals. Retype the program and submit.

Note: Please don't change the package name.'


package q11144;
public class StringLiterals {
	public static void main(String[] args) {
		String aStr = "Himalayas";
		String bStr = "are beautiful";
		String spaceStr = " ";
		String emptyStr = "";//This is an empty string that does nothing.
		System.out.println(aStr + spaceStr + bStr + "." + emptyStr);
	}
}