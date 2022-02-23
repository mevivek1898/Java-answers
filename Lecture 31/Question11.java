Write a class PutInsideTag with a main method. The method receives two command line arguments. First one is a tag like '[]' or '{{{}}}' etc. The second argument is a string. Write logic to print a new word where the second argument is kept exactly in the middle of the tag.

For example:
Cmd Args : {{{{}}}} Hyderabad
{{{{Hyderabad}}}}
Note: Make sure to use println and not print method.


'

package q11201;


public class  PutInsideTag{
	
	public static void main(String[] args) {
		
		int mid=args[0].length()/2;
		
		String str=args[0].substring(0,mid) + args[1]+args[0].substring(mid,args[0].length());
		
		System.out.println(str);
		
		
	}
}

