Write a class NameOfTheDay with a main method. The method receives one command line argument. The method should convert the argument String to int.

The program should print the name of the weekday based on the value of the day (1-7), using the switch statement.

For example:
Cmd Args : 3
Wednesday 
Similarly, if the input is given as 10 then the output should be Number 10 is not in the range 1 to 7.

For example:
Cmd Args : 10
Number 10 is not in the range 1 to 7
Ensure that the name of the day starts with a capital letter.

Note: Please don't change the package name.

package q10874;

public class NameOfTheDay{
	
	public static void main(String[] args){
		
		int a=Integer.parseInt(args[0]);
		
		switch(a){
			
			case 1:
				
				System.out.println("Monday");
				
				break;
				
				case 2 :
					
					System.out.println("Tuesday");
					
					break;
					
					case 3 :
						
						System.out.println("Wednesday");
						
						break;
						
						case 4:
							
							System.out.println("Thursday");
							
							break;
							
							case 5:
								
								System.out.println("Friday");
								
								break;
								
								case 6:
									
									System.out.println("Saturay");
									
									break;
									
									case 7:
										
										System.out.println("Sunday");
										
										break;
										
										default :
										
										System.out.println("Number " +a + " is not in the range 1 to 7");
										
		}
	}
}