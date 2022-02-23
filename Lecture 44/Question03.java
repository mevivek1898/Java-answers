In Java, we have learnt that String class represents an immutable sequence of characters.

For example:
String text = "I am back!";
text = "I am back, again!";
In the above code, you will notice that the reference text can be assigned to any other String literal but the previous String literal itself cannot be modified.

It means that once a String object is created, the contents of that object (meaning the sequence of characters in that object) cannot be modified.

Such classes whose objects cannot be modified are called immutable classes.

A class becomes immutable when it does not provide any methods to manipulate the state information stored in its fields.

The String class does not have even a single method which can manipulate or change the sequence of characters it represents. The methods like substring, replace, toUpperCase, toLowerCase etc., do not change the contents of the existing string, instead these methods create new string objects with the modified contents and return their references.

The StringBuilder class represents a mutable sequence of characters. Unlike the String class, the StringBuilder class provides methods to change the sequence of characters it represents.

Below are some of the most commonly used methods in StringBuilder class which help to manipulate the sequence of characters it represents:
append(String str)
insert(int index, String str)
delete(int start, int end)
replace(int start, int end, String str)
See and retype the below code.

Below are the three important points you should note in the code:

You will notice that we are using a StringBuilder constructor which accepts an String reference. StringBuilder has many constructors.

You will also notice that we are chaining the append() method call in the statement sb.append("River").append("Thames");. This is possible because append method call on a StringBuilder object returns a reference to the same StringBuilder object.

A StringBuilder object can be converted to a String by calling the toString() method. The toString() method creates and returns a new String object with the sequence of characters present inside the StringBuilder object. You will notice this happening whenever the statement System.out.println("sb = " + sb); is executed.



package q11307;
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ganga");
		sb.append("River");
		System.out.println("sb = " + sb);
		sb.append("Nile");
		System.out.println("sb = " + sb);
		sb.append("River").append("Thames");
		System.out.println("sb = " + sb);
		sb.delete(0, 5);
		System.out.println("sb = " + sb);
	}
}
