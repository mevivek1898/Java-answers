A class which implements Iterable interface can be used as a target in the for-each loop statement, which is also called the enhanced for statement.

Programmers do not normally implement this interface.

However, we need to know that the Collection interface which is the root interface of all collections, extends this Iterable interface. Which means that instances of all subclasses of Collection interface can be used in a for-each statement.

Note: Whenever we use collection classes, we need to import the relevant classes or import all classes in the util package using a statement like: import java.util.*;

For example, if we have a collection of type List called aList with names of persons, the below code demonstrates the syntax for iterating over the elements contained in aList and printing them.
for (Object name : aList) {
	System.out.println(name);
}
Note: While using a for-each loop to iterate over instances of Collection interface, the element type will be Object. After learning how to use Generics in Java, we will be able to declare instances of Collection interface of a specify data-type and use that type information in the for-each loop.

The below program assumes some strings are passed to its main(...) method during execution. It internally creates an instance of ArrayList (a class which implements List interface) and adds the elements it receives as arguments in the main(...) method. Read the instructions given in the comments and fill in the missing code.


package q11364;
import java.util.*;
public class ForEachDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		for (String name : args) {
			namesList.add(name);
		}
		
		/*
			Write a for-each loop below this comment
			which iterates over the namesList and 
			prints each element on a seperate line using println(...)
		*/
		for(String Nashe:args){
			System.out.println(Nashe);
		}
		
	}
}