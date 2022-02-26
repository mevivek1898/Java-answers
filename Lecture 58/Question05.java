See the code and retype the same to learn how to iterate over the entries stored in a HashMap using entrySet() method.

The class scans through all the arguments passed to the mainmethod, and stores them into a HashMap with the argument's first three chars as key and the argument as the value.

We can assume the size of names passed as arguments will be greater than three characters.

The code uses the entrySet() method in HashMap, which returns all the entries in a Set. The entries are objects of class Map.Entry interface.

The program uses the for-each loop to iterate on the Set of entries, to print key and value stored in each entry.

Also note how we are type-casting the entryObject which is of type java.lang.Object into Map.Entry, so that we can call the methods getKey() and getValue() which are present in Map.Entry interface.

Note that the keys which are retrieved are not in the order of the elements passed into the main method, this is because HashMap does not guarantee the order of of the entries.



package q11374;
import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map namesMap = new HashMap();
		for (String argument : args) {
			String shortName = argument.substring(0, 3);
			namesMap.put(shortName, argument);
		}
		Set entrySet = namesMap.entrySet();
		for (Object entryObject : entrySet) {
			Map.Entry entry = (Map.Entry)entryObject;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}