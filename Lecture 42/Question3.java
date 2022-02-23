In Java, when we do not want a method in a class to be overridden in its subclasses, we declare that method as final.

We have many final methods in Object class. For example below code displays one of them:
public class Object {
	...
	...
	public final void wait() throws InterruptedException {
		wait(0);
	}
	...
}
Select all the correct statements from the below code:
public class A {
	public void method1() { /*do something */ }		// statement 1
	public final void method2() { /*do something */ }	// statement 2
	public void method3() { /*do something */ }		// statement 3
}
public class B extends A {
	public void method1() { /*do something else */ }	// statement 4
	public void method2() { /*do something else */ }	// statement 5
	public final void method3() { /*do something else */ }	// statement 6
}



Answer

method1 of class A in statement 1 is overridden in class B in statement 4.