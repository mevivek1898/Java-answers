Write a class ExpandAString with a main method. The program receives two command line arguments. The first argument is a string and the second argument is a number. Print the first argument as many number of times as the second argument.

For Example:
Cmd Args : Ganga 3
GangaGangaGanga


package q11193;
public class ExpandAString {
	
	
	
	
	public static void main(String[] args) {
		
		String  ans=args[0];
		
		int n=Integer.parseInt(args[1]);
		
	 System.out.println(args[0].repeat(n));
		
		
		
		
		
		
		
		
	}
	
}