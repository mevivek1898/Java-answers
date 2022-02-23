In Java, the char data type denotes a 16-bit unsigned integer (between 0 and 65535), which represent the Unicode values between '\u0000' and '\uffff' .

The primitive type char has a corresponding wrapper class called Character. Both char and Character can be used interchangeably. Which means, we can say:
char gender1 = 'M';
Character gender2 = gender1;
A character literal must be wrapped in single quotes and it cannot span multiple lines.

The fixed value 'M' assigned to gender1 is called character literal.
The default value of a primitive char is 0, when not initialized. However, the default value of a reference of type Character is null, when not initialized.

Since char is a 16-bit integer type, it can be interchangeably used with int.
We will learn more about the wrapper class Character later.

Select all the correct statements given below.

Answer 

A char literal value can be a number between 0 and 216-1.