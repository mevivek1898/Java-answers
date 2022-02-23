Write a class RemoveSuffix with a main method. The method receives one command line argument. If the argument has the same prefix and suffixes up to 3 characters, remove the suffix and print the argument.

Example:
Cmd Args : systemsys
system


package q11212;
public class RemoveSuffix{
	
	public static void main(String[] args){
		
		int n=args[0].length();
		
		if(args[0].substring(0,3).equals(args[0].substring(n-3)))
		
		System.out.println(args[0].substring(0,n-3));
		
		else System.out.println(args[0]);
		
		
		
		
	}
}


