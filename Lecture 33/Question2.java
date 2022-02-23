In implementation inheritance the subclass inherits the implementation facilitating code reuse. For example:
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
In the above code, class B also contains the inherited feild aValue and the inherited method getAValue().

See and retype the below code. When you click submit, in the output you will notice that we are able to invoke the inherited method getAValue() (which is implemented in class A) on an instance of class B.


package q11261;
public class InheritanceExample {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("Invoking method getAValue() of class A on instance of class B : " + b.getAValue());
		System.out.println("Invoking method getBValue() on instance of b : " + b.getBValue());
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