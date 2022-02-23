Write the code in the below main() method to calculate and print the Total and Average marks scored by a student from the input given through the command line arguments.

Assume that four command line arguments name, marks1, marks2, marks3 will be passed to the main() method in the below class with name TotalAndAvgMarks.

Sample Input and Output:
For example, if the command line arguments to the main() method are : Narmada 75.50 67.75 78.25.
The program should print the result as:
	Name = Narmada
	Marks1 = 75.5
	Marks2 = 67.75
	Marks3 = 78.25
	Total Marks = 221.5
	Average Marks = 73.833336
Note: Consider the three marks passed in the command line arguments as floats.

Note: Please don't change the package name



Answer 

package q10817;

public class TotalAndAvgMarks {
	
	public static void main(String[] args) {
		
		String name = args[0];
		
		float m1 =Float.parseFloat(args[1]);
		
		float m2 = Float.parseFloat(args[2]);
		
		float m3 =Float.parseFloat(args[3]);
		
		float total =m1+m2+m3;
		
		float avg = total/3;
		
		System.out.println("Name = " + name);
		
		System.out.println("Marks1 = "  + m1 );
		
		System.out.println("Marks2 = "  + m2);
		
		System.out.println("Marks3 = " + m3 );
		
		System.out.println("Total Marks = " + total);
		
		System.out.println("Average Marks = " +avg );
		
		
		
		
		

	
	}
}