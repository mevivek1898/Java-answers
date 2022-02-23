Create a class AgeCheck with a public method checkAge that takes two parameters age1 and age2 are of type int. The program should print Discount Price if the age1 is less than 10 and age2 is greater than 60, otherwise it should print Full Price.

For Example:
Cmd Args : 3 62
Discount Price
Note: Make sure to use println and not print method.

Note: Please don't change the package name.

package q10926;

public class AgeCheck{
	
	public static void checkAge(int al ,int a2){
		
		if(al <10 && a2>60){
			
			System.out.println("Discount Price");
			
			}else{
				
				System.out.println("Full Price");
				
			}
			
			}
		}
	