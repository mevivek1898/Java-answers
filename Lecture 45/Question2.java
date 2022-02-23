Select all the correct statements for some of the common methods in System class. [Hint: Make sure to click on the method names and read the method documentation before you mark the answers].



Answer

ALL

currentTimeMillis() is a static method in System class. So we can directly call the method on the class name, as given below:
System.currentTimeMillis();
The currentTimeMillis() method in System class returns a long value representing the total time elapsed from the midnight of January 1, 1970 UTC until the current system time.
The currentTimeMillis() method in System class returns a long value with precision upto nanoseconds. We can use this method when we want to measure time difference between two events to the precision of nanoseconds.

int[] sourceArr = {1, 3, 5, 7, 9};
int[] destinationArr = new int[5];
System.arraycopy(sourceArr, 1, destinationArr, 1, 2);
After the arraycopy method invocation, the values in destinationArr array will be {0, 3, 5, 0, 0}