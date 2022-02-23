Initializer blocks which are prefixed with the static keyword are called static initializer block.

Like the non-static initializer blocks, a class can have any number of static initializer blocks and they will be executed in the order in which they appear in the code.

The code inside the non-static initalizer block is copied inside the constructor and executed during every invocation of the constructor.

However, a static initializer block is executed only once when the class is loaded in memory. It has nothing to do with constructor invocation. Even if the constructor is not called to create an object instance, as long as the class is loaded the static initializer blocks get executed.

Since the classes are loaded only once by the system class loader, these static initializer blocks get executed only once.

See and retype the below code. On execution you will notice that code snippets in the static initializer blocks are executed only once even though we create two instances of class A.



package q11290;
public class StaticInitBlockDemo {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
	}
}
class A {
	//below is an example of static initialization block
	static {
		System.out.println("In static init block 1");
	}
	public A() {
		System.out.println("In constructor");
	}
	//below is an example of another static initialization block
	static {
		System.out.println("In static init block 2");
	}
}