The principal operations on a StringBuilder that are not available in String are the append() and insert() methods, which are overloaded so as to accept data of any type. Each converts its argument to a string and then appends or inserts the characters of that string to the character sequence in the string builder.

The append method always adds the characters at the end of the existing character sequence, while the insert method adds the characters at a specified point.

There are a number of methods of the StringBuilder class. These are few examples
StringBuilder append(Object obj) Appends the argument to this string builder. The data is converted to a string before the append operation takes place.
StringBuilder delete(int start, int end) This method deletes the subsequence from start to end-1 (inclusive) in the StringBuilder's char sequence
StringBuilder insert(int offset, int i) Inserts the second argument into the string builder. The first integer argument indicates the index before which the data is to be inserted. The data is converted to a string before the insert operation takes place.
StringBuilder reverse(): Reverses the sequence of characters in this string builder. String toString(): Returns a string that contains the character sequence in the builder.
'

Answers

append() and insert() operations are not available in strings

insert() method adds the character at the specified index