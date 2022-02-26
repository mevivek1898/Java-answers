A List represents an ordered collection which allows duplicate elements.

List also allows index-based access of elements like an array. It can be considered to be a flexible array.

Below are some of the concrete classes which implement List interface:
ArrayList - most commonly used class whenever we want a flexible array behaviour
LinkedList - used when we want a doubly-linked list behaviour. It has extra methods like addFirst, addLast which are not present in List interface
Vector - is a legacy class. ArrayList is recommended to be used instead of Vector.
Stack - provides last-in-first-out (LIFO) implementation for objects. It is also a legacy class. It extends Vector. ArrayDeque is a recommended to be used for a LIFO functionality instead of this class.
Apart from the methods like add(E e), remove(Object obj), clear(), size(), etc., which the List interface inherits from its super interface Collection, it provides some extra index-based methods as given below:

add(int index, E element) - inserts the element at the given index.
addAll(int index, Collection c) - inserts all elements of Collection c at the given index.
get(int index) - returns the element at the given index in the List.
remove(int index) - removes the element at the given index in the List.
set(int index, E element) - replaces the element at the given index in the List, and returns the previous element at that index.
There are many more methods in the List interface, above mentioned are some of the most commonly used ones.

Read the instructions mentioned in the comments and fill in the missing code.



package q11366;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		
		/*
			Below code adds two elements into the namesList
		*/
		namesList.add("John Napier");
		namesList.add("Isaac Newton");
		System.out.println(namesList);
		
		/*
			Below code adds "C V Ramana" to the namesList at index 1
		*/
		namesList.add(1, "C V Ramana");
		System.out.println(namesList);
		
		/*
			Insert a line of code below this comment
			which adds "Charles Babbage" to the namesList at index 1
			Hint: See how "C V Ramana" was added above
		*/
		namesList.add(1,"Charles Babbage");
		
		System.out.println(namesList);
		
		/*
			Insert a line of code below this comment
			which removes the element at index 0
			Hint : Use the remove(...) method
		*/
		namesList.remove(0);
		System.out.println(namesList);
		
		/*
			Insert a line of code below this comment
			which replaces the element at index 2 with "Bose"
			Hint : Use the set(...) method
		*/
		namesList.set(2,"Bose");
		System.out.println(namesList);
	}
}