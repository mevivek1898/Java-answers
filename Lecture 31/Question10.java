Write a class AttachTag with a main mehod. The method receives two command line arguments make the second argument as a special tag and attach before and after the first argument and print the value.

For example:
Cmd Args : Delhi New
[New]Delhi[/New]
Note: Make sure to use println and not print method.

package q11200;


public class  AttachTag{
	
	public static void main(String[] args) {
		
		String str="["+args[1]+"]"+args[0]+"[/"+args[1]+"]";
		
		System.out.println(str);
		
		
	}
}


