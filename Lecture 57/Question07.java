Write a program to understand how to retrive an element in an ArrayList using the method get.

Create a class ListDemo with a main method and get the element at index 1.



package q11958;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Mercury");
		namesList.add("Venus");
		namesList.add("Earth");
		namesList.add("Mars");
		System.out.println(namesList.get(1)); // write your logic here
	}
}








