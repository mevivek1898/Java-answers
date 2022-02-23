The numbering system which uses base-2 is called Binary System. In Binary System (base-2) a total of 2 digits (0 and 1) are used to represent a number of any size (magnitude).

For example, Zero is represented as 0, where
0 = (0 * 20) = (0 * 1)

Lets try representing One (1):
1 = (1 * 20) = (1 * 1)

Lets try representing Two (2), since 0 or 1 are the only digits we can use to represent 2, let us divide 2 by 2 and write down [quotient][reminder], i.e.: [1][0]
2 = (1 * 21) + (0 * 20) = (2) + (0)

Lets try representing Three (3), since 0 or 1 are the only digits we can use to represent 3, let us divide 3 by 2 and write down [quotient][reminder], i.e.: [1][1]
3 = (1 * 21) + (1 * 20) = (2) + (1)

Lets try representing Four (4), since only 0 and 1 can be used, let us divide 4 by 2 and write down [quotient][reminder], i.e.: [2][0], by repeating the above logic for 2 (whose value we already know as [1][0]) we get [1][0][0]
4 = (1 * 22) + (0 * 21) + (0 * 20)
4 =      (4)     +     (0)      +     (0)

Lets try representing Fourteen (14), since only 0 and 1 should be used, let us divide 14 by 2 and write down [quotient][reminder], i.e.: [7][0], by repeating the above logic for 7 (7 = [3][1], and 3 = [1][1]) we finally get [1][1][1][0]
14 = (1 * 23) + (1 * 22) + (1 * 21) + (0 * 20)
14 =       (8)     +     (4)     +     (2)     +     (0)

Lets try representing Hundred and Fourteen (114), let us divide 114 by 2 and write down [quotient][reminder], i.e.: [57][0], by repeating the above logic for 57 (57 = [28][1], 28 = [14][0], 14 = [1][1][1][0]), we finally get [1][1][1][0][0][1][0]
114 = (1 * 26) +(1 * 25) +(1 * 24) +(0 * 23) + (0 * 22) + (1 * 21) + (0 * 20)
114 =     (64)    +    (32)    +    (16)    +    (0)     +      (0)     +     (2)     +      (0)

Click on  to understand Decimal to Binary conversion.

In Java, Binary numerals are prefixed with a leading 0b (or 0B) (digit zero followed by char 'b'). For example, to store an binary value of seven into a variable binarySeven, we write
int binarySeven = 0b111;
Select all the correct statements given below.

Answer 
In Binary System, decimal 10 = binary 1010
In Binary System, decimal 100 = binary 1100100

