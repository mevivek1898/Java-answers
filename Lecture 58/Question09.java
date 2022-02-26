A HashMap implementation provides a constant-time performance for the put and get methods.

put(K key, V value): Add the specified value with the specified key in the map. If the map previously contained a mapping for the key, the old value is replaced with the new one.

Write a program to understand how the (key, value) pair is inserted into HashMap using the method put.

Create a class HashMapMethodsDemo with a main method. Create an instance of the HashMap and add the given (key, values) into the map and print the result. The (key, values) are
(Jan, January)
(Feb, February)
(Mar, March)
(Apr, April)
The result should be as follows:
namesMap = {Feb=February, Apr=April, Jan=January, Mar=March}
namesMap = {Feb=Fabulous, Apr=April, Jan=January, Mar=March}



package q11963;
import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap <String, String>();

		// add given (key, values) to Map

namesMap.put ("Jan", "January");

namesMap.put ("Feb", "February");

namesMap.put ("Mar", "March");

namesMap.put ("Apr", "April");



		System.out.println("namesMap = " + namesMap);
		
		// change the value February to Fabulous
		namesMap.put ("Feb", "Fabulous");
		

		// observe the change in the output the value for the particular key is updated.
		
		System.out.println("namesMap = " + namesMap);
	}
}