Write code to sort the array elements by using merge sort technique.

Write a class MyMergeSort with main method.

Click on  to understand the working of merge sort.

package q11043;
import java.util.Scanner;
public class MyMergeSort {
	private int[] array;
	private int[] tempMergArr;
	private int length;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of elements in the array: ");
		int n = s.nextInt();
		int[] inputArr = new int[n];
		System.out.print("Enter elements in the array seperated by space: ");
		for(int i = 0; i < n; i++) {
			inputArr[i] = s.nextInt();
		}
		MyMergeSort mms = new MyMergeSort();
		mms.sort(inputArr);
		for(int i:inputArr){
			System.out.print(i);
			System.out.print(" ");
		}
	}
	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}



    //Answer Starts Here

    
private void doMergeSort(int lowerIndex, int higherIndex) {
	
	if(lowerIndex<higherIndex){
		
		int middle= lowerIndex +(higherIndex - lowerIndex)/2;
		
		doMergeSort(lowerIndex,middle);
		
		doMergeSort(middle+1,higherIndex);
		
		mergeParts(lowerIndex,middle,higherIndex);
		
		
	}
}
private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	
	for(int i=lowerIndex;i<=higherIndex;i++){
		
		tempMergArr[i]=array[i];
		
		
		
	}
	
	int i = lowerIndex;
	
	int j=middle+1;
	
	int k=lowerIndex;
	
	
	
	while(i<=middle && j <=higherIndex){
		
		if(tempMergArr[i] <= tempMergArr[j]){
			//Whhhyaf  zx kmdnfnok dngijsdngk XZCM< jkv xzxmv, jdk
			array[k]=tempMergArr[i];
			
			i++;
			
		} else{
			
			array[k]=tempMergArr[j];
			
			j++;
			
		}
		
		k++;
		
	}
	
	while(i<=middle){
		
		array[k]=tempMergArr[i];
		
		k++;
		
		i++;
		
		
		
	}
	
}

//Answer ends Here

}
