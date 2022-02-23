The throw keyword is used to write the throw statement which causes the exception to be thrown.

The syntax for the throw statement is as below:
throwaThrowableInstance;
For example:
throw new Exception("The world is about to end!");
As you can notice the throw clause should be followed by an instance of Throwable or one of its subclasses.

We can also throw custom exceptions, about which we will learn later.

The throws keyword is used in the method or constructor declaration. It is used to inform (or list) all the checked exceptions which the method or constructor body can throw during execution.

Note that the throws clause in the method or constructor declaration need not list the unchecked exceptions that are thrown by the code in the method or constructor body. The syntax for the throws is as given below:
methodModifiersListreturnType methodName(parameterList) throwsExceptionClassName1, ExceptionClassName2, ... {
}
For example:
public void setAge(int age) throwsInvalidAgeException {
	if (age < 0 || age > 999) { //assuming super-humans can live 999 yearsthrow new InvalidAgeException("Invalid age. Valid range for age is between 0 and 999.");
	}
	this.age = age;
}
The throw clause can throw only a single exception at a time.

However, the throws clause can specify multiple exceptions the method or constructor throws.

Note that a method or a constructor which does not want to handle a checked exception can let it go out of it, by including that exception class name in its throws declaration.

For example, in the below code the Student(String name, int age) constructor does not handle the InvalidAgeException which is thrown by the setAge method using a try-catch block. Instead the constructor included InvalidAgeException in its throws clause.

See and retype the below code.




package q11333;
public class ThrowAndThrowsExample {
	public static void main(String[] args) {
		Student st1 = null;
		Student st2 = null;
		try {
			st1 = new Student("Ganga", 25);
			System.out.println("Successfully created st1.");
			System.out.println("st1 : " + st1);
		} catch (InvalidAgeException e) {
			System.out.println("Could not create st1. Error message is : " + e.getMessage());
		}
		try {
			st2 = new Student("Yamuna", 1003);
			System.out.println("Successfully created st2.");
			System.out.println("st2 : " + st2);
		} catch (InvalidAgeException e) {
			System.out.println("Could not create st2. Error message is : " + e.getMessage());
		}
	}
}
class Student {
	private String name;
	private int age;
	public Student(String name, int age) throws InvalidAgeException {
		this.name = name;
		setAge(age);
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
class InvalidAgeException extends Exception {
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}