Dictionary is an abstract class which represents key-value pairs like the Map interface.

Hashtable is a concrete implementation of Dictionary class.

NOTE: Dictionary class is obsolete. New implementations should implement the Map interface, rather than extending Dictionary class.

With the release of Java 2 platform (i.e version 1.2), Hashtable class is retrofitted to implement the Map interface. However, it is generally recommended that we use HashMap in place of Hashtable.

For all practical purposes a HashMap and a Hashtable are same, except that HashMap allows null values and a null key, while Hashtable does not allow nulls for keys and values. We will learn about the other difference with regards to synchronization when we learn about multi-threading.


package q11385;
import java.util.*;
public class HashtableDemo {
	public static void main(String[] args) {
		Map aMap = new Hashtable();
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		aMap.put("1", "First Entry");
		aMap.put("2", "Second Entry");
		aMap.put("3", "Third Entry");
		aMap.put("4", "Fourth Entry");
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		Map bMap = new Hashtable(aMap);
		System.out.println("bMap.size() = " + bMap.size());
		System.out.println("bMap = " + bMap);
		Map cMap = new Hashtable(20);
		System.out.println("cMap.size() = " + cMap.size());
		System.out.println("cMap = " + cMap);
	}
}