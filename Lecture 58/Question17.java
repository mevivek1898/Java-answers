Create a class WordcountDemo with a main method. The program takes input from the command line arguments. Write a program to count the number of words in the given input, print the result as shown in the example. Fill the missing code in the below program.

Sample Input and output:
Cmd Args : This is a good day
{a=1, This=1, is=1, good=1, day=1}



package q24101;
import java.util.*;
public class WordcountDemo {
   public static void main(String[] args) {
     HashMap<String, Integer> ans = new HashMap<String, Integer>();
      // write your code here
      // Take input from the command line argument
      // Find the occurrence of each word in the given string

 
 for (int i=0;i<args.length;i++){
 	String c=args[i];
 	if (ans.containsKey(c)){
 		
 		ans.put(c, ans.get(c) + 1);
 		
 	}else{
 		
 		ans.put(c, 1);
 		
 	}
 	
 }
 
 
 
 System.out.println(ans);
 
 	}
 	}
 