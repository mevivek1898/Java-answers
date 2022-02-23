The state information of an instance of Student class is stored in its instance fields.

These fields are usually marked as private.

These fields are initialized using the constructor. Hence, after the values are initialized, getXXX and setXXX methods are written to retrieve and modify their values.

A setXXX method is called a setter method. For a field named age, the setter method would be written as:
public void setAge(int age) {
 	this.age = age;
}
A getXXX method is called a getter method. For a field named age, the getter method would be written as:
public int getAge() {
 	return age;
}
These getter and setter methods are also called as accessor methods.

Note how the getter and setter method names follow camel-case naming convention.

See and retype the below code.

package q11132;
public class Student {
	private String id;
	private String name;
	private int age;
	private char gender;
	
	public Student(String id, String name, int age, char gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", age = " + age + ", gender = " + gender + "]";
	}
}