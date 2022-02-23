Create a class CountSeniorCitizens with a public method countSeniorCitizens that takes four parameters age1, age2, age3, and age4 are of type int. The program should print the count of numbers which are greater than 60.

For Example:
Cmd Args : 60 61 59 58
1
[Hint: You can use multiple if conditions to keep track of the count.]

Note: Make sure to use println and not print method.

Note: Please don't change the package name.

package q10929;

public class CountSeniorCitizens{
	
	public static void countSeniorCitizens (int al, int a2, int a3, int a4){
		
		int C=0;
		
		if(al>60){
			
			C++;
			
		}
		
		if(a2>60){
			
			C++;
			
		}
		
		if(a3>60){
			
			C++;
		}	
			if(a4>60){
				
				C++;
			}	
				System.out.println(C);
				
			
			
	
	}
}