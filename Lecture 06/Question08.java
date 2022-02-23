In Java, the short data type denotes a 16-bit signed (two's-complement) integer, which can hold any value between - 32,768 (-215) and 32,767 (215-1).

The primitive type short has a corresponding wrapper class called Short. Both short and Short can be used interchangeably. Which means, we can say:
short num1 = 3;
Short num2 = 4;
Short total = (short)(num1 + num2);
short valueOfNum2 = (short)(total - num1);
The default value of a primitive short is 0, when not initialized. However, the default value of a reference of type Short is null, when not initialized.
We normally use int instead of short to hold integer values. However, when using large arrays if we know that the values stored will be within the range of a short, using an array of type short may help saving memory.

We will learn more about the wrapper class Short later.

Select all the correct statements given below.

Answer 

A short literal value can be a negative or a positive number with the range of -215 and 215-1.