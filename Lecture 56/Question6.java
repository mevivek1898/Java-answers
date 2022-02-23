The Iterable interface has a method called iterator(), which returns an object of type Iterator.

The Iterator interface has two methods hasNext() and next() which can also be used for iterating over all the elements present in a collection. See and retype the below code which has an example for iterating over ArrayList using an Iterator.

Note: Whenever we use collection classes, we need to import the relevant classes or import all classes in the util package using a statement like: import java.util.*;



package q11365;
import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
		List planetsList = new ArrayList();
		planetsList.add("Mercury");
		planetsList.add("Venus");
		planetsList.add("Earth");
		planetsList.add("Mars");
		planetsList.add("Jupiter");
		planetsList.add("Saturn");
		planetsList.add("Uranus");
		planetsList.add("Neptune");
		planetsList.add("Pluto");
		Iterator itr = planetsList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

