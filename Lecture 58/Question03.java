Whenever we want to store large amount of data (such that each date item can be uniquely identified by an id or a key) and also be able to retrieve the data quickly, we use a HashMap.

HashMap has 4 constructors.
HashMap() - the default constructor creates an empty HashMap with initialCapacity as 16 and a default load factor of 0.75
HashMap(int initialCapacity) - it creates an empty HashMap with the given initial capacity and a default load factor of 0.75.
HashMap(int initialCapacity, float loadFactor) - it creates an empty HashMap with the given initial capacity and load factor.
HashMap(Map m) - it creates a HashMap with the key-value mappings present in the map m passed as parameter.
HashMap internally creates an entry object for every key and value mapping.

These entry objects are placed in buckets/slots. Capacity is number of such slots/buckets. The capacity at the time of creation of a HashMap is called initialCapacity.

Note that size of the HashMap is different from the capacity. Size is the total number of entries inserted into the HashMap.

The load factor determines at what level of fullness the HashMap's capacity should be automatically increased.

The increase in the capacity is performed when the size becomes greater than (load factor x current capacity).

During the increase in capacity, the HashMap internally performs rehashing of the keys to store them in the new slots/buckets. This is where the hashcode of the keys is used by the HashMap.

Note that whenever we call the size() method on an HashMap, it always returns the current count of key and value entries it holds.

See and retype the below code.
You will notice that the size of cMap is 0, even though we create it with an initialCapacity of 20. This is because we have not added any entries to cMap.

When we know the count of key-value pairs we will be storing in an HashMap (assuming they are greater than 16), it is efficient to provide it as the initialCapacity so that the HashMap can avoid frequent internal capacity adjustments during insertions.



'


package q11372;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		Map aMap = new HashMap();
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		aMap.put("1", "First Entry");
		aMap.put("2", "Second Entry");
		aMap.put("3", "Third Entry");
		aMap.put("4", "Fourth Entry");
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		Map bMap = new HashMap(aMap);
		System.out.println("bMap.size() = " + bMap.size());
		System.out.println("bMap = " + bMap);
		Map cMap = new HashMap(20);
		System.out.println("cMap.size() = " + cMap.size());
		System.out.println("cMap = " + cMap);
	}
}