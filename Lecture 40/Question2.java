A nested class marked as static is called a static nested class and not an inner class.

Nested classes which are not declared as static are called inner classes.

For example:
class A { //this is called a top-level class
	class B { //this is an inner class
	}
	static class C { //this is a nested class
	}
}
In the above code,
A is called a top-level class
 B is called an inner class and
C is called a static nested class
Note that the static nested class C can only access static members of class A and not A's instance members.

Unlike an inner class where we need an instance of outer class to create an instance of inner class, a static nested class can be directly created using the new keyword.

See and retype the below code to understand the difference in creation of an instance of an inner class and a static nested class.

Note: A static nested class is almost equal to a top-level class, except that it is always referenced under the context on its outer class.


package q11295;
public class A {
	class B {
		private B() {
			System.out.println("In inner class B's constructor");
		}
	}
	static class C {
		private C() {
			System.out.println("In static nested class C's constructor");
		}
	}
	public static void main(String[] args) {
		A.B b = new A().new B();
		A.C c = new A.C();
	}
}