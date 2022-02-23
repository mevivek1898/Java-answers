Write a class JavaStringBufferDelete with a main method to delete characters from a string using StringBuffer class.

Follow the given instructions.
Consider a string "Hello India" and delete 0 to 6 characters in that and print the result.
Consider another string "Hello World", delete characters from position 0 to length of the entire string and print the result.
Consider another string "Hello Java", remove 0th character and then print the result.



package q11215;

public class JavaStringBufferDelete{
	
	public static void main(String args[]){
		
		StringBuffer a=new StringBuffer("Hello India");
		
		StringBuffer b=new StringBuffer("Hello World");
		
		StringBuffer c=new StringBuffer("Hello Java");
		
		
		
		 System.out.println(a.delete(0,6));
		 
		   System.out.println(b.delete(0,b.length()));
		   
		      System.out.println(c.delete(0,1));
		      
	}
}


