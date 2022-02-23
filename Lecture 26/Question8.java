In Java, we can classify variables into two types:
primitive variables - these are also simply called as variables
references
Below are examples of variables ( formally called as primitive variables):
int x = 3;
char gender = 'F';
boolean isCorrectCode = true;
In the above declarations, you will notice that the identifiers x, gender and isCorrectCode are of primitive integer (int), character (char) and boolean data types respectively.

Henceforth we will use the word variable to refer to variables whose type is of primitive type (int, short, long, float, byte, double, char and boolean).

Below are examples of references ( formally called as reference variables):
String firstName = "Appolonius";
Date currentDate = new Date();
Student st1 = new Student("1007", "Ganga", 25, 'F'); //assuming there is a custom class called Student with the constructor
int[] luckyNumbersArr = {3, 5, 7};
String[] cityNamesArr = {"Jerusalem", "Varanasi", "Rome"};
Hereafter we will refer to all variables of class types or interface types or even array types as references.

We can assume a variable as a placeholder that stores a value. For example, in the above declarations variable x is like a cup that stores a value 3.

Similarly we can assume a reference as a placeholder (cup) that points to the object.

In Java, instances of arrays (can be primitive array like int[] or a array of a class like String[]) and instances of classes are objects. We can use the dot . to access a member of that object.
For example:
String firstName = "Appolonius";
Student st1 = new Student("1007", "Ganga", 25, 'F'); //assuming there is a custom class called Student with the constructor
int[] luckyNumbersArr = {3, 5, 7};

System.out.println(firstName.length()); // prints 10 
System.out.println(st1.getId()); // prints 1007
System.out.println(luckyNumbersArr.length); // prints 3Select all the correct statements for the below code:
int age = 7;
Student[] studentArr = new Student[10];
long currentTimeInMilliSeconds = System.currentTimeMillis();
String welcomeMsg = "Hello, welcome to Java Gym!"
boolean[] flagsArr = new boolean[10];



Answer 

currentTimeInMilliSeconds is a variable and not reference.
welcomeMsg is a reference.
flagsArr is a reference.
