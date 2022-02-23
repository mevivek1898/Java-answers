After java SE 8 release, annotations can also be applied to any type use. This means that annotations can be used anywhere you use a type. A few examples of where types are used are class instance creation expressions (new), casts, implements clauses, and throws clauses. This form of annotation is called a type annotation. Here are some examples

Class instance creation expression
new @Interned MyObject();
Type cast
myStr = (@NonNull String) str;
Thrown exception declaration
void temperatureMonitor() throws
        @Critical TemperatureException { ... }
Type annotations were created to support improved analysis of Java programs this way of ensuring stronger type checking. For example, you want to ensure that a particular variable in your program is never assigned to null; you want to avoid triggering a NullPointerException. You can write a custom plug-in to check for this. You would then modify your code to annotate that particular variable, indicating that it is never assigned to null.

The variable declaration might look like this:
@NonNull String str;

When you compile the code, including the NonNull module at the command line, the compiler prints a warning if it detects a potential problem, allowing you to modify the code to avoid the error. After you correct the code to remove all warnings, this particular error will not occur when the program runs.


Answers 

Type annotations are supported only the release of Java SE 8
Type annotations supports improved analysis of Java programs