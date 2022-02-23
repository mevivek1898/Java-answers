In Java, Throwable is the super class for all Error classes and Exception classes.

Among hundreds of exception and error classes, below are few commonly used ones and their exception hierarchy:
                         Throwable
                             |
       ______________________|___________________							
       |					 	                 |
     Error                                   Exception			
       |                                _________| 
       |								|    IOException
       |-- VirtualMachineError          |        |-- ParseException
       |-- OutOfMemoryError             |        |-- InterruptedException
       |-- StackOverflowError           |
                                 RuntimeException
                                        |
                                        |-- NullPointerException
                                        |-- ArithmeticException
                                        |-- IllegalArgumentException
                                        |               |
                                        |        NumberFormatException
                                        |
                                        |-- IndexOutOfBoundsException
                                              |
                                              |--ArrayIndexOutOfBoundsException
                                              |--StringIndexOutOfBoundsExceptionIn the above hierarchy, Throwable and all subclasses of Throwable that are not subclasses of either RuntimeException or Error are called checked exceptions.

All the other subclasses of Error and RuntimeException are called unchecked exceptions.

The Throwable class stores the method call stack trace and also the error message that is printed when an exception occurs.

Even though we have classes called Error and Exception as the main subclasses of Throwable, the whole concept of handling the exception scenarios is called exception handling. We do not say Throwable-handling, Error-handling and Exception-handling separately based on their class names. In general programming terminology, the concepts along with the constructs which are employed to handle erroneous or abnormal situations is called exception handling.


Answer

RuntimeException is an unchecked exception.


NullPointerException is an unchecked exception.


ArithmeticException is an unchecked exception.