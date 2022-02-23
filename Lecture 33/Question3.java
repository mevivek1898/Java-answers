In implementation inheritance, when the subclass inherits from a superclass (also callled base class), the subclass instance can be referred by the base class reference. For example:
class A {	
	public int aValue = 1;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 2;
	public int getBValue() {
		return bValue;
	}
}
Then the below statement is valid:
A a = new B();
Note: In the above code, we can access all members of class A via the reference a even though the actual object created in memory using the new keyword is an instance of class B.

According to the above code, the statementa.getBValue() will result in compilation error. This is because reference a which is of type class A does not know about the members declared in its subclass B.

See and retype the below code to understand the above concept.


package q11262;
public class InheritanceExample {
	public static void main(String[] args) {
		A a = new B();
		System.out.println("a.getAValue() : " + a.getAValue());
	}
}
class A {
	public int aValue = 1;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 2;
	public int getBValue() {
		return bValue;
	}
}