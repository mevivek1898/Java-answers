Create a class TreeMapDemo with a main method. The method takes inputs from the command line arguments and make first three chars of the input as a key and argument as a value add them to the TreeMap and print the result.

Sample Input and Output:
Cmd Args : Samos Dallas Bangalore
Ban : Bangalore
Dal : Dallas
Sam : Samos


import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> namesMap = new TreeMap<String, String>();
		// Write your code here
for(int i=0;i<args.length;i++) namesMap.put(args[i].substring(0,3),args[i]);

		Set<String> nameSet = namesMap.keySet();
		for (Object key : nameSet) {
		// Write your code here
System.out.println(key+" : "+namesMap.get(key));
		
		
		}
	}
}
