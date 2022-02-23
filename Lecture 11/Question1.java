In Java, we have 5 Unary operators:
Operator	Description
+	Unary Plus, used for indicating a positive value
-	Unary Minus, subtracts from zero.
++	Increment operator. Increments the value by one.
--	Decrement operator. Decrements the value by one.
!	Negation operator. Negates a boolean value.

The usage is
operator operand

According to Java coding conventions, no space should be provided between a unary operator and operand.

Note: When Increment or Decrement operator is applied before an operand (e.g. ++i or --i), the value of the operand is changed first and the changed value is substituted in the expression.
When Increment or Decrement operator is applied after an operand (e.g. i++ or i--), the original value of the operand is substituted in the expression first and the value is changed later.

Select all the correct statements for the below code:
int x = 10;
int y = -x;
int z = x++;
int k = ++x;


Answer 


Value of y is -10
Value of k is 12