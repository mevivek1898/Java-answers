Built in functional interfaces in java.util.function Package: 

 

Predicate: 

Abstract method test in Predicate interface gives a Boolean value as a result for the specified argument. 

Definition is: 

public interface Predicate{
  public boolean test(TMT T);
}


BinaryOperator: 

Abstract method apply in BinaryOperatator interface takes two argument and returns a result of same type (As mentioned in definition generic type TMT, identifier used for type can be anything). 



Definition is:

public interface BinaryOperator {
   	public TMT apply(TMT A, TMT B);
}    


Function: 

Abstract method apply in Function interface takes argument of type P and returns a result of type Q. 



Definition is:

public interface Function {
  public Q apply(P t);
}


Implementation/Use of Predicate interface:



// predicate interface
import java.util.*;
import java.util.function.Predicate;
class PredicateInterface {
	public static void main(String args[]) {
        // list of string type is defined
         List<String> Words = Arrays.asList("Ready","To","Visit","Coders","Den","CodeTantriks");
         // predicate type is declared as string and lambda expression is defined to create object
         Predicate<String> P = (s)->s.startsWith("C");
         // Looping in the list
         for (String W:Words) {
           //abstract method test in Predicate interface
           if (P.test(W)) {
             System.out.println(W);
           }
        }
    }
}


Resultant output:

Coders
CodeTantriks


Type the code given above or given in the editor and execute to check the functionality.

Sample Test Cases
Test Case 1:
Expected Output:
Coders
CodeTantriks

Answers 

import java.util.*;

import java.util.function.Predicate;

class PredicateInterface{
	
	public static void main(String args[]){

		List<String> Words = Arrays.asList("Ready","To","Visit","Coders","Den","CodeTantriks");
		
		Predicate<String> P = (s)->s.startsWith("C");
		
		for (String W:Words){
			
			if (P.test(W)){
				
				System.out.println(W);
				
			}
			
			
		}
		
		
	}
	
	
	
}