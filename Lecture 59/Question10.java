Write a program to understand the Set methods clear and size. Create a class SetDemo with a main method and insert the days of week from Sunday through Saturday.



import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();

		// add days of week to the set using the method add
namesSet.add("Monday");

namesSet.add("Thursday");

namesSet.add("Friday");

namesSet.add("Sunday");

namesSet.add("Wednesday");

namesSet.add("Tuesday");

namesSet.add("Saturday");





		System.out.println(namesSet);
		System.out.println("Size of the set is " + namesSet.size());// print the size of the set
		
		// clear all elements in the set
		namesSet.clear();
		
		System.out.println("The set after removing all the elements " + namesSet);
		System.out.println("Size of the set after removing the elements is " + namesSet.size());
	}
}


