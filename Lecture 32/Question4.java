According to Java code conventions, a blank line is recommended to be used between two sections in a class. For example, between two methods.

Below are the rules for using a space ( ):
Between keyword which is followed by parenthesis:
while (condition) {
	...
}
for (..; ...; ...) {
	...
}
Note : There should not be a space between method name and the parenthesis that follows it.

A space should appear after commas. For example:
public int sum(int num1, int num2) {
	...
}
String[] namesArr = {"Aries", "Taurus", "Gemini", "Cancer"}; 
A space should be used between all binary operators and their operands except dot (.). Unary operators (-, -- and ++) must never be separated from their operands by a space. For example:
int total = num1 + num2;
for (int i = 0; i < namesArr.length; i++) {
	...
}
A space should be used between expressions of a for statement. For example:
for (int i = 0; i < namesArr.length; i++) {
	...
}
Select all the correct statements that follow the above rules in the below code:
public boolean isPrimeNumber (int number) { //statement 1
	for(int i=2; i<=(number/2); i++) {//statement 2
		if ((number%i)==0) { //statement 3
			return false;
		}
	}
	return true;
}


Answer

In statement 1, there should not be a space between the method name and the opening parenthesis. isPrimeNumber (
In statement 2, there should be a space between for and the opening parenthesis that follows it.
In statement 2, there should be a space on either side of = (assignment operator) in the initialization expression int i=2;.
In statement 2, there should be a space on either side of / and <= operators in the condition expression i<=(number/2);.
In statement 2, there should be a space after the semicolon ; of the condition expression i<=(number/2);.
In statement 3, there should be a space on either side of % and == operators in the if's condition expression (number%i)==0.

