StringBuilder objects are like String objects, except that they can be modified, means internally these objects are treated like variable-length arrays that contain a sequence of characters. At any point, the length and content of the sequence can be changed through method invocations.

String builders offer certain advantages as they offer better performance and simpler code when compared to strings. For example, if you need to concatenate a large number of strings, appending to a StringBuilder object is more efficient.

Length and Capacity: The StringBuilder class, like the String class, has a method length() that returns the length of the character sequence in the builder.

Unlike strings, every string builder also has a capacity, the number of character spaces that have been allocated. The capacity, which is returned by the capacity() method, is always greater than or equal to the length (usually greater than) and will automatically expand as necessary to accommodate additions to the string builder.

StringBuilder Constructors:

StringBuilder(): Creates an empty string builder with a capacity of 16 (16 empty elements).
StringBuilder(CharSequence cs): Constructs a string builder containing the same characters as the specified CharSequence, plus an extra 16 empty elements trailing the CharSequence.
StringBuilder(int initCapacity): Creates an empty string builder with the specified initial capacity.
StringBuilder(String s): Creates a string builder whose value is initialized by the specified string, plus an extra 16 empty elements trailing the string



Answer

Initial capacity of string builder is 16

String builders are mutable.