In implementation inheritance, when a class B inherits from a class A, the subclass B can modify the implementation present in its superclass A. For example:
class A {	
	public int aValue = 2;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 3;
	public int getBValue() {
		return bValue;
	}
	public int getAValue() {  // this method overrides the implementation in class A
		return 2 * aValue; // returning  double of value stored in aValue
	}
}
Then the below will print 4 and not 2:
B b = new B();
System.out.println(b.getAValue());
Note: In the above code, the method getAValue() in class B is overriding the method with same name present in its superclass A.

Whenever a method is overridden in the subclass, the new method implementation will be called when the method is invoked on the instance of subclass.

See and retype the below code to understand the above concept.

In the below code, you will also notice that even a2.getAValue() produces 4. This is because reference a2 actually points to an instance of class B, which has the overridden method.


package q11269;
public class InheritanceExample {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("a1.getAValue() : " + a1.getAValue());
		B b = new B();
		System.out.println("b.getBValue() : " + b.getBValue());
		System.out.println("b.getAValue() : " + b.getAValue());
		A a2 = b;
		System.out.println("a2.getAValue() : " + a2.getAValue());
	}
}
class A {
	public int aValue = 2;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 3;
	public int getBValue() {
		return bValue;
	}
	public int getAValue() {
		return 2 * aValue;
	}
}