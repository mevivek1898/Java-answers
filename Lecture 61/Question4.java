All the collections in Java are parameterized using generic syntax. For example when we see the List interface we will find :
public interface List<E> extends Collection<E>{
	public boolean add(E e);

	public E get(int index);
	...
	...
}
In the above example, List class is declared with a type parameter E.

As mentioned earlier collections which work with elements use E for the type parameter name, as a convention. It could have been Z or X or Y, however E is more intuitive to denote an element type.

In the below code:
List<String> namesList = new ArrayList<String>();	//Statement 1
namesList.add("Hyderabad");
namesList.add("Bangalore");
namesList.add("Chennai");
for (String name : namesList) {				//Statement 2
	System.out.println(name.substring(0, 3));	//Statement 3
}
String is called type argument passed to List and ArrayList.

Since in statement 1 the type argument is provided as String, in statement 2 we are able to directly iterate over the elements as type String instead of receiving it as an Object and later type casting the Object reference to String.

If the type argument String is omitted in statement 2, elements will be of type Object forcing us to type cast to appropriate type before using it.

Note that unless there is a strong reason to do it otherwise, collection classes should always be used by passing appropriate argument type.

Fill the missing code in the given program using the instructions given.



package q11391;
import java.util.*;
public class SimpleArrayListDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Hyderabad");
		
		//Add Bangalore to the namesList
		
		
		namesList.add("Bangalore");
		
		namesList.add("Chennai");
		
	
		//Add Chennai to the namesList
	
		for (String name : namesList) {
	
		// Print the String up to 3 characters using substring method
	System.out.println(name.substring(0, 3));
	
		}
	}
}