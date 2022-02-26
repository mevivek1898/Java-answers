See the code and retype the same to learn how to iterate over the elements stored in a ArrayList.

The class scans through all the arguments passed to the main method, and stores them into an ArrayList if the argument's first char is in uppercase.

The program first uses the for-each loop to print all the stored names from the ArrayList one name on each line.

It later uses a normal for statement to iterate over the elements of the ArrayList. Note the usage of the get(int index) method. This method of iteration is used when we also want to keep track of the index of the element being retrieved.



package q11368;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		for (String argument : args) {
			if (Character.isUpperCase(argument.charAt(0))) {
				namesList.add(argument);
			}
		}
		for (Object name : namesList) {
			System.out.println(name);
		}
		for (int i = 0; i < namesList.size(); i++) {
			Object name = namesList.get(i);
			System.out.println("Name at index " + i + " is : " + name);
		}
	}
}