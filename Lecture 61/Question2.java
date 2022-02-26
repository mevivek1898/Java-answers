All the collections in Java are parameterized using generic syntax. For example when we see the List interface we will find :
public interface List<E> extends Collection<E>{
	public boolean add(E e);

	public E get(int index);
	...
	...
}
In the above example, List is called generic interface. Similarly we can have generic classes. The E surrounded by < and > is called the type parameter.

In the below code:
List<String> namesList = new ArrayList<String>();
String is called type argument passed to List and ArrayList.

Any class or interface which accepts parameterized types is called a generic class or a generic interface respectively. Select all the correct statements for the below code:
class A { // statement 1
}

class B<T> { // statement 2
}

B b1 = new B(); // statement 3

B<String> b1 = new B<String>(); // statement 4



Answer 


In statement 1, class A is called a non-generic class.
In statement 2, class B is called a generic class.