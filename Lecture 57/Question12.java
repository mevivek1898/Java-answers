Create a class ListDemo with a main method. The method takes inputs from the command line arguments. Create an instance of ArrayList and add these inputs to the the list and print the same, and also get the element at index 2. Print the output as shown in the example.

Sample Input and Output:
Cmd Args : Ganga Krishna Godavari Sindu Narmada
[Ganga, Krishna, Godavari, Sindu, Narmada]
The element at index 2 is Godavari



package q24081;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this
for(int i=0;i<args.length;i++)
	 namesList.add(args[i]);
	
	 
  

		// write your code above this
		System.out.println(namesList);
		// get the element at index 2 and print the same
			System.out.println("The element at index 2 is "+ namesList.get(2));
			
	}
}

