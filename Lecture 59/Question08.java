Write a program to understand the working of the method contains. Create a class SetDemo with a main method. Create a set instance and add the given elements to the set.

Add the following elements to the set:
 Ganga
Krishna
Godavari
Yamuna
Find if the list contains the elements Godavari and Sindhu if the element present in the list it returns true else returns false and observe the output.



package q11976;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();

		// write  your code here
		namesSet.add("Ganga");
		
		namesSet.add("Krishna");
		
		namesSet.add("Godavari");
		
		namesSet.add("Yamuna");
		
		
		
		
		
		System.out.println(namesSet);
		
		// write your code here
		System.out.println(namesSet.contains("Godavari"));
		System.out.println(namesSet.contains("Sindhu"));

	
	

	}
}



