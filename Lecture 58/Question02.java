A Map represents a collection of key-value pairs.

In a Map one key is mapped to at most one value.

Map does not allow duplicate keys, but the values can be duplicated.

Below are some of the concrete classes which implement Map interface:
HashMap - most commonly used class whenever we want to store key mapped with values (the order of iteration over the entries is not guaranteed to be the same as the insertion order).
TreeMap - is used when we want the key-value entries to be sorted on the natural ordering of its keys, or by a custom Comparator
LinkedHashMap - is used when we want the retrieval of key-value entries to be in the order in which they were inserted or in the order in which they were last accessed.
The most commonly used methods in Map interface are given below:
put(K key, V value) - stores the key and value mapping. If the key already exists, the old value will be replaced with the newly provided value and the old value will be returned.
get(Object key) - returns the value mapped to the given key.
remove(Object key) - removes the key-value mapping if such a mapping exists and returns the value mapped to the key. It returns null, if there is no mapping for the given key.
size() - returns the count of key-value pairs present.
keySet() - returns a Set containing only the keys in this map.
putAll(Map m) - stores all the the key and value mapping in the given map m.
Click on  to understand the working of various methods of a Map.

Click on  to know the main difference between HashMap, LinkedHashMap and TreeMap.

Complete the missing code below.



package q11371;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map countryCodesMap = new HashMap();
		countryCodesMap.put("IN", "India");
		
		/*Follow given instructions
		
		  see how key and values is added to the map similarly add the following data
		  
		  put key US and value as United States of America
		  
		  put key UK and value as United Kingdom
		  
		
		*/
		countryCodesMap.put ("US" , "United States of America");
		
		countryCodesMap.put ("UK" , "United Kingdom");
		System.out.println("Map entries : " + countryCodesMap);
		
		countryCodesMap.put("IN", "Bharat");
		
		System.out.println("Map entries : " + countryCodesMap);
		
		
		
		System.out.println("Value for UK is : " + countryCodesMap.get("UK"));//Fill the missing code here get the value for key UK
		
		
		
		System.out.println("Removing entry for US : " + countryCodesMap.remove("US")); //Fill the missing code remove the key US
		
		System.out.println("Map entries : " + countryCodesMap);
		
		
	
	}
}