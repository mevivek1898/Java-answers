Complete the code in LambdaExpression.java file to print all odd elements in the array list using concept of lambda expression

Sample Test Cases
Test Case 1:
Expected Output:
120
303
308
555
All·odd·elements·displayed
303
555



Answer

// Complete below given code as per the problem statement
import java.util.ArrayList;
class LambdaExpression{
	public static void main(String args[]){
		ArrayList<Integer> ArrList = new ArrayList<Integer>();
		ArrList.add(120);
		ArrList.add(303);
		ArrList.add(308);
		ArrList.add(555);
		//Complete the code for displaying elements using lambda expression
		ArrList.forEach(n -> System.out.println(n));
		
		System.out.println("All odd elements displayed");
		  ArrList.forEach(n-> { if (n%2 != 0) System.out.println(n); });  
		  
		  // Complete the Lambda
		
	}
}
