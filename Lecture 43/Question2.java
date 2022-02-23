Select all the correct statements from the below code:
public final class A {
	public void m1() {				// statement 1
		...
	}
}
public class B extends A {				// statement 2
}
public class C {
	public void m2() {
		...
	}
}
public class D extends C {
	public final void m2() {			// statement 3
		final int value = 2;
		final int[] valueArr = {2, 3, 4};
		final String text1 = "Cat on the wall";
		String text2 = text1;			// statement 4
		String text3 =  "Dog in the pool";
		text1 = text3;				// statement 5
		valueArr[1] = value;			// statement 6
	}
}



Answer

In statement 2, will result in compilation error. Since class A is declared as final it cannot be extended by class B.

Statement 5 will result in a compilation error.