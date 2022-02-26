Create a class ListDemo with a main method. The method takes inputs from the command line arguments. Create an instance of ArrayList and add these inputs to the the list. Iterate over the ArrayList using an Iterator, and print the output as shown in the example.

Sample Input and Output:
Cmd Args : Rama Krishna Seetha Radha Lakshmi
Rama
Krishna
Seetha
Radha
Lakshmi


package q24083;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this
	
		for(int i=0;i<args.length;i++) namesList.add(args[i]);
		Iterator<String> itr2=namesList.iterator();
		Iterator itr =namesList.iterator();// Write your code here
		while (itr2.hasNext() ) {
			System.out.println(itr2.next()); // print the list
		}
	
	}
}