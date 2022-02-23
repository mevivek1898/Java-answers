Annotations that apply to other annotations are called meta-annotations. There are several meta-annotation types defined in java.lang.annotation.

@Retention: This specifies how the marked annotation is stored
RetentionPolicy.SOURCE – The marked annotation is retained only in the source level and is ignored by the compiler
RetentionPolicy.CLASS – The marked annotation is retained by the compiler at compile time, but is ignored by the Java Virtual Machine (JVM)
RetentionPolicy.RUNTIME – The marked annotation is retained by the JVM so it can be used by the runtime environment.
@Documented: This annotation indicates that whenever the specified annotation is used those elements should be documented using the Javadoc tool.

@Target: This annotation marks another annotation to restrict what kind of Java elements the annotation can be applied to. A target annotation specifies one of the following element types as its value:
ElementType.ANNOTATION_TYPE can be applied to an annotation type
ElementType.CONSTRUCTOR can be applied to a constructor
ElementType.FIELD can be applied to a field or property
ElementType.LOCAL_VARIABLE can be applied to a local variable
ElementType.METHOD can be applied to a method-level annotation
ElementType.PACKAGE can be applied to a package declaration
ElementType.PARAMETER can be applied to the parameters of a method
ElementType.TYPE can be applied to any element of a class
@Inherited: annotation indicates that the annotation type can be inherited from the super class.


Answers

Annotations that are applied to another annotations are called meta annotations.

@Retention specifies that how a marked annotations are stored
ElementType.METHOD can be applied to a method-level annotation