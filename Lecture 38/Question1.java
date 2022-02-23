In a Java class, the fields are normally initialized in the constructors. However, there is another way of initializing them in an unnamed block also called initializer block or a non-static initializer block.

For example, in the below code you will notice that the field value is initialized to 3 in an initializer block.

Once the code is executed you will notice that the code snippets in the initializer blocks are executed (in the order in which they appear in the code) before the code in the constructor is executed. This is because the Java compiler copies all initializer blocks in the order they appear, into every constructor.

Since we are creating two instances of class A using the new keyword, the constructor is called twice and during the constructor call first, all the initializer blocks are executed.

If there is a block of code which has to be executed before the code inside any of the constructors is executed, such code can be placed in an initializer block.



package q11289;
public class NonStaticInitBlockDemo {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
	}
}
class A {
	private int value;
	//below is an example of non-static initialization block
	{
		value = 3;
		System.out.println("In non-static init block 1");
	}
	public A() {
		System.out.println("In constructor");
		System.out.println("value = " + value);
	}
	//below is an example of another non-static initialization block
	{
		System.out.println("In non-static init block 2");
	}
}