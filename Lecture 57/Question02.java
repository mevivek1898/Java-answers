Whenever we want a growable array implementation we use an ArrayList.

Click on  to understand the difference between Array and ArrayList.

ArrayList has 3 constructors.
ArrayList() - the default constructor creates an empty ArrayList
ArrayList(Collection c) - it creates an ArrayList with the contents of the collection passed as argument.
ArrayList(int initialCapacity) - it creates an empty ArrayList with the given initial capacity.
ArrayList internally stores all the references of added elements in an array. The initial array size depends on which of the above three constructors is used to create the ArrayList instance.

The size of this internal array is called capacity.

We neither access this internal array, nor should be bothered about this array. It is useful to know about this array to understand the difference between the terms size and capacity.

When we refer to the size of an ArrayList, we are talking about the count of elements stored in that array.

When this array is filled with elements to its capacity, in order to accommodate new elements, ArrayList silently replaces the filled array with a new array of bigger capacity. It also restores all the existing elements in the old array into this new array before performing the add operation with the new element.

Note that whenever you call the size() method on an ArrayList, it always returns the current count of elements it holds. It has nothing to do with the internal capacity.

When we know the count of elements we will be storing in an ArrayList, it is efficient to provide it as the initialCapacity (as a argument to the ArrayList constructor) so that the ArrayList can avoid the internal capacity adjustments while elements are being added.

For example, if we create an ArrayList called cList with an initialCapacity of 20, and do not add any elements to cList, it still remains an empty list. Meaning, it has an internal capacity to store 20 elements before resizing itself. As long as there are no elements added to the cList, a call to the size() method on cList will always return 0, even though its internal capacity is 20.

Follow the instructions provided in the comments in the below program and accordingly fill in the missing code.


package q11367;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
			In the below lines we are creating an empty ArrayList 
			called aList and printing its size and elements.
			Printing an ArrayList instance (aList) will print its elements in brackets.
			For example, when we print aList, we will notice [] (empty brackets), 
			as aList is empty.
		*/
		ArrayList<String> aList = new ArrayList<String>();
		System.out.println("aList.size() = " + aList.size());
		System.out.println("aList = " + aList);
		
		/*
			The below line of code adds a string element
			called "First Entry" to aList
		*/
		aList.add("First Entry");
		
		/*
			Insert a line of code below this comment
			to add a string element called "Second Entry" to aList
		*/
		
		aList.add("Second Entry");
		/*
			In the below line, fill in the missing code such
			that it prints the size of aList 
		*/
		System.out.println("aList.size() = " + aList.size()  );
		
		/*
			In the below line, fill in the missing code such
			that it prints aList 
		*/
	//	for(String Lpu:aList)
		System.out.println("aList = [" +  aList.get(0)+", " +aList.get(1)+"]" );
		
		
		ArrayList<String> bList = new ArrayList<String>(aList);
		/*
			In the below line, fill in the missing code such
			that it prints the size of bList 
		*/
		System.out.println("bList.size() = " +  bList.size() );
		
		/*
			In the below line, fill in the missing code such
			that it prints bList 
		*/
	
		System.out.println("bList = " +  bList );
		
		
		ArrayList<String> cList = new ArrayList<String>(20);
		/*
			In the below line, fill in the missing code such
			that it prints the size of cList 
		*/
		System.out.println("cList.size() = " +  cList.size() );
		
		/*
			In the below line, fill in the missing code such
			that it prints cList 
		*/
		
		System.out.println("cList = [" + "]" );
	}
}