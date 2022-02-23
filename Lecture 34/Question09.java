Write a Java program to illustrate the usage of super keyword.

Create a class called Animal with the below members:
a constructor which prints Animal is created
a method called eat() which will print Eating something and returns nothing.
Create another class called Dog which is derived from the class Animal, and has the below members:
a constructor which calls super() and then prints Dog is created
a method eat() which will print Eating bread and returns nothing
a method bark() which will print Barking and returns nothing
a method work() which will call eat() of the superclass first and then the eat() method in the current class, followed by the bark() method in the current class.
Write a class ExampleOnSuper with the main() method, create an object to Dog which calls the method work().


package q11273;
class Animal {
	public Animal() {
		System.out.println("Animal is created");
		
	}
	void eat() {
		System.out.println("Eating something");
		
	}  
}  
class Dog extends Animal { 
	public Dog() {
		System.out.println("Dog is created");
		
		
	}
	void eat() {
		System.out.println("Eating bread");
		
	}
	void bark() {
		System.out.println("Barking");
		
	}  
	void work() {  
		super.eat();
		eat();
		bark();
		
	}  
}  
public class ExampleOnSuper { 
	public static void main(String args[]) {
		Dog d = new Dog();  
		d.work();  
	}
}