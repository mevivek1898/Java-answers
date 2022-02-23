Write a class CountChars with a main method. The method receives one command line argument and prints the number of o's (it is not zero, it is the alphabet 'o') present in the argument.

Example:
Cmd Args : ozone
2
Note: Make sure to use println and not print method.


package q11214;
public class CountChars{
	
	public static void main(String args[]){
		
		String vivek =args[0] ;
		
		Character searchChar = 'o';
		
		long count =vivek.chars().filter(ch -> ch == searchChar).count();
		
		 System.out.println(count);
		 
	}
}



