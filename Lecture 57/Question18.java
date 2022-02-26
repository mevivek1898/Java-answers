Fill the missing code in the below program to learn how to get elemetns stored in a ArrayList.

Write a Java program with a class name ArrayListIterationDemo with a main method. The method takes inputs from the command line arguments. Print the element at the index 2 using get(int index) method.

Sample Input and Output:
Cmd Args : Welcome to Hyderabad
Name at index 2 is : Hyderabad



package q23676;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
	List < String > nameList = new ArrayList < String > ();
	
		for (int i = 0; i<args.length;i++)  nameList.add (args[i]);
		
			System.out.println ("Name at index 2 is : " + nameList.get (2));
			
	}
}
	