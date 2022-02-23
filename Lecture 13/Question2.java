In Java, an expression always has a type, which is deduced from the types of the variables, methods or literals involved in that expression.

Type conversion is performed to convert one or both the operands to an appropriate data type before evaluation.

Type conversion means converting one data type value into another data type value.

There are two types of type conversions: implicit conversion (also called type coercion) and explicit conversion (also called type casting).

In case of implicit type conversion, compiler automatically converts one data type value into another data type value.

Implicit type conversions can occur during assignment or while using any other operators. During assignment the R-value is converted to the type of L-value.

When values of different data types are used in arithmetic, relational and logical operators, the value of the lower size data type size is converted automatically into the data type of higher size before the evaluation.

For example in the statement float a = 5 + 5.6; integer type value 5 is automatically converted into a float type as 5.0 before the addition is performed.

See and retype the below code.

Note: Please don't change the package name.'


package q10842;
public class ImplicitConversion {
	public static void main(String[] args) {
		int i = 20, intsum;
		char ch = 'a';
		float floatsum;
		intsum = i + ch;
		floatsum = i + ch;
		System.out.println("Integer result = " + intsum + " Float result = " + floatsum);
	}
}