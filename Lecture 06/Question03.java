In Java, the int data type denotes a 32-bit signed (two's-complement) integer, which can hold any value between - 2,147,483,648 (-231) and 2,147,483,647 (231-1).

The primitive type int has a corresponding wrapper class called Integer. Both int and Integer can be used interchangeably. Which means, we can say:
int num1 = 3;
Integer num2 = 4;
Integer total = num1 + num2;
int valueOfNum2 = total - num1;
The fixed values 3, 4 assigned to num1 and num2 respectively are called integer literals.
The default value of a primitive int is 0, when not initialized. However, the default value of a reference of type Integer is null, when not initialized.
In Java 8 and later, int can also represent unsigned 32-bit integers, with a min value of 0 and a max value of 232-1. To use unsigned integers, use Integer class.
We will learn more about the wrapper class Integer later.

Select all the correct statements given below.

Answer 

An int literal value can be a negative or a positive number with the range of -231 and 231-1.