Write a class MultiplicationOfMatrix with a public method multiplication which returns the multiplication result of its arguments. if the first argument column size is not equal to the row size of the second argument, then the method should return null.

Consider the following example for your understanding
Matrix 1:
Enter number of rows: 3
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 4 5
Enter row 3: 7 8
Matrix 2:
Enter number of rows: 2
Enter number of columns: 3
Enter 3 numbers separated by space
Enter row 1: 1 2 3
Enter row 2: 4 5 6
Multiplication of the two given matrices is:
9 12 15
24 33 42
39 54 69
Matrix 1:
Enter number of rows: 2
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 3 4
Matrix 2:
Enter number of rows: 3
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 4 5
Enter row 3: 2 3
Multiplication of matrices is not possible

package q11106;
public class MultiplicationOfMatrix{
	public int[][] multiplication(int[][] m1, int[][] m2) {
		/*Return the result if the matrix1 coloumn size is equal to matrix2 row size and print the result.
		* @Return null.
		*/
		// Write your logic here for matrix multiplication
		int r=m1.length,c=m1[0].length;
		int r1=m2.length,c1=m2[0].length;
		int ans[][]=new int [r][c1];
		for(int i=0;i<r;i++){
			for(int j=0;j<c1;j++){
				for(int k=0;k<r1;k++){
					if(r1==c){
						ans[i][j]+=m1[i][k]*m2[k][j];
					}else{
						return null;
					}
				}
			}
		}
		return ans;
		
	}
}