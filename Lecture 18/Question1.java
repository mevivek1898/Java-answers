In a programming language the data that has to be processed is loaded in memory and held in variables. When we want to process an integer value, we declare an int variable and assign the value to it.
Suppose we want to write a program that prints the total marks scored by students in a class (say, for a total of 30 students).
One way of doing it is to declare 30 int variables, which is unwieldy when we think of multiple classes or a school.

In such cases, when we want to store multiple values of the same data type, we use an array data structure.
A data structure is a particular way of organizing data in a computer so that data can be accessed and modified efficiently.
An array is a kind of data structure that holds a fixed number of values of a single type, each identified by an array index.

For example, an array of size 10 (int[] marksArr = new int[10];) can be visualized as shown below.
0	1	2	3	4	5	6	7	8	9

Essentially an array can be thought of as a sequence of buckets. The first bucket is identified with number 0, the second bucket with 1 and so on. This number is called the index.

An element is stored in a bucket using the bucket's index. For example, if we want to store a value of 341 at the first index, the code is marksArr[0] = 341;.
Similarly if we want to store a value of 425 in the second bucket, the code will be marksArr[1] = 425; and so on.
If we want to store a value of 747 in the last bucket, the code will be marksArr[9] = 747;.

The length of an array is specified at the time of creating the array.
While writing code if we want to access the size of an array, we use the length field. For example, marksArr.length gives the value of 10 in our case.
Similarly in the main method, args.length tells us the size of the String array, which is nothing but the number of arguments passed to the main method.

An element of an array is retrieved/accessed using its index. For example, the value stored in the first bucket can be printed using the below code:
System.out.println(marksArr[0]); // remember that array's index starts from 0 and not 1
In Java, we can create an array in the following two ways:
SYNTAX 1 : dataType[] referenceName = new dataType[size];
int[] marksArr = new int[10]; // this creates an empty array of size 10 and initializes all values to 0
or 
SYNTAX 2 : dataType[] referenceName = {value1, value2, value3, .....valuen};
int[] marksArr = { 341, 425, 563, 231, 334, 446, 872, 492, 532, 747};

Click on  to understand the working of an array.

Understand and retype the below code which prints an array of Ramanujan numbers.


package q10935;
public class ArrayDemo {
	public static void main(String[] args) {
		int[] ramanujanNumbers = { 1729, 4104, 13832, 20683, 32832 };
		System.out.println("Printing Ramanujan Numbers: ");
		for (int i = 0; i < ramanujanNumbers.length; i++) {
			System.out.println(ramanujanNumbers[i]);
		}
	}
}