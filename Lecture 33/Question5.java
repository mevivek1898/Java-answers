Write a Java program to illustrate the multilevel inheritance concept.

Create a class Student
contains the data members id of int data type and name of string type
write a method setData() to initialize the data members
write a method displayData() which will display the given id and name
Create a class Marks which is derived from the class Student
contains the data members javaMarks, cMarks and cppMarks of float data type
write a method setMarks() to initialize the data members
write a method displayMarks() which will display the given data
Create another class Result which is derived from the class Marks
contains the data members total and avg of float data type
write a method compute() to find total and average of the given marks
write a method showResult() which will display the total and avg marks
Write a class MultilevelInheritanceDemo with the main() method which will receive five arguments as id, name, javaMarks, cMarks and cppMarks.

Create object only to the class Result to access the methods.

If the input is given as command line arguments to the main() as "99", "Lakshmi", "55.5", "78.5", "72" then the program should print the output as:
Id : 99
Name : Lakshmi
Java marks : 55.5
C marks : 78.5
Cpp marks : 72.0
Total : 206.0
Avg : 68.666664



package q11264;
public class MultilevelInheritanceDemo {
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		float jM = Float.parseFloat(args[2]);
		float cM = Float.parseFloat(args[3]);
		float cppM = Float.parseFloat(args[4]);
		Result obj = new Result();
		obj.setData(id,args[1]);
		obj.setMarks(jM,cM,cppM);
		obj.displayData();
		obj.displayMarks();
		obj.compute();
		obj.showResult();
	}
}
class Student {
	int id;
	String name;
	public void setData(int id,String name){
		this.id=id;
		this.name = name;
	}
	public void displayData(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

class Marks extends Student{
	
	float javaMarks;
	float cMarks;
	float cppMarks;
	
	public void setMarks(float javaMarks,float cMarks , float cppMarks){
		
		this.javaMarks = javaMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
	}
	public void displayMarks(){
		
		System.out.println("Java marks : "+javaMarks);
		System.out.println("C marks : "+cMarks);
		System.out.println("Cpp marks : "+cppMarks);
	}
}

class Result extends Marks{
	float total,avg;
	public void compute(){
		total = javaMarks + cMarks + cppMarks;
		avg = total/3;
	}
	public void showResult(){
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);
	}
}
