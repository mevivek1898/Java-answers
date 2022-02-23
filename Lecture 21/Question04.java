write a class ElementCount with a main method which passes an arr of type int[] and an element of type int. Print number of times the element is present in the arr.

Here is an example:
int[] arr = {1, 12, 9, 3, 5, 3, 78, 4, 3, 9, 18, 56, 1, 5}
Cmd Args : 1
2


Note: Please don't change the package name.'

package q11049;
public class ElementCount {
	public static void main(String[] args) {
		int[] arr = {1, 12, 9, 3, 5, 3, 78, 4, 3, 9, 18, 56, 1, 5};
		int element = Integer.parseInt(args[0]);
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(element==arr[i]){
				cnt++;
			}
		}
	System.out.println(cnt);
		
	}
}