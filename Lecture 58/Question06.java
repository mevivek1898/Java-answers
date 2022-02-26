A HashMap implementation provides a constant-time performance for the put and get methods.

However, the HashMap does not guarantee that the order of retrieval of entries will be same as its size grows.

Fill the missing code given below which illustrates some of the commonly used methods in HashMap.

Correlate the code and output to understand the usage of the methods put(K key, V value) and get(Object key).



package q11375;
import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map namesMap = new HashMap();
		namesMap.put("Sam", "Samos");
		/*
		Observe how key, value is added to map
		
		Similarly add the following (key, value) pairs to the map
		
		put (Hyd,Hyderabad )
		
		put (Dal, Dallas)
		
		put(Ban, Bangalore)
		
		*/
		namesMap.put ("Hyd", "Hyderabad");
		
		namesMap.put ("Dal", "Dallas");
		
		namesMap.put ("Ban", "Bangalore");
		
		System.out.println("namesMap = " + namesMap);
		System.out.println("value mapped to Dal is : " + namesMap.get("Dal"));//get the value mapped to Dal
		namesMap.put("Dal", "Dalton");
		System.out.println("namesMap = " + namesMap);
		System.out.println("new value mapped to Dal is : " + namesMap.get("Dal"));
		System.out.println("namesMap.size() = " + namesMap.size());
	}
}