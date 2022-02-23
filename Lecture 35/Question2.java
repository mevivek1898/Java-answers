If we do not override the equals method, by default the equals method present in the Object's class will be called.

The implementation of equals present in the root class Object, only verifies if the references are same. It does not verify if the contents are same. Content verification is the responsibility of the overriding implementation.

See and retype the below code and observe the output to understand the usage of equals() method in case of A and B classes.

After you see the output you will realize that since we did not override the equals method in class B, the equals method invocations on class B instances, b1.equals(b2) and b1.equals(b3) both return false. This is because b1, b2 and b3 refer to three different objects in memory and the default equals method implementation in Object class will treat them different as they have different addresses.

However the calls a1.equals(a2) and a1.equals(a3) correctly return false and true respectively.

Let us understand the overridden equals method implementation in class A.

The below condition will ensure that the method will return true, if both references are actually pointing to same object (address in memory).
if (this == otherObject) { // checking if both are pointing to same reference (address)
	return true;
}
 The below code ensures that we are comparing two references of the same type. Since the equals method accepts a parameter of type Object, compiler will allow us to invoke equals method by passing objects of some other type, (since every class instance is a subtype of Object class). So the below condition will ensure that we are comparing apples to apples and oranges to oranges. If not it will return false.
if (otherObject instanceof A) {
	A otherARef = (A) otherObject;return this.value == otherARef.value;
} else {
	return false; 
	// the above line returns false if the object held in reference otherObject is not an instance of type A
}
If the reference is of type A, then we convert (by type casting) the reference otherObject into a reference of type A. And later we return the value returned by the comparision expression (this.value == otherARef.value), which actually checks the contents present in the field value in both the objects.
if (otherObject instanceof A) {
	A otherARef = (A) otherObject; 
	// the above line type casts otherObject which is of type Object to a reference otherARef of type A
	return (this.value == otherARef.value); 
	// the above line compares the content of field value in this (current) object to the // content in the value field of otherARef and returns // whatever boolean value the comparison expression evaluates to.} else {
	return false;
}
This is how we will have to override and provide custom implementation of equals method when we want the contents in our custom classes to be compared on equals invocation.


'
package q11280;
public class EqualsExample {
	public static void main(String[] args) {
		A a1 = new A(4);
		A a2 = new A(5);
		A a3 = new A(4);
		System.out.println("a1.equals(a2) : " + a1.equals(a2));
		System.out.println("a1.equals(a3) : " + a1.equals(a3));
		B b1 = new B(4);
		B b2 = new B(5);
		B b3 = new B(4);
		System.out.println("b1.equals(b2) : " + b1.equals(b2));
		System.out.println("b1.equals(b3) : " + b1.equals(b3));
	}
}
class A {
	private int value;
	public A(int value) {
		this.value = value;
	}
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject instanceof A) {
			A otherARef = (A) otherObject;
			return (this.value == otherARef.value);
		} else {
			return false;
		}
	}
}
class B {
	private int value;
	public B(int value) {
		this.value = value;
	}
}
