Create a class SetDemo with a main method. The method takes inputs from the command line arguments. Create a set instance and add these inputs to the set. Fill the missing code in the below program and print the output as shown in the example.

Sample Input and Output:
Cmd Args : Hyderabad Kolkata Hyderabad Delhi Mumbai
Delhi
Kolkata
Mumbai
Hyderabad
From the example we can observe that the set does not allow duplicate elements, also does not maintain the insertion order



package q24095;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();
// write your code here

// iterate over the set using iterator and print the output
for(int i=0;i<args.length;i++) namesSet.add(args[i]);

Iterator<String> iterate = namesSet.iterator();



while(iterate.hasNext()) {
	
	System.out.println(iterate.next());
	
}


		
	}
}