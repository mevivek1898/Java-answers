In Java, the double data type denotes a 64-bit double-precision 64-bit IEEE 754 floating point number. In Java, a double is more commonly used than a float in calculations like sine, cos, tan etc... Like in float a double can represent
 both positive and negative numbers
 positive infinity (Double.POSITIVE_INFINITY) and negative infinity (Double.NEGATIVE_INFINITY)
 NaN (a special Not-a-Number value, i.e. mathematically undefinable number).
A NaN value is used to represent the result of invalid operations such as dividing zero by zero, or square root of a negative number. Its value is represented by a constant in Float class (Double.NaN) etc.
The 64 bits of a double are divided into three parts.
   - 1 Sign bit is used to mark the sign of the number.
   - 11 bits are used to determine the value of the exponent.
   - remaining 52 bits are used to determine the mantissa (significand).
For more info Double Precision Floating Point Numbers


The primitive type double has a corresponding wrapper class called Double. Both double and Double can be used interchangeably. Which means, we can say:
double num1 = 3.4d;
Double num2 = 1.2d;
Double total = num1 + num2;
double valueOfNum2 = total - num1;
The fixed values 3.4d, 1.2d assigned to num1 and num2 respectively are called double literals. These are suffixed with d to indicate that they are double precision floating point values.
The default value of a primitive double is 0.0d, when not initialized. However, the default value of a reference of type Double is null, when not initialized.
We will learn more about the wrapper class Double later.

Select all the correct statements given below.



Answer 

A double uses 8 bytes of memory