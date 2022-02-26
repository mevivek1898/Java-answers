Write a program to understand how to insert elements to a set using the add method. Create a class SetDemo with a main method. Create a set instance and add the given elements to the set.

Add the following elements to the set:
 Ganga
Krishna
Godavari
Yamuna
Krishna
In the given list of elements Krishna is given two times try to add it both times but set does not allow to add duplicate elements and observe the output.




package q11975;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();


		// Write your code here
		namesSet.add("Ganga");
		
		namesSet.add("Krishna");
		
		namesSet.add("Godavari");
		
		namesSet.add("Yamuna");
		
		namesSet.add("Krishna");
		
		

		System.out.println(namesSet);
		namesSet.add("Krishna");
		
		
		// Write your code here
		
		// add Krishna again here and observe the output
		
		
		System.out.println(namesSet);
		System.out.println("Above result shows how Set does not include the duplicate elements");
	}
}