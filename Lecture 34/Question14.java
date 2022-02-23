In Java Object is the root class of all classes. Which means that all the methods of Object class described below are also present in each and every class in Java.
clone() - creates and returns a copy of this object. However, for this method to work the class has to implement Cloneable interface.
equals(Object obj) - it compares if two references are pointing to the same address. However, you can override this method to provide custom implementation which will verify the contents and not just references.We will learn more about it in the later sections.
finalize() - this method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object. Programmers do not call it, but can override and write cleanup code in it.
getClass() - this method returns the in-memory runtime representation of the Class object that was loaded and used to create the instance. For example:
Student st = new Student();
Class clazz = st.getClass();
The reference clazz points to the Class object which has the details of the Student class loaded in memory.
hashCode() - this method returns a hash code value (an integer) for the object. (we will learn more about it in data structures)
toString() - this method returns the string representation of the object.
There are many other methods like notify, notifyAll, and wait which are used to synchronize data access and method calls when multiple threads are involved.

See and retype the below code and observe the output to understand the usage of getClass() method



package q11278;
public class GetClassExample {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		String text = "Ganga";
		System.out.println("a.getClass() : " + a.getClass());
		System.out.println("b.getClass() : " + b.getClass());
		System.out.println("text.getClass() : " + text.getClass());
	}
}
class A {
}
class B {
}