Functional Interfaces:

Key points:

Functional interface contains only one abstract method. 
Functional interface can have only one functionality to exhibit. 
Functional interface can have any number of default methods. 


Note: lambda expressions can be used to represent the instance of a functional interface( lambda expressions are supported java 8 onwards).

 

Some of the examples of functional interfaces are:

Runnable

ActionListener

Comparable 

 

Before Java 8 Java Code for creating functional interface implementation is given below:

 

import java.util.*;
import java.lang.*;
import java.io.*;

class FunctionalInterface {
    public static void main(String args[]) {
          new Thread(new Runnable(){  //Anonymous inner class object
         	 @Override
        	  public void run() {
         		System.out.println("Creation of new thread");
        	 }
         }).start();
    }
}


Resultant output: 

Creation of new thread



Type the code given above or given in the editor and execute to check the functionality.

 

Sample Test Cases
Test Case 1:
Expected Output:
Creation·of·new·thread

Test Case 2:
Expected Output:
Creation·of·new·thread

Answer

import java.util.*;

import java.lang.*;

import java.io.*;

class FunctionalInterface {

    public static void main(String args[]) {

        new Thread(new Runnable() {

            @Override

            public void run() {

                System.out.println("Creation of new thread");

            }

        }).start();

    }

}
