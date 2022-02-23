In a Java class, the fields which are marked as static are called static fields and those that are not marked as static are called as instance fields or simply fields. For example, in the below code:
class A {
	static int a;
	int b;
}
a is a static field, while b is an instance field. Meaning, if we create two or three instances of class A as given below:
A a1 = new A();
A a2 = new A();
A a3 = new A();
All the three instances a1, a2 and a3 will have their individual copies of instance field b. However, all the three instances will share a single copy of the static field a.

Static fields can be initalized in static initializer blocks.

Instance fields are accessed using the dot . operator on the references of a class. However, the static fields are accessed using the dot . operator directly on the class name and not references (as shown in the below StaticFieldDemo class).

See and retype the below code to understand the difference between static and instance fields.

After execution, in the output you will notice that the value of aStaticField is the same in both a1 and a2, while the values stored in instanceField differ.

Also note how the static field aStaticField is directly accessed using the class name in the statement: A.aStaticField = 5;.



package q11291;
public class StaticFieldDemo {
	public static void main(String[] args) {
		A.aStaticField = 5;
		A a1 = new A(3);
		A a2 = new A(4);
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("A.aStaticField = " + A.aStaticField);
	}
}
class A {
	public static int aStaticField;
	private int instanceField;
	public A(int instanceField) {
		this.instanceField = instanceField;
	}
	public String toString() {
		return "A [instanceField = " + instanceField + ", aStaticField = " + aStaticField + "]";
	}
}