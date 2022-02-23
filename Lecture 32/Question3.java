Code should be written in such a way that fellow programmers can understand easily. Most of the time the code written by one author is maintained by someone else. In such a scenario code would be easy to read and maintain if all authors followed some common rules or conventions..

Java language designers have provided guidelines called Java code conventions for writing Java code.

Java naming rules for classes, interfaces, methods and variables employ camel-case convention. In camel-case convention, when two or more words are joined together the starting letter of each word joined will be written in uppercase.

For example: SimpleDateFormat, getAge, maxSpeed.

Below are the rules for naming:
Class - A class name should be a noun and not a verb. For example
NumberPrinter is preferred over PrintNumbers. It should follow camel-case and the starting letter should also be in uppercase. Eg: String, StringBuilder, ArrayList
Interface - The same rules followed for a class name.
Method - A method name should be a verb and not a noun. For example
getAge() is preferred over age(). It should follow camel-case and the starting letter should be in lowercase. Eg: clear(), toString(), resetURLConnection()
Variable - A variable name should be a meaningful and clearly indicate what it is going to store. It should be a noun. For example
maxAge is preferred over x. It should follow camel-case and the starting letter of the first word should be in lowercase. Eg: speed, maxSpeed
Single-letter variables like x, y, z - should never be used.
Single-letter variables like i, j, k etc - can be used as loop-counters in for loops.
Constant - A constant variable is one which is declared as static and final. Its name should be a meaningful and clear like a simple variable, but it does not follow camel-case. It is written completely in uppercase letters with '_' as a word separator. Eg: public static final int MAX_WIDTH = 100;
According to Java naming conventions, select all the correct statements in the below sample code :
public class ParseText { // statement 1
	public int GET_LENGTH(String textcontent) { // statement 2
		return textcontent.length(); // statement 3
	}
}


Answer

In Statements 2 and 3, the variable name textcontent should have been written as textContent.


