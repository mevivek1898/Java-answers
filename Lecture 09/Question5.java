In Java, null is a special type. It has only one value and that is null.

The null literal is written as plain null, without any double quotes.

A reference having a null value indicates that it is not pointing to a valid object.

In Java code, when an attempt is made to access a member (like field or method using the dot ) of a null reference, NullPointerException is thrown. We will learn more about Exceptions later.

Float a;  // a is initalized to null, it is equal to saying Float a = null; 
String text;  // text is initalized to null, it is equal to saying String text = null; 
int x; // x is initialized to 0See and retype the code given below.

Note: Please don't change the package name.'

package q10824;
public class NullTest {
	public static void main(String[] args) {
		String text = null;
		System.out.println("text : " + text);
		byte[] buffer = new byte[1024];
		buffer = null;
		System.out.println("buffer : " + buffer);
		String name = null;
		System.out.println("text == name : " + (text == name));
	}
}