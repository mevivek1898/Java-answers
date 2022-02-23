Enumeration means a list of named constant. In Java, enumeration defines a class type.

An enum is defined similarly to how a class would be defined. It uses the enum instead of the class keyword. The constant values are listed in the enum’s body. It is common to write the constants in all uppercase letters to make it easier to recognize them.

This is an example of how to define an enum.
enum Subject {
	JAVA, CPP, C, DBMS
}
The elements inside the Subject enum are called enumeration constants
By default each enumeration constant is public, static and final.
Variables of Enumeration can be defined directly without using new keyword. Ex Subject = sub1;
Variables of Enumeration type can have only enumeration constants as value. We define a variable in enum as enum_variable = enum_type.enum_constant;. This can be done as follows. From the above example we can define variable as
sub1 = Subject.JAVA;
Enum declaration can be done either outside a Class or inside a Class. But, we cannot declare Enum inside the method
Enum can have fields, constructors and methods
Enum may implement many interfaces but cannot extend any class because it internally extends java.lang.Enum, so it can't extend other classes
In the next lesson we will learn how to Implement enums with switch case.

ANSWERS 

Enumeration means list of named constant
Enum internally extends a class called java.lang.Enum