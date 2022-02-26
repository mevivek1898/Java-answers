See the code and retype the same to learn how to iterate over the entries stored in a HashMap.

Note the usage of HashMap class and the iterator method.

The class scans through all the arguments passed to the mainmethod, and stores them into a HashMap with the argument's first three chars as key and the argument as the value.

We can assume the size of names passed as arguments will be greater than three characters.

The code uses the keySet() method in HashMap, which returns all the keys in a Set.

The program uses the for-each loop to iterate on the Set of keys, to print all keys along with their associated values.

Note that the keys which are retrieved are not in the order of the elements passed into the main method.



package q11373;
import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map namesMap = new HashMap();
		for (String argument : args) {
			String shortName = argument.substring(0, 3);
			namesMap.put(shortName, argument);
		}
		Set shortNamesSet = namesMap.keySet();
		for (Object key : shortNamesSet) {
			Object value = namesMap.get(key);
			System.out.println(key + " : " + value);
		}
	}
}