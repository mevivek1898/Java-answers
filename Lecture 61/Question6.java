When a generic class or interface is used without passing any parameters as a normal class or interface, it is called a raw type.

For example:
class A {
}
class B<T> {
}
A a = new A();			// statement 1
B<String> b1 = new B<String>();	// statement 2
B b2 = new B();			// statement 3In the above code, A is a normal class and class B is a generic type.

In statement 3, class B is called a raw type for the generic type B<T>.

In statement 1, class A is not called a raw type. Since A is a normal class.

We can assign a parameterized type to a raw type. For example:
b2 = b1; // this is perfectly valid and allowed from the above codeHowever, when we assign a raw type to a parameterized type we get a warning. For example:
b1 = b2; // compiler will warn of unchecked conversionSelect all the correct statements in the below code.
List aList = new ArrayList();				// statement 1
List<String> bList = new ArrayList<String>();		// statement 2
List<String> cList = new ArrayList<>();			// statement 3
List<String[]> dList = new ArrayList<String[]>();	// statement 4
List<String> eList = new ArrayList();			// statement 5
List fList = new ArrayList<String>();			// statement 6


Answer 


Statement 1 is an example of raw type.
Statement 2 and Statement 3 mean the same.
Compiler will produce a type conversion warning for Statement 5.
Compiler will not produce a type conversion warning for Statement 6.