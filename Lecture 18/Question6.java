Write a class TransposeMatrix with a public method transposeMatrix that takes one parameter matrix1 of type int[][] which returns the transpose of the given matrix.

Consider the following example for your undertanding:
Matrix:
Enter number of rows: 3
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 3 4
Enter row 3: 5 6
Transpose of given matrices is:
1 3 5
2 4 6

package q11105;
public class TransposeMatrix {
/**
	 * Computes the transpose of the given matrix. 
	 * 
	 * @return the resultant matrix
	 */
	
public int[][] transposeMatrix(int[][] m) {
		
		// Write the code
	//	if(m.length<=0) return null;
		int copy[][]=new int [m[0].length][m.length];
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
			copy[j][i]= m[i][j];
			}
		}
	return copy;
	}
}
