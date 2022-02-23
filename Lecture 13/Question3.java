A programmer can instruct the compiler to explicitly convert a value of one type to another using a typecast operator.

When a typecast operator is explicitly used, the type conversion process is called explicit type conversion or type casting.

The syntax for using a typecast operator is: (data_type) expression, Where the expression is converted to the target data_type enclosed within the parentheses.

Here the expression may contains constants or variables and the data_type must be a primitive data type or void.

For example, the expression (float)1 / 3 is evaluated as 1.0 / 3 yielding 0.333333, where as 1 / 3 yields 0.

In the expression ((int)num)%2, if num is a float variable with value 5.5, then the expression evaluates to 1.

Below is an example which demonstrates type casting:
public class ExplicitConversion {
	public static void main(String[] args) {
		float x, y;
		x = 7 / 3;
		y = (float) 7 / 3;
		System.out.println("x = " + x + " y = " + y);
	}
}
In the above code, produces the output as x = 2.0 y = 2.3333333.

See and retype the below code.

Note: Please don't change the package name.'



Answer 

package q10843;
public class ExplicitConversion {
	public static void main(String[] args) {
		int i = (int)18.99f;
		System.out.println("int value = " + i);
		float f = i;
		System.out.println("after float widening : " + f);
		int big = 1234567890;
		float approx = big;
		System.out.println("The lose value = " + (big - (int)approx));
	}
}
