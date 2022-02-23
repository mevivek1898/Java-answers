Write a Java program that implements runtime polymorphism.

Create a class Animal with one method whoAmI() which will print I am a generic animal.

Create another class Dog which extends Animal, which will print I am a dog.

Create another class Cow which extends Animal, which will print I am a cow.

Create another class Snake which extends Animal, which will print I am a snake.

Write a class RuntimePolymorphismDemo with the main() method, create objects to all the classes Animal, Dog, Cow, Snake and call whoAmI() with each object.



package q11277;
public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Animal ref1 = new Animal();
		Animal ref2 = new Dog();
		Animal ref3 = new Cow();
		Animal ref4 = new Snake();
		ref1.WhoAmI();
		ref2.WhoAmI();
		ref3.WhoAmI();
		ref4.WhoAmI();
	}
}

// Write all the classes with methods
class Animal{
	public void WhoAmI(){
		System.out.println("I am a generic animal");
	}
}
class Dog extends Animal{
	public void WhoAmI(){
		System.out.println("I am a dog");
	}
}
class Cow extends Animal{
	public void WhoAmI(){
		System.out.println("I am a cow");
	}
}
class Snake extends Animal{
	public void WhoAmI(){
		System.out.println("I am a snake");
	}
	
}