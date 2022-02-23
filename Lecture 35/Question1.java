The toString present in the Object class ensures that an object of any class in Java can be converted into a String representation.

If we do not override the toString method, by default the toString method present in the Object's class will be called (which is of no much use).

See and retype the below code and observe the output to understand the usage of toString method.

You will also notice that when an object reference is concatenated with + operator to a string literal, the object reference is automatically converted to a string by invoking the toString method.

That is how in the statement System.out.println("a : " + a);, "a : " + a is resulting in "a : " + a.toString().



package q11279;
public class ToStringExample {
	public static void main(String[] args) {
		A a = new A(4);
		System.out.println("a.toString() : " + a.toString());
		System.out.println("a : " + a);
	}
}
class A {
	private int value;
	public A(int value) {
		this.value = value;
	}
	public String toString() {
		return "The value is : " + value;
	}
}