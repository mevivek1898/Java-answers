A Set represents a collection which will not contain duplicate elements.

For example, if we add the same element twice to a Set, it will not include it for the second time and will simply ignore the second addition request. Whenever such an addition does not change the contents of the Set, the add method returns a boolean value of false.

Below are some of the concrete classes which implement Set interface:
HashSet - most commonly used class whenever we want a Set behaviour
(the order of iteration over the elements is not guaranteed to be the same as the insertion order).
TreeSet - is used when we want the elements to be sorted on the natural ordering of its elements, or by a custom Comparator.
LinkedHashSet - is used when we want the retrieval (during iteration) of elements to be in the order in which they were inserted.
Some of the most commonly used methods in Set interface are :
add(E e) - adds the given element into the set.
contains(Object obj) - returns true if set contains the object, false otherwise.
remove(Object obj) - removes the given element if present and returns true, false otherwise.
clear()
size()
There are many more methods in the Set interface, above mentioned are some of the most commonly used ones.

Click on  to understand the working of a Set.

Click on  to know the main difference between HashSet, LinkedHashSet and TreeSet.

See and retype the below code to learn the usage of few methods.


package q11378;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set namesSet = new HashSet();
		namesSet.add("Tokyo");
		namesSet.add("Athens");
		namesSet.add("New York");
		System.out.println(namesSet);
		namesSet.add("Tokyo");
		System.out.println(namesSet);
		System.out.println("Above result shows how Set does not include the duplicate Tokyo");
		boolean removeStatus = namesSet.remove("Delhi");
		System.out.println("Delhi removeStatus : " + removeStatus);
		boolean containsFlag = namesSet.contains("Athens");
		System.out.println("Athens containsFlag : " + containsFlag);
	}
}
