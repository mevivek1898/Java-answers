In Java, + operator is also used to concatenate strings. For example:
Expression	Result
"Ganga" + "River"	"GangaRiver"
"Ganga" + (2 + 3)	"Ganga5"
"Ganga" + 2 + 3	"Ganga23"
2 + 3 + "Ganga"	"5Ganga"
2.3f + "Ganga"	"2.3Ganga"
"Ganga" + 'R' + 3 + true	"GangaR3true"

Below are the rules involved in String concatenation:
The + operator is syntactically left-associative, when used in string concatenation or numeric addition
If one operand in the concatenation expression is of type String, the other operand is also converted to String.
The result of a String concatenation expression is a reference to a String object containing characters in the left-side operand followed by the characters in the right-side operand.

According to Java coding conventions, a single space should be provided to the left and right of the + operator.

Select all the correct statements from the below code.
int x = 3;
int y = 4;
String text1 = "Ganga";
String text2 = "River";
Date today = null;

String text3 = text1 + text2;

String text4 = text1 + x + text2 + y;

String text5 = x + y + text2;

String text6 = text1 + (text2 + (x + y));

String text7 = text1 + '-' + today;


Answer 



Value of text3 = "GangaRiver"
