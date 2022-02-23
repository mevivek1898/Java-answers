In Java, below are the Bitwise and Bit Shift operators:
Operator	Description
~	is the unary bitwise complement operator. It flips the bits represented by a number.
Its usage is ~operand, the operand should be of primitive integral type.
For example if a binary number 110 is flipped we get 001
&	is the bitwise AND operator.
Its usage is operand1 & operand2, where operand1 and operand2 should be of primitive integral type.
It sets a bit to 1 if and only if both of the corresponding bits in its operands are 1, and to 0 if the bits differ or both are 0. E.g. 1010 & 1100 will result in 1000.
|	is the bitwise OR operator.
Its usage is operand1 | operand2, where operand1 and operand2 should be of primitive integral type.
It sets a bit to 1 if one or both of the corresponding bits in its operands are 1, and to 0 if both of the corresponding bits are 0. E.g. 1010 | 1100 will result in 1110.
^	is the bitwise XOR or exclusive OR operator.
Its usage is operand1 ^ operand2, where operand1 and operand2 should be of primitive integral type.
It sets the bit to 1 where the corresponding bits in its operands are different, and to 0 if they are the same. E.g. 1010 ^ 1100 will result in 0110.
<<	is the binary left shift operator.
Its usage is operand1 << operand2, where operand1 should be of primitive integral type and operand2 should be a number which indicates the number of bits that should be shifted left in operand1.

The value of number << bitsToBeShifted is number left-shifted by bitsToBeShifted bit positions. This is equal to multiplication by 2bitsToBeShifted.
E.g. Decimal 3 in binary is 11. Hence, 11 << 1 will result in 110, i.e, 3 << 1 results in 6
11 << 2 will result in 1100, i.e, 3 << 2 results in 12

Note: If the number's value after the operation results in overflow (i.e becomes greater than the MAX_VALUE of number's type), then positive numbers become negative and negative numbers become zero.
>>	is the binary right shift operator.
Its usage is operand1 >> operand2, where operand1 should be of primitive integral type and operand2 should be a number which indicates the number of bits that should be shifted right in operand1.

The value of number >> bitsToBeShifted is number right-shifted by bitsToBeShifted bit positions while preserving the sign. The resulting value is equal to the rounded up value of number / 2bitsToBeShifted. For non-negative values of number, this is equivalent to truncating integer division, as computed by the integer division operator /, i.e. number / 2bitsToBeShifted.

E.g. 110 >> 1 will result in 11, i.e, 6 >> 1 results in 3
1111 >> 2 will result in 11, i.e, 15 >> 2 results in 3
-15 >> 2 results in -4
>>>	is the unsigned binary right shift operator.
Its usage is operand1 >>> operand2, where operand1 should be of primitive integral type and operand2 should be a number which indicates the number of bits that should be shifted right in operand1.

For all positive numbers it is the same as >> operator. For negative numbers the leftmost bit used for sign is filled with 0, thereby changing the value and sign.


According to Java coding conventions, a single space should be provided to the left and right of any of the above operators.

Note: When any of the above operators is used in an expression, if operand1 is of type byte, short or char then the operation is carried out by automatically widening the operand to int. Otherwise, the numeric operand is used as it is in the operation

Select all the correct statements from the below code.
String x = "Ganga" << 3; // statement - 1

int y = 234 << 1.5f; // statement - 2

int z = 22 << 1; // statement - 3

int k = 22 >> 1; // statement - 4



Answer 
Value of k = 11
Value of z = 44

