Type the code given below in Lambda2Arguments.java file to be well versed with the concept of implementing lambda expressions with multiple arguments.
Key points:

The body of a lambda expression can contain zero, one or more statements.
When there is a single statement curly brackets are not mandatory and the return type of the anonymous function is the same as that of the body expression.
When there are more than one statements, then these must be enclosed in curly brackets (a code block) and the return type of the anonymous function is the same as the type of the value returned within the code block, or void if nothing is returned.

// Working of lambda expressions
public class Lambda2Arguments{
	// operation is implemented using lambda expressions
	interface Operation1{
		int operation(int a, int b);
		
	}
	// Message() is implemented using lambda expressions
	interface Operation2{
		void Message(String message);
		
	}
	// Performs Operation1's operation on P and Q
	private int operate(int P, int Q, Operation1 Obj){
		return Obj.operation(P, Q);
		
	}
	public static void main(String args[]){
		// lambda expression for addition for two parameters// data type for x and y is optional.
		Operation1 Add = (int x, int y) -> x + y;
		// lambda expression multiplication 
		Operation1 Mult = (int x, int y) -> x * y;
		// Creating an object of Test to call operate
		Lambda2Arguments Tobj = new Lambda2Arguments();
		// Add two numbers with lambda 
		System.out.println("Addition is " +Tobj.operate(600, 700, Add));
		// Multiply two numbers with lambda 
		System.out.println("Multiplication is " +
		Tobj.operate(60, 30, Mult));
		//This expression implements Operation2 interface
		Operation2 Fobj = message ->System.out.println("CodeTantra "+ message);
		Fobj.Message("Lets Code");
		
	}
}


Answer



public class Lambda2Arguments {

    interface Operation1 {
        int operation(int a, int b);

    }

    interface Operation2 {
        void Message(String message);

    }

    private int operate(int P, int Q, Operation1 Obj) {
        return Obj.operation(P, Q);

    }

    public static void main(String args[]) {

        Operation1 Add = (int x, int y) -> x + y;

        Operation1 Mult = (int x, int y) -> x * y;

        Lambda2Arguments Tobj = new Lambda2Arguments();

        System.out.println("Addition is " + Tobj.operate(600, 700, Add));

        System.out.println("Multiplication is " +
                Tobj.operate(60, 30, Mult));

        Operation2 Fobj = message -> System.out.println("CodeTantra " + message);
        Fobj.Message("Lets Code");

    }
}

