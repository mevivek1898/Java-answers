Given :
public class Test{
	public static void main(String[] args) {
		String myProp = /* insert code here */
		System.out.println(myProp);
	}
}
and the command line:
java -Dprop.custom=gobstopper Test
Which two code snippets when placed at String myProp = /* insert code here */, will produce the output gobstopper? (Choose two.)



Answer


System.getProperty("prop.custom");
System.getProperties().getProperty("prop.custom");