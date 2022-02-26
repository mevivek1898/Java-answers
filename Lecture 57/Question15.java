Create a class ListDemo with a main method. The method takes inputs from the command line arguments. Create an instance of ArrayList and add these inputs to the the list.

Follow the given instructions and print the output as shown in the example
 add element Green at index 2
 Print the resultant list after adding the element
 get the element at index 2 and print the same
 remove the element at index 2
 Print the resultant list after removing the element
Sample Input and Output:
Cmd Args : One Two Three Four
After adding the given element at index 2 the list becomes
[One, Two, Green, Three, Four]
The element at index 2 is Green
After removing the element at index 2 the list becomes
[One, Two, Three, Four]


package q24084;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this
		// add the given elemnet at index 2
   for(int i=0;i<=3;i++) namesList.add(args[i]);
   System.out.println("After adding the given element at index 2 the list becomes");
   
   namesList.add(2,"Green");
   
   
		// print the list	
		System.out.println(namesList);
		// get the element at index 2
		System.out.println("The element at index 2 is "+namesList.get(2));
		
		namesList.remove(2);
		
		
		// remove the element at index 2
		// print the list after removing the element
		System.out.println("After removing the element at index 2 the list becomes");
		
		
		
		
		System.out.println(namesList);
	}
}
