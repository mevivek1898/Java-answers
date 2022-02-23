In Java, = is the assignment operator. It is the most common and important operator in any programming language.
It is used to assign a value to a variable. Its usage is
LHS = RHS;
LHS (left-hand side to the = operator) can be a field (variable), expression or an array access. RHS (right-hand side) can be a value, variable or an expression.
For example
int x = 10;  				// variable x is assigned value 10
String[] namesArr = new String[10];	// an empty String array of size 10 is assigned to reference namesArr 
namesArr[0] = "Ganga";			// namesArr's 0th index is assigned a value "Ganga"
car.speed = getCurrentSpeed();		// the field speed in car reference is assigned a value returned by the method getCurrentSpeed()

Assignment operator verifies the compatibility of types of LHS and RHS.
Automatic type widening is performed when possible, else a compilation error is reported.

According to Java coding conventions, a single space should be provided to the left and right of the assignment operator.

Select all valid assignment statements.



Answer 

String text = null;
int myHeight = Integer.MAX_VALUE;
int x = 3, y = 5, z = 5;