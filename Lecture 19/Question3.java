Retype the code below. The class RiverNameFinder has a method findElement(int index). It accepts an integer argument index. The method prints the array element at that index.

The findElement method creates an array namesArr containing river names. It accesses the element of namesArr at index and prints the element.

Observe that before accessing the element, the method checks if the index is valid or not by checking if index is greater than zero and less than the size of namesArr. Otherwise, we get an ArrayIndexOutofBoundsException.

package q10938;
public class RiverNameFinder {
	public void findElement(int index) {
		String[] namesArr = { "Ganga", "Yamuna", "Godavari", "Krishna", "Narmada", "Kaveri" };
		if (index >= 0 && index < namesArr.length) {
			System.out.println(namesArr[index]);
		}
	}
}

