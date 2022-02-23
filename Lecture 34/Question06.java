Method overloading is a feature which allows multiple methods with same name and different parameters in the same class.

Method overriding is a feature where we specialize (or modify) a method behaviour which is already present in the superclass. This takes places only when we have a class extending another class.

Select all the correct statements from the below code:
class A {
	public void printMe(int number) { // statement 1 
		System.out.println(number);
	}
	public void printMe(boolean flag) { // statement 2 
		System.out.println(flag);
	}
	public void printMe(int number, boolean flag) { // statement 3 
		System.out.println(number + " : " + flag);
	}
}
class B extends A {
	public void printMe(int number) { // statement 4 
		System.out.println("The double of " + number + " is : " + (number * 2));
	}
}

Answer
Statements 1, 2 and 3 in class A contain overloaded versions of method printMe.

The method in statement 4, overrides the method declared in statement 1.
