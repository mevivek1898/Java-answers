A nested class which is declared inside a block (between an opening and closing brace) is called a local class.

Inner classes are also local classes. However, to differentiate between inner and local classes, we use the term local class to a class which is declared inside a method or a conditional or a loop block. For example:
class A { //this is called a top-level class
	class B { //this is an inner class
	}
	static class C { //this is an inner class
	}
	public void someMethodInClassA() {
		class D {
		}
	}
}
In the above code,
A is called a top-level class
 B is called an inner class
C is called a static nested class and
D is called a local class
Local classes can access instance members of their enclosing class.

The visibility of the local class is restricted to the scope of the enclosing block (braces).

Note that local classes cannot have static methods or interfaces as members. We can have fields marked as static provided they are also marked as final (such fields are called as constants).

See and retype the below code.


package q11296;
public class A {
	private int value = 7;
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
	public void someMethodInClassA() {
		class D {
			private D() {
				System.out.println("In local class D's constructor");
				System.out.println("value = " + value);
			}
		}
		D d = new D();
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = new A().new B();
		A.C c = new A.C();
		a.someMethodInClassA();
	}
}