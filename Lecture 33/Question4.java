Write a Java program to illustrate the single inheritance concept.

Create a class Marks
contains the data members id of int data type, javaMarks, cMarks and cppMarks of float data type
write a method setMarks() to initialize the data members
write a method displayMarks() which will display the given data
Create another class Result which is derived from the class Marks
contains the data members total and avg of float data type
write a method compute() to find total and average of the given marks
write a method showResult() which will display the total and avg marks
Write a class SingleInheritanceDemo with main() method it receives four arguments as id, javaMarks, cMarks and cppMarks.

Create object only to the class Result to access the methods.

If the input is given as command line arguments to the main() as "101", "45.50", "67.75", "72.25" then the program should print the output as:
Id : 101
Java marks : 45.5
C marks : 67.75
Cpp marks : 72.25
Total : 185.5
Avg : 61.833332


package q11263;

public class SingleInheritanceDemo {
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		float jM = Float.parseFloat(args[1]);
		float cM = Float.parseFloat(args[2]);
		float cppM = Float.parseFloat(args[3]);
		Result obj = new Result();
		obj.setMarks(id,jM,cM,cppM);
		obj.displayMarks();
		obj.compute();
		obj.showResult();
	}
}

class Marks{
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	
	public void setMarks(int id,float javaMarks,float cMarks , float cppMarks){
		this.id = id;
		this.javaMarks = javaMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
	}
	public void displayMarks(){
		System.out.println("Id : "+id);
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

