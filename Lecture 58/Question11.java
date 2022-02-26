Create a class HashMapIterationDemo with a main method. The method takes inputs from the command line arguments. From the input make the first two chars as key and the argument as value. Print all the (key, value) pairs. We can assume the size of names passed as arguments will be greater than three characters.

The code uses the keySet() method in HashMap, which returns all the keys in a Set.

Use for-each loop to iterate on the Set of keys, to print all keys along with their associated values.

The result should be as follows:
Cmd Args : Sunday Monday Tuesday Wednesday
Tu : Tuesday
Su : Sunday
Mo : Monday
We : Wednesday


import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap <String, String>();
		Set shortNamesSet = namesMap.keySet();
		for(int i=0;i<args.length;i++) {
			// iterate over all the input argumetnts and add the (key,value) to the Map
			// write your code here
			String key = args[i].substring (0,2);
			
			String value = args[i];
			
			namesMap.put (key , value);
			
			
		}


		Set <String>keys = namesMap.keySet();
		for (Object key : shortNamesSet) {
			System.out.println(key + " : " + namesMap.get (key));
			

			// get all the values and print the result
		}
	}
}