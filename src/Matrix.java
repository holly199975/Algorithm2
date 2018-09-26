
public class Matrix {

	public static void main(String[] args) {
		int A[][] = {{1,2},{3,4},{5,6}}; //acol x arow = 3 x 2
		int B[][] = {{7,8,9},{5,6,7}};   //bcol x brow = 2 x 3
		int C[][] = new int[A.length][B[0].length]; // C = acol x brow = 3 x 3
		
		for (int acol = 0; acol < A.length; acol++) {
			   for (int brow = 0; brow < B[0].length; brow++) {
			    for (int arow = 0; arow < A[0].length; arow++) { //A的第二維
			     C[acol][brow] = C[acol][brow] + A[acol][arow] * B[arow][brow];
			    }
			   }
			  }

			  for (int i = 0; i < C.length; i++) {
			   for (int j = 0; j < C[0].length; j++) {
			    System.out.print(C[i][j] + ",");

			   }
			   System.out.println("");
			  }
	}

}
