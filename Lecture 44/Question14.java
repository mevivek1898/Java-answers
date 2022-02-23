The StringBuffer class is a thread-safe, mutable sequence of characters.These are different types of string buffer constructors. They are
public StringBuffer(): Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
public StringBuffer(int capacity): Constructs a string buffer with no characters in it and the specified initial capacity. It throws NegativeArraySizeException if the capacity argument is less than 0
public StringBuffer(String str): Constructs a string buffer initialized to the contents of the specified string. The initial capacity of the string buffer is 16 plus the length of the string argument. It throws NullPointerException if str is null
public StringBuffer(CharSequence seq): Constructs a string buffer that contains the same characters as the specified CharSequence. The initial capacity of the string buffer is 16 plus the length of the CharSequence argument. If the length of the specified CharSequence is less than or equal to zero, then an empty buffer of capacity 16 is returned. It throws NullPointerException if seq is null



Answer 


Initial capacity of string buffer constructor is 16 characters.

public StringBuffer(CharSequence seq), if seq is null it throws NullPointerExceotion.