In Java, there is a keyword instanceof, which is used to verify if an object is an instance of a particular class.
Its usage is
reference instanceof ClassName
For example, the expression (args instanceof String[]) evaluates to true.

The result of an expression using instanceof is always a boolean value (true or false).

According to Java coding conventions, a single space should be provided to the left and right of this operator.

Select all the valid statements in the below code:
String name1 = "Ganga";
String name2 = "Amazon";

boolean statement1 = name1 instanceof String;

boolean statement2 = name2 instanceof name1;

boolean statement3 = name1 instanceof Object;

boolean statement4 = args instanceof Object;

boolean statement5 = args instanceof String[]



Answer 

statement1 evaluates to true
statement2 will not compile.
statement5 evaluates to true