See the below code which uses a nested if-then-else statement for calculating grade for a given GPA.

The class GradeCalculator has a method calculateGrade(double gpa). It receives a double argument gpa, a decimal number between 0.0 and 5.0. The method uses a if-then-else statement to display the appropriate Grade for the GPA.

Add another condition that will print Grade: D when the given GPA is between 2.0 and 2.49 (both inclusive).

Do use a the System.out.println() instead of System.out.print().

Note: Please don't change the package name.

package q10848;
public class GradeCalculator {
	public void calculateGrade(double gpa) {
		if (gpa >= 4.5) {
			System.out.println("Grade: A");
		} else if (gpa >= 3.5 && gpa <= 4.49) { 
			System.out.println("Grade: B");
		} else if (gpa >= 2.5 && gpa <= 3.49) { 
			System.out.println("Grade: C");
		}  else if (gpa>=2.0 && gpa<=2.49){
			System.out.println("Grade: D");
		}else {
			System.out.println("Grade: F");
		}
	}
}