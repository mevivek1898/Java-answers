Let us consider the below example code to understand polymorphism.

First see and retype the below code and then observe the output you receive.

After seeing the output when you read the below text you will understand polymorphism better.

You will notice that getName() method is overridden in class B and class C.
You will notice that the overridden getName() method in class B first invokes the getName() method present in class A using the super keyword.
Similar is the case with class C.
Both the overridden methods in B and C append their own information to the value returned by the superclass's getName() method.
Notice that references a, b, c are declared to be of type class A, even though their instances objects are of types A, B and C respectively.

We are able to hold the objects of type B and C in references b, c of type A because both B and C are subclasses of type A.

Here it appears that the method getName() when invoked on references of type A is behaving differently (by producing different output).

The reason for this polymorphic behaviour is that JVM (Java virtual machine) does not call the method declared in the type (class) of the reference (which in our case is class A), but it will appropriately look for the implementation in the object (instance) whose address is held by the reference.

Hence, when b.getName() is invoked, since b referrers to an instance of class B, the implementation in class B is executed. Similar is the case with the method call c.getName();.

We can define polymorphism as the ability of a method in a class to behave differently depending on the actual object it is being invoked on.


package q11275;
public class PolymorphismExample2 {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		C c = new C();
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
	}
}
class A {
	public String getName() {
		return "A";
	}
}
class B extends A {
	public String getName() {
		return super.getName() + " " + "B";
	}
}
class C extends B {
	public String getName() {
		return super.getName() + " " + "C";
	}
}