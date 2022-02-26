LinkedHashmap
Practice Programs on HashMap
Practice Programs on TreeMap
©
  
Close130%
L58
LinkedHashmap
Q. No : 11377
Understanding LinkedHashMap 
The LinkedHashMap is a subclass of HashMap.

Unlike a HashMap which does not maintain order of the added entries, a LinkedHashMap orders the entries in their insertion order by default.

A LinkedHashMap also has a special constructor LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) which creates a map whose order of iteration will be the order in which its entries were last accessed, i.e the order will be from least-recently accessed to most-recently accessed.

Fill the missing code in the below program. You will notice that the entries in the LinkedHashMap always maintain their insertion order.


package q11377;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map namesMap = new LinkedHashMap();
		namesMap.put("Sam", "Samos");
		/*
		Add the following key value pair to the map
		
		add (Hyd, Hyderabad)
		
		add (Dal, Dallas)
				*/
				namesMap.put("Hyd", "Hyderabad");
				
				namesMap.put("Dal", "Dallas");
				
		System.out.println("namesMap = " + namesMap);
		
		//Now add (Ban, Bangalore)
		
		//Print the data in namesMap
		
		//add (Ath, Athens)
		namesMap.put("Ban", "Bangalore");
		
		System.out.println("namesMap = " + namesMap);
		
		namesMap.put("Ath", "Athens");
		

		System.out.println("namesMap = " + namesMap);
	}
}