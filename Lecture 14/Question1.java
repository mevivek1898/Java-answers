The statements inside a Java program are generally executed from top to bottom, in the order they appear. Control flow statements break up the flow of execution by employing decision making, looping, and branching, enabling the program to conditionally execute particular blocks of code.

The if-then statement tells a program to execute a certain section of code only if a particular test evaluates to true. if (Expression) {Statement}.

int SENIOR_CITIZEN_AGE = 60;
if (age > SENIOR_CITIZEN_AGE) {
    System.out.println("Person is a senior citizen");
}
The if-then-else statement provides a secondary path of execution when an if clause evaluates to false. if (Expression) {Statement} else {Statement}.

int SENIOR_CITIZEN_AGE = 60;
if (age > SENIOR_CITIZEN_AGE) {
    System.out.println("Person is a senior citizen");
} else {
    System.out.println("Person is not a senior citizen.");
}
Click on  to understand the working of if-else.

In the program given below, the class VotingTest has a method, canVote(int age). It receives an integer argument age. Write code inside canVote(...) method using if-then-else statement to print Can Vote, if the provided age is greater than or equal to 18 and print Cannot Vote otherwise.

Note: Make sure to use prinltn(...) and not print(...).

Note: Please don't change the package name.

package q10846;
public class VotingTest {
	int age = 18;
	public void canVote(int age) {
		//Write the code with if-else statement here to produce the correct output
		if(age>=18){
			System.out.println("Can Vote");
		}else{
			System.out.println("Cannot Vote");
		}
	}
}