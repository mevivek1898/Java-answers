See and retype the below code to familiarize yourself with some of the commonly used methods in HashSet.

The class HashSetMethodsDemo iterates through all the arguments passed to the main method, and stores them into an HashSet, which is later manipulated using its methods.

Correlate the code and output to understand the usage of the methods.



package q11380;
import java.util.*;
public class HashSetMethodsDemo {
	public static void main(String[] args) {
		Set aSet = new HashSet(args.length);
		for (String argument : args) {
			aSet.add(argument);
		}
		System.out.println("aSet = " + aSet);
		System.out.println("aSet.size() = " + aSet.size());
		boolean removedFlag = aSet.remove("Larry Page");
		System.out.println("Larry Page removedFlag = " + removedFlag);
		System.out.println("aSet = " + aSet);
		aSet.add("Steve Jobs");
		System.out.println("aSet = " + aSet);
		aSet.add("Bill Gates");
		System.out.println("aSet = " + aSet);
	}
}