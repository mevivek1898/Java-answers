In Java related classes and interfaces can be stored together in folders known as packages.

For example in Java, all the common classes like String, System etc which we have used are in a package called java.lang.

There are many such packages in Java, for example:
java.util - this package contains utility and data structure related classes like Date, ArrayList, HashSet, etc., which we will learn later.
java.io - this package contains classes which help in reading input and writing output to files and streams.
java.net - this package contains networking related classes.
If we want to use a Date class which is in java.util package in our class, we need to inform Java compiler that we are interested in using the Date class of java.util package.

This can be done in the below three ways, either by using an import statement or fully qualified class name:
By importing all class of java.util package - import java.util.*; - this statement should occur above the class declaration.
By importing only the required class of java.util package - import java.util.Date; - this statement should occur above the class declaration.
By directly using the fully qualified name of the class in the declaration statement - java.util.Date date = new java.util.Date(); - we need not have an import when we do this.
Note: java.lang package which contains all commonly used Java classes is by default imported. Which means for using a String or an Integer or the System class and the like, one need not import the java.lang package.

Java allows for custom packages to organize the classes. We need to use a package statement like below at the top of a source file to indicate that our class belongs to a certain package. For example:
package com.mycompany.games;

public class Cricket {
	...
}
Note: While learning, in all our examples we will not use package declarations. We will start using them when we write code in an IDE like Eclipse at a later stage. However, we will start using the import statements to import appropriate classes from the packages.

The import statements should occur below the package statement and above the class declaration in the source code.

Select all the correct statements from the below examples:
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
	}
}
import java.util.Date;

public class Example2 {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
	}
}
public class Example3 {
	public static void main(String[] args) {
		java.util.Date currentDate = new java.util.Date();
		System.out.println(currentDate);
	}
}




Answers  

Example2 will compile properly as there is an import statement in the class.

Example3 will compile even though there is no import statement.