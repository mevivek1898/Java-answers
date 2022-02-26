Write a program to understand how to remove an element in the Set using the remove method. Create a class SetDemo with a main method and insert the numbers from one to five and remove the elements two and three from the set and print the result.



import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();


		// write your code here
		namesSet.add("Five");
		
		namesSet.add("One");
		
		namesSet.add("Four");
		
		namesSet.add("Two");
		
		namesSet.add("Three");
		
		
		
		

		System.out.println(namesSet);

		// write your code here
		namesSet.remove("Two");
		namesSet.remove("Three");

		System.out.println(namesSet);
	}
}