It is very easy to write a custom exception class. All that we have to do is write a class and extend the Exception class.

Even though Throwable is the super class of all the exception and error classes, we normally extend the Exception class and not Throwable.

The simple rule for naming a custom exception class is as below:
<ErrorCondition>Exception
Some examples for custom exception class names are given below:
InvalidAgeException
InvalidNameException
InvalidEmailException
Note that it is a good practice to always end the name of the exception class with Exception, for easy identification.

Below is an example of a custom exception class:
class InvalidAgeException extendsException {
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}
As you can notice in the above code, all we need to do to write a custom exception class is:
Write a class name which ends with Exception.
Extend the Exception class using the extends clause in the class declaration statement.
And write a constructor which accepts an error message as a Sting.
In the constructor call the constructor in the super class and pass the error message, using super(errorMessage) call.
See and retype the below code.

After executing the below code you will notice that, while Student constructor is called during the creation of st3 (in line no: 21), the call to setAge(age); (in line no: 34) is skipped because the previous statement setName(name); (at line no: 33) will throw a InvalidNameException and the control abruptly is transferred out of the constructor.


package q11336;
public class CustomExceptionExample {
	public static void main(String[] args) {
		Student st1 = null;
		Student st2 = null;
		Student st3 = null;
		try {
			st1 = new Student("Ganga", 25);
			System.out.println("Successfully created st1.");
			System.out.println("st1 : " + st1);
		} catch (InvalidNameException | InvalidAgeException e) {
			System.out.println("Could not create st1. Error message is : " + e.getMessage());
		}
		try {
			st2 = new Student("Yamuna", 1003);
			System.out.println("Successfully created st2.");
			System.out.println("st2 : " + st2);
		} catch (InvalidNameException | InvalidAgeException e) {
			System.out.println("Could not create st2. Error message is : " + e.getMessage());
		}
		try {
			st3 = new Student("Na", 1004);
			System.out.println("Successfully created st3.");
			System.out.println("st3 : " + st3);
		} catch (InvalidNameException | InvalidAgeException e) {
			System.out.println("Could not create st3. Error message is : " + e.getMessage());
		}
	}
}
class Student {
	private String name;
	private int age;
	public Student(String name, int age) throws InvalidNameException, InvalidAgeException {
		setName(name);
		setAge(age);
	}
	public void setName(String name) throws InvalidNameException {
		if (name == null || name.length() < 3 || name.length() > 100) {
			throw new InvalidNameException("Invalid name : " + name + ". Name has to be a non-null value whose length is between 3 and 100 characters.");
		}
		this.name = name;
	}
	public void setAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 999) {
			throw new InvalidAgeException("Invalid age : " + age + ". Valid range for age is between 0 and 999.");
		}
		this.age = age;
	}
	public String toString() {
		return "name = " + name + ", age = " + age;
	}
}
class InvalidNameException extends Exception {
	public InvalidNameException(String errorMessage) {
		super(errorMessage);
	}
}
class InvalidAgeException extends Exception {
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}

