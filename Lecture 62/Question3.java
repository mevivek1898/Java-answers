The question mark character ? is called the wildcard. It represents an unknown type. Its usage and meaning in different contexts are given below with examples.

unbounded wildcard - eg: List<?>, represents a List of unknown type. We use such code when we want to work only with the methods in List interface without the knowledge of the type of elements it stores.
upper bounded wildcard - eg: List<? extends A>, represents a List whose elements are of type A or a subtype of A. (Note extends is used for both a class and an interface).
lower bounded wildcard - eg: List<? super A>, represents a List whose elements are of type A, or a super type of A. (Note super is used for both a class and an interface).
Note the below thumb rules while choosing to use wildcards:
unbounded wildcard - should be used when we want to access only the methods in Object class on the parameters passed.
upper bounded wildcard - should be used as parameters when we want to send data to methods as parameters. It can be thought of as an in parameter. It serves a read-only copy of data which cannot be manipulated.
lower bounded wildcard - should be used as parameters when we want to retrieve processed data from methods via parameters. It can be thought of as an out parameter. It allows for data manipulation.
no wildcard - do not use a wildcard, instead use a specific type, when we want to use a type to be acting as both in and out parameter, meaning when we want a parameter to carry data and also be open for manipulation.
See and retype the below code.


package q11396;
import java.util.*;
public class WildCardTypesDemo {
	public static void main(String[] args) {
		List<? extends Number> upperList = Arrays.asList(2, 3, 4);
		List<? super Number> lowerList = new ArrayList<>();
		List<Integer> noBoundsList = new ArrayList<>();
		upperBoundedMethod(upperList);
		lowerBoundedMethod(lowerList);
		noBoundedMethod(noBoundsList);
	}
	public static void upperBoundedMethod(List<? extends Number> list) {
		System.out.println("In upperBoundedMethod");
		for (Number number : list) {
			System.out.println(number);
		}
	}
	public static void lowerBoundedMethod(List<? super Integer> list) {
		System.out.println("In lowerBoundedMethod");
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("list : " + list);
	}
	public static void noBoundedMethod(List<Integer> list) {
		System.out.println("In noBoundedMethod");
		list.add(new Integer(8));
		list.add(new Integer(7));
		System.out.println("list : " + list);
	}
}