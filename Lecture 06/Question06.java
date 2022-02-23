In Java, the long data type denotes a 64-bit signed (two's-complement) integer, which can hold any value between -9,223,372,036,854,775,808 (-263) and 9,223,372,036,854,775,807 (263-1).

long is used whenever an int data type is not sufficient to represent a number.
The primitive type long has a corresponding wrapper class called Long. Both long and Long can be used interchangeably. Which means, we can say:
long num1 = 22222222223L;
Long num2 = 23L;
Long total = num1 + num2;
long valueOfNum2 = total - num1;
The fixed values 22222222223L, 23L assigned to num1 and num2 respectively are called long literals.
As you can notice, the long literal values are suffixed with char 'L' (lowercase of 'L' can also be used, however the uppercase is more readable)
The default value of a primitive long is 0L, when not initialized. However, the default value of a reference of type Long is null, when not initialized.
In Java 8 and later, long can also represent unsigned 64-bit integers, with a min value of 0 and a max value of 264-1.
To use unsigned long integers, use the Long class.
We will learn more about the wrapper class Long later.

Select all the correct statements given below.

Answer 

A long literal value can be a negative or a positive number within the range of -263 and 263-1.