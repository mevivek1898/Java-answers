Similar to a break targetLabelName; statement, continue targetLabelName; statement is called a continue target statement.

It is used to transfer control to enclosing for, while or do statements that are tagged by the label targetLabelName.

The targetLabelName can be used to tag only a while, do, or a for statement.

Unlike in break; a continue target cannot be a labeled block that is not associated to one of the above mentioned loops.

As mentioned above the target labels for a continue, are generally used to name loop statements in nested loops.

This allows one to directly transfer control (using continue) to a labelled loop block. For example in the below code:
OuterLoop : 
while (condition1) {
	//do something...//do something...InnerLoop : 
	while (condition2) {
		//do something...//do something...
		if (condition3) {
			continue OuterLoop;
		}
	}//end of inner-while
}//end of outer-whileThe statement continue OuterLoop; will transfer the control directly to the outer-most while which works on condition1.

In the below program under the comment // Fill in the missing code write code for the below two conditions:
 If the value of i is a multiple of 2 continue to the OuterLoop
 If the value of j is a multiple of 3 continue to the InnerLoop
''
package q10900;
public class ContinueTargetDemo {
	public static void main(String[] args) {
		OuterLoop:
			for (int i = 20; i < 25; i++) {
				System.out.println("i = " + i);
				InnerLoop :
					for (int j = 1; j < 10; j++) {
						// Fill in the missing code
						
						//Condition 1
						if(i%2==0) continue OuterLoop;
						if(j%3==0) continue InnerLoop;
						
						//Condition 2
						
						
						
						System.out.println("j = " + j);
					}
			}
	}
}
