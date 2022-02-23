In Java, since Object class is the superclass (root class) of every class, instance of any class is also an instance of Object class.

For example:
class Person {
}
Person p = new Person();
In the above code, the instance referred by p IS-A Person. Since every class in Java, including Person is a subclass of Object, the statement p IS-A Object is also correct.

Which means every object in Java will have more than one IS-A relationship (One with its own class type and one with Object class type).

Any object which satisfies more than one IS-A relation is called polymorphic. For example, let us write classes A, B and C which override toString() method of Object class. First see and retype the below code and then observe the output you receive.

After seeing the output read the below observations to further understand the polymorphic behaviour.

You will notice that System.out.println(a); is same as System.out.println(a.toString());, because the println method which takes any object internally calls toString() method on that reference.
You will notice that the overridden toString() method in class B first invokes the toString() method present in class A using the super keyword.
Similar is the case with class C.
Both the overridden methods in B and C append their own information to the value returned by the superclass's toString() method.
Notice that references a, b, c are declared to be of type class Object, since all classes are subtypes of class Object.

For the above stated reason we are able to hold the instances of type A, B and C in references a, b, c of type Object.

When the method toString() is invoked on references of type Object, we see that the actual implementation present in their respective objects is being called to produce the output..

This behaviour is also called virtual method invocation. Since the delegation to the correct method happens on the instance during runtime, its also called as runtime polymorphism.


package q11276;
public class PolymorphismExample2 {
	public static void main(String[] args) {
		Object a = new A();
		Object b = new B();
		Object c = new C();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.toString());
	}
}
class A {
	public String toString() {
		return "A";
	}
}
class B extends A {
	public String toString() {
		return super.toString() + " " + "B";
	}
}
class C extends B {
	public String toString() {
		return super.toString() + " " + "C";
	}
}