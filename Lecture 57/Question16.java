Fill the missing code in the below program to learn how to iterate over the elements stored in a ArrayList.

Write a Java program with a class name ArrayListIterationDemo with a main method. The method takes inputs from the command line arguments. If the first character of the argument is in upperrcase add it to the namesList and print all the elements in the list.



package q11955;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		for (int k=0;k<args.length;k++) { 
			if (Character.isUpperCase(args[k].charAt(0))) {
				// add arguments to the namesList
				namesList.add(args[k]);
			}
		}
		for (Object name : namesList) {
			System.out.println(name);// print elements in the namesList
			
		}
	
	}
}