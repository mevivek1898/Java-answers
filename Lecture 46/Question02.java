Like the class Arrays which deals with arrays, Java collection framework also has a utility class called Collections which deals with collections.

Please note that the class java.util.Collections is completely different from the interface java.util.Collection.

java.util.Collection class is the root interface for all the collection classes.

Collections on other hand is a utility class, which contains static methods and has a private constructor so that it cannot be instantiated.

This class has many useful searching and sorting methods which operate on various collections.

See and retype the below code to know the usage of a few commonly used methods like :
shuffle(List<?> list)
sort(List<T> list)
fill(List<? super T> list, T obj)
Note in the below code the main method uses ellipses(...) instead of a String[].

package q11314;
import java.util.*;
public class CollectionsDemo {
	public static void main(String ... args) {
		List<Integer> integerList = Arrays.asList(3, 33, 333, 3333, 33333, 333333);
		System.out.println("integerList : " + integerList);
		Collections.shuffle(integerList, new Random(1));
		System.out.println("After shuffle integerList : " + integerList);
		Collections.sort(integerList);
		System.out.println("After sort integerList : " + integerList);
		Collections.fill(integerList, 7);
		System.out.println("After filling integerList with 7 : " + integerList);
	}
}