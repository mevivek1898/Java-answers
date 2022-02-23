Encapsulation is a feature in object-oriented languages, like Java where we can selectively hide the data and members, so that they are not accidentally corrupted by code.

For example in the below class:
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setAge(int age) {
		if (age > 0) { 
			this.age = age;	
		} 
		//we can also flag an error when invalid age is passed
	}
}
String name and int age are declared with private access modifier.

private modifier indicates that those members are accessible only by code of that class. They are not visible to other classes.

For example, in the below code on line 36 Test class is accessing the private field name of Person class.

The compiler will give an error saying that the field name field in Person is not visible to Test.

Click on the Submit button to see the error.

If the fields name and age were marked as public when they are declared in Person, compiler would not flag an error. In such a case the below code when written in the main method of Test class would not give a compilation error.
p1.name = -3;
However, you would notice that even though the value of (-3) is invalid for age, if the field age in Person was marked as public, compiler would allow such code to be written in other classes.

In the below code since the field age was declared as private, if some other class like Test wants to update age on a person object, it is forced to use the public method setAge() and pass an value to that method like : p1.setAge(-3).

By declaring the age field as private and its accessor method as public, the Person class can perform validation checks on the value passed to its setAge() method before assigning it to the age. By this the internal data of Person class is protected from being set to inconsistent or invalid state by code in other classes.

To resolve the compilation error, delete the complete code in line 36 (containing p1.name) which is wrong as it is illegal to access private members of other classes.

package q11121;
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 0) { 
			this.age = age;	
		}
	}
	
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
}

public class Test {	
	public static void main(String[] args) {
		Person p1 = new Person("Albert Einstein", 25);
	//	System.out.println("name of p1 is : " + p1.name); //the line with error
		System.out.println("name of p1 is : " + p1.getName());
	}
}
