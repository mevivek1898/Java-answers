In Java, the byte data type denotes a 8-bit signed (two's-complement) integer, which can hold any value between - 128 (-27) and 127 (27-1).

The primitive type byte has a corresponding wrapper class called Byte. Both byte and Byte can be used interchangeably. Which means, we can say:
byte num1 = 3;
Byte num2 = 4;
Byte total = (byte)(num1 + num2);
byte valueOfNum2 = (byte)(total - num1);
The default value of a primitive byte is 0, when not initialized. However, the default value of a reference of type Byte is null, when not initialized.
We normally use int instead of byte to hold integer values. However (like in the case of short), when using large arrays if we know that the values stored will be within the range of a byte, using a byte array may help saving memory.
A byte data type can also be used to indicate to a programmer that the value it will hold is small. More commonly they are used while manipulating raw data using byte arrays.

We will learn more about the wrapper class Byte later.

Select all the correct statements given below.



Answer 

The max value a byte can be assigned is 0b1111111