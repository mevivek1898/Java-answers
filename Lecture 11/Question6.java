There is yet another conditional operator called the ternary operator ?:. Its usage is
condition ? expression1 : expression2
The condition should always evaluate to a boolean. If the condition evaluates to true, expression1 is evaluated and its value returned, else expression2 is evaluated and its value returned. For example,
int javaCertificationMarks = 75;
int passMarks = 65;
String result = (javaCertificationMarks > passMarks) ? "Passed Java Certification" : "Failed Java Certification"; 

In the above code, since the condition javaCertificationMarks > passMarks evaluates to true, result is assigned the value "Passed Java Certification"

See and retype the below code to understand how ternary operator is used.

Note: Please don't change the package name.'


package q10834;
public class TernaryOperatorsDemo {
	public static void main(String[] args) {
		int javaCertificationMarks = 75;
		int passMarks = 65;
		String result = (javaCertificationMarks > passMarks) ? "Passed Java Certification" : "Failed Java Certification";
		System.out.println("result : " + result);
	}
}