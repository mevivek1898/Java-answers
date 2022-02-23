Write a class SwapFirstAndLast with a public method swap that takes one parameter arr of type int[]. Write a code to swap the first and last elements of the array and print all the elements of the array.

For example:
Cmd Args : 1 5 6 7 8
8
5
6
7
1


package q11058;
public class SwapFirstAndLast{
	public void swap(int[] a){
		int f=a[0];
		int l=a[a.length-1];
		int temp=f;
		f=l;
		l=temp;
		System.out.println(f);
		for(int i=1;i<a.length-1;i++){
			System.out.println(a[i]);
		}
		System.out.println(l);
	}
}