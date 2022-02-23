Method overloading means the ability to have multiple methods with same name, which vary in their parameters. For example:
public void concatenate(String text, int num) {
	return text + num;
}
public void concatenate(String text, boolean flag) {
	return text + flag;
}
public void concatenate(String text, char ch) {
	return text + ch;
}
In the above code, concatenate method is overloaded three times.

Note: In the above example, the variation in the parameters list can be by their count or type or both.

Select all the correct statements given below regarding methods present in the String class.

[Hint: You can explore the methods present in the String class by clicking on String and scrolling down until you reach a section heading named Method Summary. In that you will see table containing a list of all methods in the String class.]



Answer
charAt method is not overloaded.
indexOf method is overloaded 4 times.
The String constructor is overloaded 15 times