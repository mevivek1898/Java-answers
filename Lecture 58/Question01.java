The Object class defines a method called hashCode() which returns an int value.

This int value is called hashcode value of that object.

This int value is called hashcode because it is used in hash table implementations like HashMap, Hashtable etc.

Hash tables are data structures that map keys to values.

Simple arrays and all subtypes of Collection interface like List, Set and Queue are called linear data structures, because they store only elements.
For example: ["A", "B", "C"] is a example of a linear structure.

A Hash table, map, associative array, dictionary are data structures which store a collection of key and value pairs (Key  Value).
For example:[ ("IN"  "INDIA"), ("US"  "United States of America"), ("UK"  "United Kingdom")]

In Java, the Map interface provides the functionality of a hash table or associative array, where keys are mapped to values.

HashMap is an implementation of Map (we will learn more about Map later)

A HashMap is a Map implementation which internally uses hashing function to enable extremely fast storage and retrieval.

In this context the hashcode value returned by the hashCode() method of the Object class is used while storing the key and value pairs.

Since the hashCode() method is present in the Object class, every class in Java inherits the default implementation. Classes can also provide a custom implementation as long as they follow the below simple rules:
The hashCode() method must return an int value.
The hashCode() method when invoked multiple times on the same object should return the same value.
The above rule is applicable during a single run of the Java program (JVM). Meaning the value returned by the method can differ during different runs of the Java application (JVM).
If two objects are equal according to equal() method, then hashCode() method on both those objects must also return same integer value.
If two objects are not equal according to equal() method, then hashCode() method need not return different values. However, returning different values for unequal objects increases the performance of HashMaps.
Note that whenever equals(Object obj) method of Object is overridden in a subclass, the hashcode() method also should be overridden.

See and retype the below code.

Generally in our day-to-day programming we do not call the hashCode() method directly. As stated above it is internally used by HashMap and Hashtable while storing an object as a key.




package q11370;
public class HashCodeDemo {
	public static void main(String[] args) {
		String text1 = "Ganga";
		System.out.println("text1 = " + text1 + " text1.hashCode() = " + text1.hashCode());
		String text2 = "GangaRiver";
		System.out.println("text2 = " + text2 + " text2.hashCode() = " + text2.hashCode());
		String text3 = text2.substring(0, 5);
		System.out.println("text3 = " + text3 + " text3.hashCode() = " + text3.hashCode());
	}
}
