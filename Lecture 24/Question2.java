In a class if the name of the constructor is different from the name of the class, Java treats it as a different method.

Press Submit to see compilation error and then correct the error.

[Hint: Java is case sensitive, meaning change in the case of characters will make it a different name.]


package q11143;
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
}

