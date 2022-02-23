An interface is primarily used to create a type.

In Java, a class is also a type which has behaviour attached to it.

However, in large object-oriented systems where multiple classes interact with each other an interface is the preferred means of creating a type. Classes are still needed which implement the type, however the publicly visible contract (methods) is published by the interface and the implementation is provided in the implementing classes.

By doing this we achieve what is called loose-coupling, where a class does not depend on the actual implementation (of another class) but rather depends on the contract (i.e. the methods) published through the interface. This ensures that the classes which rely on the interface, need not change whenever the underlying implementation in the implementing classes changes.

See and retype the below code to understand how the class InterfaceDemo need not know the difference in the implementation present in classes A and B, when it uses the interface.

Once you see the output you will realize that as long as the method in the interface Greeting is not changed, one need not change the code in class InterfaceDemo, even when the actual implementation code inside the method getGreetings in classes A and B change.



package q11283;
public class InterfaceDemo {
	public static void main(String[] args) {
		Greeting g1 = new A();
		Greeting g2 = new B();
		System.out.println(g1.getGreetings("Thor"));
		System.out.println(g2.getGreetings("Thor"));
	}
}
interface Greeting {
	String getGreetings(String name);
}
class A implements Greeting {
	public String getGreetings(String name) {
		return "Hi " + name;
	}
}
class B implements Greeting {
	public String getGreetings(String name) {
		return "Hola " + name;
	}
}