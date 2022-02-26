It is very important to know the difference between type parameter and type argument.

A class or an interface is of a generic type when it uses parameterized types. For example:
public class Calculator<T> {
	public T sum(T number1, T number2) {
		return number1 + number2;
	}
}
In the above example, Calculator is a generic class even if one of its methods is parameterized using generic type parameter. The T surrounded by < and > (angular brackets) is called the type parameter. Note that it is not mandatory that the class should be parameterized for the individual methods to be parameterized.

In the below code:
Calculator<Integer> calculator = new Calculator<Integer>(); 
Calculator<Float> floatCalculator = new Calculator<Float>();
int intTotal = calculator.sum(3, 7);
float floatTotal = calculator.sum(3.2f, 7.2f);
In the above example, Integer and Float are called type arguments passed to Calculator class. You will notice that method sum will be valid only if the type arguments are subclasses of Number. In such situations we use bounded type parameters, which we will learn later.

The type argument can be any one of the following non-primitive types:
any class type - eg: ArrayList<Integer>, HashMap<String, String>
any interface type - eg: ArrayList<CharSequence>
any array type - eg: ArrayList<int[ ]>, HashMap<String, boolean[ ]>
nested generic type arguments - eg: ArrayList<Set<String>>, HashMap<String, List<Integer>>
Type parameter names are usually single character uppercase letters. The convention used in Java is given below:
E - is used while working with elements. Almost all classes in collection framework which work with elements use this name as the type parameter name.
K - is used to denote the key in a key-value pair. Almost all classes in the Map hierarchy in collection framework use this name to denote a key.
V - is used to denote the value in a key-value pair. Almost all classes in the Map hierarchy in collection framework use this name to denote a value.
T - is used to denote a class or interface of any type.
N - is used to denote a Number.
We can use S, U, V and so on when we want to denote different types after the first type.
Select all the correct statements for the below code:
class A { // statement 1
}

class B<T> { // statement 2
}

class C<T> { // statement 3
}

B<A> b1 = new B<A>(); // statement 4

C<B<A>> c1 = new C<B<A>>(); // statement 5

C c2 = new C(); // statement 6

C<int> c4 = new C<int>(); // statement 7

C<int[]> c3 = new C<int[]>(); // statement 8


Answer

Statement 6 will not result in compilation errors.
