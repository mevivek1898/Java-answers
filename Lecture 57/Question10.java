Write a program to understand how to insert and get elements into an ArrayList using the add and get methods .

Create a class ListDemo with a main method. Create an instance of ArrayList and add days of week from Sunday through Saturday to the list and print the same, also get the element at index 3 and print the result

The result should be as follows:
[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
The element at the given index is Wednesday


Note: complete the code between the comments:
// write your code below this 

// write your code above this



package q24078;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this





namesList.add("Sunday");

namesList.add("Monday");

namesList.add("Tuesday");

namesList.add("Wednesday");

namesList.add("Thursday");

namesList.add("Friday");

namesList.add("Saturday");





		// write your code above this
		System.out.println(namesList);
		// get the element at index 3 and print the same
		System.out.println("The element at the given index is "+ namesList.get(3));
	}
}