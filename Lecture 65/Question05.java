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




Answer

import java.util.*;
import java.lang.*;
import java.io.*;

interface FuncInterface {
    void AbstractFunction(int A);

    default void GeneralFunction() {
        System.out.println("Welcome");

    }

}

class LambdaExpression {
    public static void main(String args[]) {

        FuncInterface fobj = (int A) -> System.out.println(10 + A);

        fobj.AbstractFunction(15);

    }

}


