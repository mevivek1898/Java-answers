boolean containsKey(Object key): Which returns true if this map contains a mapping for the specified key

Fill the missing code in the below program. Follow the instructions given in the comment lines.

Sample Input and Output:
{Ban=Bangalre, Hy=Hyderabad, Ke=Kerala}
true


package q24090;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> namesMap = new TreeMap<String, String>();
		namesMap.put("Hy", "Hyderabad");
        namesMap.put("Ban", "Bangalre");
        namesMap.put("Ke","Kerala");
        System.out.println(namesMap);
        
        // Find whether the given map contains the key Ban or not.
        System.out.println(namesMap.containsKey("Ban"));
	}
}
