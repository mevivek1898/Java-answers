The Format of an Annotation: In its simplest form, an annotation looks like the following

The at sign character (@) indicates to the compiler that what an annotation follows
@Entity

Let us consider an example
@Override
void mySuperMethod() { ... }
In the above example annotation's name is Override

The annotation can include elements, which can be named or unnamed, and there are values for those elements.
@Author(
   name = "Bernard Moret",
   date = "3/27/2005"
)
or

They can be written as
@SuppressWarnings(value = "unchecked")
If there is just one element named value, then the name can be omitted,

It is also possible to use multiple annotations on the same declaration.
@Author(name = "Jane Doe")
@EBook
class MyClass { ... }

If the annotations have the same type, then this is called a repeating annotation. This can be written as follows
@Author(name = "Ram")
@Author(name = "Lakshman")
class MyClass { ... }

The annotation types that are defined in the java.lang or java.lang.annotation packages of the Java SE API.

In the above examples, Override and SuppressWarnings are predefined Java annotations. It is also possible to define our own annotation types called custom annotations. The Author and Ebook annotations in the above example are custom annotation types.

Uses of annotations.

Annotations have a number of uses, among them
Information for the compiler: These can be used by the compiler to detect errors or suppress warnings.
Compile-time and deployment-time processing: Software tools can process annotation information to generate code, XML files, and so on.
Runtime processing: Some annotations are available to be examined at runtime.'


Answers

In annotations @ indicates to compiler that what an annotation does.
Override is a predefined java annotation.
We can use multiple annotations in one declaration