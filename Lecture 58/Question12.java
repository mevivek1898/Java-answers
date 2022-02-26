Create a class HashMapIterationDemo with a main method. The method takes inputs from the command line arguments. From the input make the first two chars of the argument as key and the entire argument as value. Print the result as shown in the example.

We can assume the size of names passed as arguments will be greater than three characters.

Sample Input and Output
Cmd Args : Red White Black Brown
{Br=Brown, Wh=White, Re=Red, Bl=Black}


package q24086;
import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap <String, String>();
		Set shortNamesSet = namesMap.keySet();
		for(int i=0;i<args.length;i++) {
		String key = args[i].substring (0,2);
		
		
		
		String value = args[i];
		
		
		
		namesMap.put (key , value);
		
		
		
		
		
		}
		
		
		
		
		
		Set <String>keys = namesMap.keySet();
		
		
		System.out.println(namesMap);
		
		
		
		
		
	}
}