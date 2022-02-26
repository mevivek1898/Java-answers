Create a class ListDemo with a main method. Create an instance of ArrayList and change the element at the given index position using the set method.

Write the missing code in the below program. Follow the instructions given in the program.



package q11959;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		namesList.add("Mercury");
		namesList.add("Venus");
		namesList.add("Earth");
		namesList.add("Mars");
		System.out.println(namesList);
		
		// change the element at index 0 to Sun
		namesList.set(0,"Sun");
		
		// change the element at index 2 to Jupiter
		
		namesList.set(2,"Jupiter");
		System.out.println(namesList); 
		
	}
}











