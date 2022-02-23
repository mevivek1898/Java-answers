Access modifiers are special keywords which can be associated to members like fields, methods, classes. These access modifiers define the degree of access control to those members.

The four different access control modifiers are:
private - marks the member as accessible only in the declaring class
package/default - marks the member as accessible to classes in the same package
protected - marks the members accessible in subclasses of the class and to classes in the same package
public - marks the members as accessible to all classes
Note: When none of the access modifier keywords like public, private or protected are used, the default or package access restrictions apply.

Select all the correct statements for the below code:
class A {
	private int x;
	public int y;
	public void sayHello() {
		System.out.println("Hello");
	}
	private void sayBye() {
		System.out.println("Hello");
	}
}
class B {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x); // Statement 1
		System.out.println(a1.y); // Statement 2
		System.out.println(a1.sayHello());  // Statement 3
		System.out.println(a1.sayBye()); // Statement 4
	}
}



Answer 

Statement 3 will not produce a compilation error.


