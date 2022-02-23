A Java class which is marked as static is called a static class.

A static class can be written only inside another class. For example:
class A {
	static class B {
		private int b;
		public B(int b) {
			this.b = b;
		}
	}
}
The static class B is called a static nested class since it is nested inside class A.

Just like static fields and static methods, static nested classes can be accessed using their other class name. For example instances of class B can be created as below:
A.B b = new B();
See and retype the below code to understand the syntax of static classes. Since the static nested class A is inside StaticClassDemo, in the main method, we can directly refer A or refer using the context of the outer class as StaticClassDemo.A.



package q11293;
public class StaticClassDemo {
	public static void main(String[] args) {
		StaticClassDemo.A a1 = new StaticClassDemo.A(3);
		A a2 = new A(4);
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
	}
	static class A {
		private int value;
		public A(int value) {
			this.value = value;
		}
		public String toString() {
			return "A [value = " + value + "]";
		}
	}
}