Argument list Arrow token Body of lambda expression

Lambda expression as shown above consists of three things argument list followed by arrow token and body of lambda expression.



Various types of Lambda expressions are:

Zero parameter:() -> System.out.println("Zero parameter lambda");
One parameter:–(p) -> System.out.println("One parameter: " + p);
Multiple parameters :(p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);


Note: Lambda expressions are just like functions and they accept parameters just like functions. And It is not mandatory to use parentheses, if the type of that variable can be inferred from the context.



Type code given below in the adjacent editor window to be well versed with the concept of implementing lambda expressions.



Sample Test Cases
Test Case 1:
Expected Output:
100
203
300
405
All·even·elements·displayed
100
300


Answers 



// Implementation of basic lambda expressions to print all and  even elements in the array list
import java.util.ArrayList;
class LambdaExpression{
	public static void main(String args[]){
		// Creating an ArrayList with 100, 203, 300, & 405 as elements
		ArrayList<Integer> ArrList = new ArrayList<Integer>();
		ArrList.add(100);
		ArrList.add(203);
		ArrList.add(300);
		ArrList.add(405);
		// Display elements using lambda expression 
		ArrList.forEach(n -> System.out.println(n));
		// Lambda expression to print even elements
		System.out.println("All even elements displayed");
		ArrList.forEach(n -> { if (n%2 == 0) System.out.println(n); });
		
	}
}
