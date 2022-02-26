See the code and retype the same to learn how to iterate over the elements stored in a HashSet.

Note the usage of HashSet class and the for-each statement.

The class scans through all the arguments passed to the main method, and stores them into a HashSet if the argument's first char is in uppercase.

The program first uses the for-each loop to print all the stored names from the HashSet one name on each line.

Note that HashSet does not maintain the any order while iterating on the elements. If we want to have the insertion order to be maintained during iteration, we should use LinkedHashSet, about which we will learn later.



package q11381;
import java.util.*;
public class HashSetIterationDemo {
	public static void main(String[] args) {
		Set namesSet = new HashSet();
		for (String argument : args) {
			if (Character.isUpperCase(argument.charAt(0))) {
				namesSet.add(argument);
			}
		}
		for (Object name : namesSet) {
			System.out.println(name);
		}
	}
}