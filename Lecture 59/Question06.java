The LinkedHashSet is a subclass of HashSet.

Unlike a HashSet which does not maintain order of the added entries, a LinkedHashSet orders the entries in their insertion order by default.

See and retype the below code. You will notice that the entries in the LinkedHashSet always maintain their insertion order.


package q11383;
import java.util.*;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set namesSet = new LinkedHashSet();
		namesSet.add("Samos");
		namesSet.add("Hyderabad");
		namesSet.add("Dallas");
		namesSet.add("Dallas");
		System.out.println("namesSet = " + namesSet);
		namesSet.add("Dallas");
		namesSet.add("Bangalore");
		System.out.println("namesSet = " + namesSet);
		namesSet.add("Athens");
		System.out.println("namesSet = " + namesSet);
	}
}