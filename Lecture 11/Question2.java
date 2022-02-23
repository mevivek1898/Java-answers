Understanding Unary Operators 

package q10829;
public class UnaryOperatorsDemo {
	public static void main(String[] args) {
		int x = 16;
		System.out.println("+x = " + (+x));
		System.out.println("-x = " + (-x));
		System.out.println("x = " + x);
		System.out.println("++x = " + (++x));
		System.out.println("x = " + x);
		System.out.println("x++ = " + (x++));
		System.out.println("x = " + x);
		System.out.println("--x = " + (--x));
		System.out.println("x = " + x);
		System.out.println("x-- = " + (x--));
		System.out.println("x = " + x);
		boolean flag = false;
		System.out.println("flag = " + flag);
		System.out.println("!flag = " + (!flag));
	}
}