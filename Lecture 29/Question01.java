ome times in text processing, we have to check if a string or a particular character is contained within another string and if so at what position. The following methods help in handling such cases.

The method public int indexOf(String str) returns the index of the first occurrence of the specified substring. Example:
"man and woman and child".indexOf("and") returns 4 
as the index of the first occurrence of 'and' is 4 within the string.

If we want to search for the index of a substring after a certain position within a string, we should use the method public int indexOf(String str, int fromIndex). It returns the index of the first occurrence of the specified substring, starting the search at the specified index. Example:
"man and woman and child".indexOf("and", 5) returns 14 
as the index of the first occurrence of 'and' after index 5 is 14.

If we want the index position of the last occurrence of a string within another string, the method lastIndexOf(String str) can be used. It returns the index of the last occurrence of the specified substring. Example:
"rats and cats and dogs".lastIndexOf("s") returns 21 
as the index of the last occurrence of 's' is 21. 

Suppose we want to search for the last occurrence of a string within another string, but we want the search to begin at a certain index and then go backwards. The method lastIndexOf(String str, int fromIndex) is useful for doing this.
An example will make this functionality clear.
"ac & dc & fc &".lastIndexOf("&", 10) returns 8, 
which points to the second occurrence of '&' in the string. 
The first index of '&' is 3, second index is 8, and third index is 13. 
We have specified that the search should begin at index 10. 
So the method starts searching backwards starting from 10. 
It finds '&' at position 8 and returns it.
There are equivalent methods to the above ones for char data type. We can simply use char instead of String in the above methods.

Click on  String indexOf Methods Demo to understand the working of the above mentioned methods.

Retype the code below which demonstrates how to use the above methods.


package q11171;
public class StringMethods {
	public static void main(String[] args) {
		String str = "special char &";
		System.out.println(str.indexOf("char"));
		System.out.println(str.indexOf(' '));
		System.out.println(str.lastIndexOf(' '));
		System.out.println(str.lastIndexOf("a", 8));
		System.out.println(str.indexOf("sp", 4));
	}
}

