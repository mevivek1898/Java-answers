Create a class CharcountDemo with a main method. The program had given input string CodeTantra. Write a program to count the occurrence of each character in the given string using Hashmap. Fill the missing code in the below program.

Sample Test Cases
Test Case 1:
Expected Output:
{a=2,·r=1,·C=1,·d=1,·T=1,·t=1,·e=1,·n=1,·o=1}


package q24099;
import java.util.*;
public class CharcountDemo {
   public static void main(String[] args) {
      String str = "CodeTantra";
      HashMap <Character, Integer> namesMap = new HashMap<Character, Integer>();
	  
      	// write your code here
      	char[] str_array = str.toCharArray();
      	
      	for (char c : str_array){
      		
      		if (namesMap.containsKey(c)){
      			
      			namesMap.put(c, namesMap.get(c) + 1);
      			
      		}else{
      			
      			namesMap.put(c, 1);
      			
      		}
      		
      	}
      	
      	
      	
      	System.out.println(namesMap);
      	
      	
      	}
}