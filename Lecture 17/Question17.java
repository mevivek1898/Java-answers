A break targetLabelName; statement is called a break target statement.

It is used to transfer control out of the enclosing switch, for, while and do-while statements to the next statement below the statement labelled targetLabelName.

A break target need not always be a switch, while, do-while, or for statement, it could also be a simple block of statements enclosed in opening and closing braces { }, as shown in below example:
for (int i = 1; i < 10; i++) {
	System.out.println("Step : 1");
	SkipMe : {
		if (i % 5 == 0) {
			break SkipMe; // breaks to the SkipMe :  label 
		}
		System.out.println(i);
	}
	System.out.println("Step : 2");
}
The SkipMe : is called a label. A label is used to name a block of code, so that it can be targeted using a break and continue statements. Generally labels are used to name loop statements in nested loops, so that one can directly transfer control out of the labelled loop block. For example:

OuterLoop : 
		while (condition1) {
			//do something...
			/do something...
			
			InnerLoop : 
					while (condition2) {
						//do something...
						//do something...
						if (condition3) {
							break OuterLoop;
						}
					}
		}
In the below program with class BreakTargetDemo, write the appropriate conditions inside the for loop labeled InnerLoop such that:
 when the value of i is a multiple of 11 (meaning i divided by 11 will leave a reminder 0), it should call break OuterLoop;
 when the value of j is a multiple of 5 (meaning j divided by 5 will leave a reminder 0), it should call break InnerLoop;.

 package q10898;
public class BreakTargetDemo {
	public static void main(String[] args) {
		OuterLoop:
			for (int i = 20; i < 25; i++) {
				System.out.println("i = " + i);
				InnerLoop :
					for (int j = 1; j < 10; j++) {
						
						// Write code to break OuterLoop, when i is a multiple of 11
						
				
							
							
							
							if(i%11 ==0){
								
								break OuterLoop;
								
							}
							
							if(j%5==0){
								
								break InnerLoop;
								
							}
							
					
						
						
						
						// Write code to break InnerLoop, when j is a multiple of 5
						
						
						
						
						System.out.println("j = " + j);
					}
			}
	}
}