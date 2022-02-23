In Java, the float data type denotes a 32-bit single-precision 32-bit IEEE 754 floating point number. In Java, a float can represent
 both positive and negative numbers
 positive infinity (Float.POSITIVE_INFINITY) and negative infinity (Float.NEGATIVE_INFINITY)
 NaN (a special Not-a-Number value, i.e. mathematically undefinable number).
A NaN value is used to represent the result of invalid operations such as dividing zero by zero, or square root of a negative number. Its value is represented by a constant in Float class (Float.NaN) etc.
The 32 bits of a float are divided into three parts.
[S]   [E][E][E][E][E][E][E][E]   [M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M][M]
      - The [S] bit is used to mark the sign of the number.
      - The 8 bits (marked [E]) determines the value of the exponent.
      - The remaining 23 bits (marked [M]) determines the mantissa (significand).

value = mantissa X baseexponent   (our base is 2)
value = M X 2E

For more info Floating Point Numbers


The primitive type float has a corresponding wrapper class called Float. Both float and Float can be used interchangeably. Which means, we can say:
float num1 = 3.0f;
Float num2 = 4.2f;
Float total = num1 + num2;
float valueOfNum2 = total - num1;
The fixed values 3.0f, 4.2f assigned to num1 and num2 respectively are called float literals. These are suffixed with f to indicate that they are floating point values.
The default value of a primitive float is 0.0f, when not initialized. However, the default value of a reference of type Float is null, when not initialized.
We will learn more about the wrapper class Float later.

A float can be used to represent fractional values where precision is not very important after a certain point. For example, when we consider opacity, say 0.51, it does not matter what follows after .51 since for all practical purposes we cannot make out its difference on the screen.

Select all the correct statements given below.

Answer 

A float uses 4 bytes of memory