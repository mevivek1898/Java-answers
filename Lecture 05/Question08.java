The numbering system which uses base-16 is called Hexadecimal System or simply Hex. A base (also called radix) is the number of unique digits or symbols (including 0) used to represent a given number. In Hexadecimal System (base-16) a total of 16 symbols are used.
Digits 0(zero) to 9(Nine) are used to represent values from 0 to 9 respectively and alphabets A, B, C, D, E and F (or a, b, c, d, e and f) are used to represent values from 10 to 15 respectively.
In Java and many other programming languages 0x is used as a prefix to denote a hexadecimal representation.
For example, in hexadecimal the value of Zero is represented as 0x0, where
0 = (0 * 160) = (0 * 1)
Similarly 1, 2 ...up to 9:
1 = (1 * 160) = (1 * 1)
2 = (2 * 160) = (2 * 1)
...
9 = (9 * 160) = (9 * 1)
10 = A = (10 * 160) = (10 * 1)
15 = F = (15 * 160) = (15 * 1)
Now, lets try representing Twenty One (21), remember we can use 0 to 9 and the alphabets A to F to represent 21, let us divide 21 by 16 and write down [quotient][reminder], i.e.: [1][5]
21 = 0x15 = (1 * 161) + (5 * 160) = (16) + (5)
Similarly, lets try representing One Hundred and Sixty (160), let us divide 160 by 16 and write down [quotient][reminder], i.e.: [10][0], [A][0] (since 10 is represented by A)
160 = 0xA0 = (10 * 161 + (0 * 160) = (160) + (0)

Similarly, lets try representing Three Thousand Four Hundred and Sixty (3460). Let us divide 3460 by 16 and write down [quotient][reminder], i.e.: [216][4], (216 divided by 16 is [13][8], which is represented as [D][8]). So 3460 is represented as 0xD84
3460 = 0xD84 = (13 * 162) + (8 * 161) + (4 * 160) = (13 * 256) + (8 * 16) + (4 * 1) = (3328) + (128) + (4)

Click on  to understand Decimal to Hexadecimal conversion.

In Java, both uppercase and lowercase letters can be used when representing Hex values. For example:
int hexHunderedAndSixty = 0xA0; // or 0Xa0, however 0xA0 is preferred
Select all the correct statements given below.


Answer 

Decimal 100 is equal to 0x64 in Hex
Hex value of 0xCAFE is equal to Decimal 51966
0x0001 in Hex is equal to 0X1 in Hex and is equal to 1 in Decimal