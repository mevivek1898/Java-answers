Create a class CharcountDemo with a main method. The program takes string input from the command line argument. Write a program to count the occurrence of each character in the given string using Hashmap, print the result as shown in the example. Fill the missing code in the below program.

Sample Input and Output 1:
Cmd Args : CodeTantra
{a=2, r=1, C=1, t=1, T=1, d=1, e=1, n=1, o=1}

Sample Input and Output 2:
Cmd Args : Welcome to Hyderabad
{ =2, a=2, b=1, c=1, d=2, e=3, H=1, l=1, m=1, o=2, r=1, t=1, W=1, y=1}


package q24100;
import java.util.*;
public class CharcountDemo {
   public static void main(String[] args) {
     String str=args[0];
     
      HashMap <Character, Integer> namesMap = new HashMap<Character, Integer>();
      for (int i = str.length() - 1; i >= 0; i--) {
      // write your code here
      // Take input from the command line argument
      // Find the occurrence of each character in the given string
      char c = str.charAt(i);
      
      
      	
      	if (namesMap.containsKey(c)){
      		
      		namesMap.put(c, namesMap.get(c) + 1);
      		
      	}else{
      		
      		namesMap.put(c, 1);
      		
      	}
      }	
      System.out.println(namesMap);
      
      
    }
  }
      
      