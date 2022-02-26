get(Object key): Returns the value to which the key is mapped, or returns null if there is no mapping for the key.

Write a program to understand how to get the value mapped to the particular key in HashMap using get method.

Create a class HashMapMethodsDemo with a main method. Create an instance of the HashMap and get the value mapped to the key Tue.

The result should be as follows:
namesMap = {Thu=Thursday, Tue=Tuesday, Sun=Sunday, Mon=Monday}
value mapped to Tue is : Tuesday


package q11968;
import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap<String, String>();
		namesMap.put("Sun", "Sunday");
		namesMap.put("Mon", "Monday");
		namesMap.put("Tue", "Tuesday");
		namesMap.put("Thu", "Thursday");
		System.out.println("namesMap = " + namesMap);

		// write your code here

System.out.println("value mapped to Tue is : " + namesMap.get("Tue"));

		
	}
}

