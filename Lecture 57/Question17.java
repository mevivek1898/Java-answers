Fill the missing code in the below program to learn how to get elemetns stored in a ArrayList.

Write a Java program with a class name ArrayListIterationDemo with a main method. The method takes inputs from the command line arguments. Print the list of all the elements with their respective indices as shown in Sample Input and Output.

Sample Input and Output:
Cmd Args : Hyderabad Mumbai Karnataka Tamilnadu
Name at index 0 is : Hyderabad
Name at index 1 is : Mumbai
Name at index 2 is : Karnataka
Name at index 3 is : Tamilnadu



package q23673;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
	List < String > ans = new ArrayList < String > ();
	
	for(int k = 0; k < args.length;k++) ans.add (args[k]);
	
	for(int i = 0; i<ans.size (); i++){
		
		System.out.println ("Name at index " + i + " is : " +ans.get (i));
		
	}
	
	}
}
