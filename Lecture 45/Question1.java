Among the various classes available in java.lang package, System is one of the most commonly used classes after String.

The System class can neither be instantiated (since it has a private constructor) nor can be extended (since it is declared as final).

System class has three important public static fields:
out - is accessed as System.out. This out field is of type PrintStream. The out refers to the standard output stream.
err - is accessed as System.err. This err field is of type PrintStream. The err refers to the standard error stream.
in - is accessed as System.in. This in field is of type InputStream. The in refers to the standard input stream.
The System class provides a method called System.console(), which returns the java.io.Console object associated with the running Java process (Java Virtual Machine). Select all the correct statement given below.



Answer

In the statement
System.out.println("Uranus");
println is a method.