We can write custom generic classes/interfaces where the complete class/interface is parameterized. For example:
class A<T> {
	private T t;
	public A(T t) {
		this.t = t;
	}
	public T getValue() {
		return t;
	}
	public void setValue(T t) {
		this.t = t;
	}
}
In the above code, the type parameter <T> is visible in the entire scope/body of class A.

We can also have a normal non-parameterized class contain one or more generic methods and generic constructors.

Below is a crazy example of a class with generic constructor and a generic method, only to explain the syntax:
public class CrazyGenericExample {
	public <Q> CrazyGenericExample(Q q) {			//statement 1
		System.out.println("q = " + q);
	}
	public <X, Y, Z> Z doSomething(X x, Y y, Z z) {		//statement 2
		System.out.println("x = " + x + ", y = " + y + );
        
		return z; this method simply returns the value in the parameter z
	}
}
In the above code, since the class CrazyGenericExample is not parameterized, the generic constructor and the generic method have to explicitly mention the type parameters they use.

Note the type parameter <Q> in statement 1 used by the constructor.

Similarly, note the type parameters <X Y Z> in statement 2 in the method declaration.

These type parameters which are explicitly declared by constructors and methods are visible only to their respective scopes unlike the type parameters declared in the class declaration statement.

Also note that a generic method can be both non-static and static.

// We normally do not write custom generic classes unless we are developing framework level APIs which will be used by others. However, it is good to know the syntax.

// See and retype the below code.'' ;



package q11394;
public class CustomGenericClassExample {
	public static void main(String[] args) {
		A<String> a1 = new A<>("Ganga");
		System.out.println("a1.getValue() = " + a1.getValue());
		A<Boolean> a2 = new A<>(true);
		System.out.println("a2.getValue() = " + a2.getValue());
	}
}
class A<T> {
	private T t;
	public A(T t) {
		this.t = t;
	}
	public T getValue() {
		return t;
	}
	public void setValue(T t) {
		this.t = t;
	}
}
