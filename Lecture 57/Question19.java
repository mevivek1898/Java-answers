Write a Java program with a class name ArrayListDemo with a main method. The method takes inputs from the command line arguments. Print the size of the list using the method size. Fill the missing code in the below program

Sample Input and Output:
Cmd Args : Ganga Godavari Krishna Narmada Sindu
[Ganga, Godavari, Krishna, Narmada, Sindu]
Size of the list is : 5



package q24085;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		// write your code here
		
		List < String > ans = new ArrayList < String > ();
		
			for (int i = 0; i<args.length;i++)  ans.add (args[i]);
			
				System.out.println (ans);
				
						System.out.println ("Size of the list is : " + ans.size ());
						
							
	}
	
}		
							
							
							
	