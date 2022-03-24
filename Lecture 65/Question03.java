Java 8 onwards demonstration to Implement functional interface using lambda expressions:

Implementation is:



import java.util.*;
import java.lang.*;
import java.io.*;

// Java 8 onwards demonstration to Implement functional interface using lambda expressions

class FunctionalInterfaceWithLambda {
	public static void main(String args[]) {
	// use of lambda expression to create object
		new Thread(()->{System.out.println("Creation of new thread");}).start();
	}
}
Resultant Output:

Creation of new thread



Note: @FunctionalInterface annotation is used to ensure that the functional interface can only have one abstract method, But if more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message. 



Type the code given above or given in the editor and execute to check the functionality.

Sample Test Cases
Test Case 1:
Expected Output:
Creation·of·new·thread

Answer

import java.util.*;

import java.lang.*;

import java.io.*;

class FunctionalInterfaceWithLambda {

    public static void main(String args[]) {

        new Thread(() -> {
            System.out.println("Creation of new thread");
        }).start();

    }

}