Write a program to understand how to remove elements from an ArrayList using the remove method .

Create a class ListDemo with a main method. Follow the given instructions while writing the program:
 Create an ArrayList with the following elements: Mercury, Venus, Earth, Mars.
 Print all the elements in the list
 Remove the element at index 1
 Print the resultant list
The result should be as follows:
[Mercury, Venus, Earth, Mars]
[Mercury, Earth, Mars]



package q11957;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		// Write your code here
		
		
		
		namesList.add("Mercury");
		
		namesList.add("Venus");
		
		namesList.add("Earth");
		
		namesList.add("Mars");
		
		System.out.println(namesList);
		
		namesList.remove(1);
		
		
		
		
		
		System.out.println(namesList);
	}
}



