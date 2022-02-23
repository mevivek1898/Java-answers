Inheritance is a way by which a class can inherit what is already there in another existing class.

We can classify inheritance into two kinds:
Implementation Inheritance (or code inheritance)
Interface Inheritance (or inheritance of behaviour or contract)
Here we will understand implementation inheritance and later learn about interface inheritance after we learn interfaces.

In Java, a class can inherit implementation from only one class, it is also referred as single-inheritance. (Other languages like c++ support multiple inheritance of implementation)

In Java, we use extends keyword when we want a class to inherit (extend) from another class. For example:
class A {	
	...
}
class B extends A {
	...
}
In the above code B extends A. B is called the subclass of A. A is called the super class of B.

Note: Every class in Java automatically extends the root class Object if it does not explicitly extends another class. Which means in our above example, class A is a subclass of Object and Object is the superclass of A.

Using the above concepts select all the correct statements from the below code:
class W { // statement 1
}
class X { // statement 2
	...
}
class Y extends X { // statement 3
	...
}
class Z1 extends W, Y { // statement 4
	...
}
class Z2 extends Y { // statement 5
	...
}



Answer 

As per statement 5, Z2 is the subclass of Y, X and Object.

