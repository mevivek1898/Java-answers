In Java, && represents conditional-and operator (also called logical-and) and || represents conditional-or operator (also called logical-or).
Their usage is
(expression1) operator (expression2)
For example, the expression (isWeekend && isRaining) is read in English as "isWeekend and isRaining"

Similarly, the expression (isTasty || isSweet) is read in English as "isTasty or isSweet"

Both conditional-and operator(&&) and conditional-or operator(||) operators evaluate from left to right.

In case of a &&, if the left expression evaluates to false, it will skip evaluating the expression on the right side of the operator.
In case of a ||, if the left expression evaluates to true, it will skip evaluating the expression on the right side of the operator.

The result of the expression involving any of the above mentioned conditional operators is always a boolean value (true or false).

According to Java coding conventions, a single space should be provided to the left and right of the operator.

Select all valid statements for the below code:
int x = 3;
int y = 4;
int z = 3;
if (x > y && y > z) {
	System.out.println("x > y && y > z is true");
} else {
	System.out.println("x > y && y > z is false");
}

if (z == x && y > z) {
	System.out.println("z == x && y > z is true");
} else {
	System.out.println("z == x && y > z is false");
}

if (x == y || x > z) {
	System.out.println("x == y || x > z is true");
} else {
	System.out.println("x == y || x > z is false");
}



Answer 

z == x && y > z is true is printed

x == y || x > z is false is printed