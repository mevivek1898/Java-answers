Whenever we want to store distinct elements and also be able to verify if some element exists in the collection quickly, we use a HashSet.

HashSet internally uses a HashMap to provide all the functionality.

HashSet has 4 constructors.
HashSet() - the default constructor creates an empty HashSet with initialCapacity as 16 and a default load factor of 0.75
HashSet(int initialCapacity) - it creates an empty HashSet with the given initial capacity and a default load factor of 0.75.
HashSet(int initialCapacity, float loadFactor) - it creates an empty HashSet with the given initial capacity and load factor.
HashSet(Collection c) - it creates a HashSet with elements already present in the Collection c passed as parameter. Note that duplicates if present in the collection c will be automatically removed in the set which is being created.
HashSet internally uses a HashMap instance to store the elements as keys in that HashMap. Hence, the meaning and behaviour of initialCapacity and load factor in a HashSet are the same as in a HashMap.

These elements in a HashSet are placed in buckets/slots. Capacity is number of such slots/buckets. The capacity at the time of creation of a HashSet is called initialCapacity.

Note that size of the HashSet is different from the capacity. Size is the total number of elements inserted into the HashSet.

The load factor determines at what level of fullness the HashSet's capacity should be automatically increased.

The increase in the capacity is performed when the size becomes greater than (load factor x current capacity).

Note that whenever we call the size() method on an HashSet, it always returns the current count of elements it holds.

See and retype the below code.
You will notice that the size of cSet is 0, even though we create it with an initialCapacity of 20. This is because we have not added any elements to cSet.

When we know the count of elements we will be storing in an HashSet (assuming they are greater than 16), it is efficient to provide it as the initialCapacity so that the HashSet can avoid frequent internal capacity adjustments during insertions.




'

package q11379;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		Set aSet = new HashSet();
		System.out.println("aSet.size() = " + aSet.size());
		System.out.println("aSet = " + aSet);
		aSet.add("Cuprum");
		aSet.add("Aurum");
		aSet.add("Argentum");
		System.out.println("aSet.size() = " + aSet.size());
		System.out.println("aSet = " + aSet);
		Set bSet = new HashSet(aSet);
		System.out.println("bSet.size() = " + bSet.size());
		System.out.println("bSet = " + bSet);
		Set cSet = new HashSet(20);
		System.out.println("cSet.size() = " + cSet.size());
		System.out.println("cSet = " + cSet);
	}
}

