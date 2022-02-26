The TreeMap class implements NavigableMap. NavigableMap extends the SortedMap and the SortedMap in turn extends Map interface.

Unlike a HashMap, implementations of a SortedMap interface guarantee a sorted order (ascending) on the keys. The sort order can also be controlled by providing a custom Comparator implementation.

A NavigableMap interface extends SortedMap, and additionally provides navigation methods for navigating on the sorted entries.

TreeMap is a concrete implementation of SortedMap and NavigableMap interfaces.

See and retype the below code. You will notice that the entries in the TreeMap always remain sorted on the ascending order of their keys.




package q11376;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		Map namesMap = new TreeMap();
		namesMap.put("Sam", "Samos");
		namesMap.put("Hyd", "Hyderabad");
		namesMap.put("Dal", "Dallas");
		System.out.println("namesMap = " + namesMap);
		namesMap.put("Ban", "Bangalore");
		System.out.println("namesMap = " + namesMap);
		namesMap.put("Ath", "Athens");
		System.out.println("namesMap = " + namesMap);
	}
}