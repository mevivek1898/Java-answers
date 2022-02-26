Create a class ListDemo with a main method. The method takes inputs from the command line arguments. Create an instance of ArrayList and add these inputs to the the list and print the same, and remove the element at index 2. Print the output as shown in the example.

Sample Input and Output:
Cmd Args : Red Blue Green Yellow
Before removing the element at index 2 the list is
[Red, Blue, Green, Yellow]
After removing the element at index 2 is the list is
[Red, Blue, Yellow]



package q24082;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this

				
	    for(int i=0;i<args.length;i++) namesList.add
        
        (args[i]);
	    System.out.println("Before removing the element at index 2 the list is");
	    
	    System.out.println(namesList);
	    
	    namesList.remove(2);
		System.out.println("After removing the element at index 2 is the list is");
		        System.out.println(namesList);
		        
		                
		                
	  
	  
	  
	}
}