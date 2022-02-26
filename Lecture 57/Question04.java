See and retype the below code to familiarize yourself with some of the commonly used methods in ArrayList.

The class iterates through all the arguments passed to the main method, and stores them into an ArrayList, which is later manipulated using its methods.

Correlate the code and output to understand the usage of the methods.



package q11369;
import java.util.*;
public class ArrayListMethodsDemo {
	public static void main(String[] args) {
		List aList = new ArrayList(args.length);
		for (String argument : args) {
			aList.add(argument);
		}
		System.out.println("aList = " + aList);
		System.out.println("aList.size() = " + aList.size());
		Object removedElement = aList.remove(3);
		System.out.println("removedElement = " + removedElement);
		System.out.println("aList = " + aList);
		Object replacedElement = aList.set(0, "Steve Jobs");
		System.out.println("aList = " + aList);
		aList.add(0, "Bill Gates");
		System.out.println("aList = " + aList);
	}
}

