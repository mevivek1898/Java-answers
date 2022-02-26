boolean isEmpty(): Returns true if this map contains no key-value mappings.

int size(): Returns the number of key-value mappings in this map.

Create a class TreeMapDemo with a main method. The method takes inputs from the command line arguments, and make first three chars of the input as a key, total argument as a value add them to the TreeMap. Find the size of the map using the method size, also find the whether the map is empty or not using the method isEmpty. Print the result as shown in the example.

Sample Input and Output:


Cmd Args : Ganga Yamuna Krishna Narmada
Gan : Ganga
Kri : Krishna
Nar : Narmada
Yam : Yamuna
Is TreeMap empty false
Size of TreeMap is 4




package q24093;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> namesMap = new TreeMap<String, String>();
		
		// Write your code 
	for(int i=0;i<args.length;i++) namesMap.put(args[i].substring(0,3),args[i]);
	

		Set<String> nameSet = namesMap.keySet();
		for (Object key : nameSet) {
		// Write your code here
		System.out.println(key+" : "+namesMap.get(key));
		
		
		}
		System.out.println("Is TreeMap empty "+namesMap.isEmpty());
		
		System.out.println("Size of TreeMap is "+namesMap.size());
		
	}
}
