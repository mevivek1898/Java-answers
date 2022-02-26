Create a class HashMapIterationDemo with a main method. The method takes inputs from the command line arguments. From the input make the first character as key and the entire argument as value. Print all the keys.

We can assume the size of names passed as arguments will be greater than three characters.

The code uses the keySet() method in HashMap, which returns all the keys in a Set.

Use for-each loop to iterate on the Set of keys, to print all keys.

The result should be as follows:
Cmd Args : Red Green Yellow Brown Black
{R=Red, B=Black, G=Green, Y=Yellow}
R
B
G
Y


package q24088;
import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap <String, String>();
		for(int i=0;i<args.length;i++) {
			// iterate over all the input argumetnts and add the (key,value) to the Map
			// write your code here
			namesMap.put(args[i].substring(0,1),args[i]);
			
		}


		// Set shortNamesSet = namesMap.keySet();
		 
       System.out.println(namesMap);
       Set < String > keys = namesMap.keySet();
       
    for(String ans:keys)
       {
       System.out.println(ans);
			// get all the keys and print the result
		}
	}
}