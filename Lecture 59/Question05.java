The TreeSet class implements NavigableSet. NavigableSet extends the SortedSet and the SortedSet in turn extends Set interface.

Unlike a HashSet, implementations of a SortedSet interface guarantee a sorted order (ascending) on the keys. The sort order can also be controlled by providing a custom Comparator implementation.

A NavigableSet interface extends SortedSet, and additionally provides navigation methods for navigating on the sorted entries.

TreeSet is a concrete implementation of SortedSet and NavigableSet interfaces.

See and retype the below code. You will notice that the entries in the TreeSet always remain sorted on the ascending order of their keys.



package q11382;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		Set namesSet = new TreeSet();
		namesSet.add("Ravi");
		namesSet.add("Soma");
		namesSet.add("Budha");
		namesSet.add("Budha");
		System.out.println("namesSet = " + namesSet);
		namesSet.add("Budha");
		namesSet.add("Mangal");
		System.out.println("namesSet = " + namesSet);
		namesSet.remove("Ravi");
		System.out.println("namesSet = " + namesSet);
	}
}


