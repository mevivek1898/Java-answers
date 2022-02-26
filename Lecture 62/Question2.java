There would be situations when we want to have a generic class or a method, whose types are restricted.

For example, if we want to write a method which accepts two collections and returns the collection with more elements, we cannot use a unrestricted type parameter as given in the below code:
class Util {
	public static <T>T largerCollection(T collection1, T collection2) {
		...
	}
}
In the above code, the actual type argument passed into T can be a String or an Integer or any other type. There will be no enforcement by the compiler that it should be an instance of type Collection.

There is a way in generics by which we can restrict the type passed in T to be a subtypes of Collection. Below is the syntax:
class Util {
	public static <T extends Collection>T largerCollection(T collection1, T collection2) {
		return (collection1.size() > collection2.size())? collection1 : collection2;
	}
}
In the above code the syntax <T extends Collection>, informs the compiler that it should ensure that only subtypes of Collection can be passed as type arguments for the type parameter T.

Note that since the type argument passed for T will be a subtype of Collection, we are directly able to call the method size() present in references collection1 and collection2 which will be instances of some subtype of Collection class.

The extends in the code fragment <T extends Collection> is used for both classes and interfaces.

Extends can also be used to restrict the type to be a subtype of multiple types at the same time. For example:
<T extends A & B & C>
In the above code the type argument which will be passed for T has to be a subtype of A, B and also C. However, care must be taken that if one multiple types is a class, then the class must be placed before the interfaces in the list of types.

See and retype the below code.


package q11395;
import java.util.*;
public class BoundedTypeExample {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<>();
		namesList.add("Ganga");
		namesList.add("Godavari");
		namesList.add("Krishna");
		Set<String> namesSet = new LinkedHashSet<>();
		namesSet.add("Ganga");
		namesSet.add("Godavari");
		namesSet.add("Krishna");
		namesSet.add("Yamuna");
		namesSet.add("Narmada");
		System.out.println("largerCollection : " + largerCollection(namesList, namesSet));
	}
	public static <T extends Collection> T largerCollection(T collection1, T collection2) {
		return (collection1.size() > collection2.size())? collection1 : collection2;
	}
}