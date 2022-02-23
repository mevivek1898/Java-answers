Write code to calculate roots of a quadratic equation.

Write a class QuadraticRoots with main method. The method receives three arguments, write code to parse them into double type.

For example:
if the values 2, 5, 3 are passed as arguments, then the output should be First root is : -1.0 Second root is : -1.5
If the values 3, 2, 1 are passed then the output should be Roots are imaginary
Similarly, if the values 2, 4, 2 are passed then the output should be Roots are equal and value is : -1.0Note: Make sure to use the print() and not the println() method.

Note: Please don't change the package name.


package q10851;

public class QuadraticRoots {
	
	public static void main(String args[]){
		
		double secondRoot = 0, firstRoot = 0;
		
		
		
		double a = Double.parseDouble(args[0]);
		
		
		
		double b = Double.parseDouble(args[1]);
		
		
		
		double c = Double.parseDouble(args[2]);
		
		
		
		double determinant = (b*b)-(4*a*c);
		
		double sqrt = Math.sqrt(determinant);
		
		
		
		if(determinant>0){
			
			firstRoot = (-b + sqrt)/(2*a);
			
			secondRoot = (-b - sqrt)/(2*a);
			
			System.out.println("First root is : "+ firstRoot +" Second root is : "+secondRoot);
			
		}else if(determinant == 0){
			
			System.out.println("Roots are equal and value is : "+(-b + sqrt)/(2*a));
			
		}else {
			System.out.println("Roots are imaginary");
		}
		
	}
	
}

