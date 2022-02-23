In an expression when two or more operators are used there are certain rules followed to evaluate the expression. For example:
int result1 = 3 + 4 * 3; // evaluates to 15 and not 21
The below table shows the precedence applied to the operators during their evaluation.
Precedence	Operators
expr++ expr--	postfix
++expr --expr +expr -expr ~ !	unary
* / %	multiplicative
+ -	additive
<< >> >>>	shift
< > <= >= instanceof	relational
== !=	equality
&	bitwise AND
^	bitwise exclusive OR
|	bitwise inclusive OR
&&	logical AND
||	logical OR
? :	ternary
= += -= *= /= %= &= ^= |= <<= >>= >>>=	assignment

If two or more operators of equal precedence are used, the expression evaluation happens from left to right.

In case a part of expression is enclosed in parenthesis (), the expression in the parenthesis takes higher precedence over all other operators.

If there are nested parentheses, then the precedence is from the inner-most to outer-most parenthesis.

Note: Whenever we mix two or more different operators it is important to nest them in parenthesis to make the expression more readable.
For example:
x + y * z
can be written as
x + (y * z)


Select all the correct statements for the below code.
int x = 4, y = 5, z = 2, k = 5;

int value1 = x + y * z;

int value2 = x + y - z + k;

int value3 = ++z + ++k;

int value4 = x-- * y--;


Answer 



value2 = 12
