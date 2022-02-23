In Java, a multidimensional array is implemented as an array of arrays.

A multidimensional array is an array whose components are themselves arrays. Imagine a medical cabinet like this:



The cabinet has multiple rows of medicines. Each row in the cabinet is an array and the whole cabinet is a multidimensional array.

In Java, the arrays / rows inside a multidimensional array can be of different lengths, like below -

0	1	2	3	4	5	6	7	8	9	➞	Array at index 0
47	49	42	45	60	66	➞	Array at index 1
15	16	17	18	19	20	21	22	23	24	25	26	⇾	Array at index 2
32	10	22	➞	Array at index 3

Each array inside of a multidimensional array can be accessed with an index number as shown in the above figure. The first array is identified with number 0, the second array with 1 and so on.

In Java, we can create a multidimensional array in the following ways:
SYNTAX 1 : dataType[][] referenceName = new dataType[rowsize][];
int[][] marksArr = new int[3][]; // this creates an empty multidimensional array with 3 arrays.
marksArr[0] = new int[10]; //this create an empty array of size 10 and adds to marksArray at index 0
marksArr[1] = new int[2]; //this create an empty array of size 2 and adds to marksArray at index 1
marksArr[2] = new int[5]; //this create an empty array of size 5 and adds to marksArray at index 2
 
or 

SYNTAX 2 : dataType[][] referenceName = { {value1, value2, value3, .....valuen},
						 {value1, value2, value3, .....valuep},
 						....................
						 {value1, value2, value3, .....valuer}};
int[][] marksArr = { 
			{341, 425, 563, 231, 334},
			{446, 532, 747},
			{872, 492}
		};

Note: The data types of all the arrays inside a multidimensional array should be the same.

Select all the options where a valid multidimensional array is



Answer 

int[][] intArray = new int[2][5];
int[][] intArray = new int[3][];
int[] arr1 = new int[5];
int[] arr2 = new int[6];
int[] arr3 = new int[8];


intArray[0] = arr1;
intArray[1] = arr2;
intArray[2] = arr3;
int[] arr1 = new int[5];
int[] arr2 = new int[6];
int[] arr3 = new int[8];


int[][] intArray = {arr1, arr2, arr3};
int[] arr1 = new int[5];


int[][] intArray = {arr1, {10,11,12}, {100,150,200}};
int[][] intArray = {{10,11,12}};