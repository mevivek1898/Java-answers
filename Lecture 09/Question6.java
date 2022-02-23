The below table shows the primitive types and their corresponding wrapper classes in Java:
char    Character     Number Types
==================================
byte    Byte          Byte.valueOf(String s)
short   Short         Short.valueOf(String s)
int     Integer       Integer.valueOf(String s)
float   Float         Float.valueOf(String s)
double  Double        Double.valueOf(String s)
long    Long          Long.valueOf(String s)All the above wrapper classes present for the number types contain a useful method called valueOf(), which converts a string to an instance of that number type.

See and retype the below code to understand the usage of the valueOf() method in the wrapper classes.

Note: Please don't change the package name.'

package q10825;
public class WrapperClassDemo {
	public static void main(String[] args) {
		String text1 = "101";
		String text2 = "34";
		String text3 = "5.5";
		String text4 = "-35.593933";
		String text5 = "93593933";
		System.out.println(Byte.valueOf(text1));
		System.out.println(Short.valueOf(text2));
		System.out.println(Integer.valueOf(text2));
		System.out.println(Float.valueOf(text3));
		System.out.println(Double.valueOf(text4));
		System.out.println(Long.valueOf(text5));
	}
}