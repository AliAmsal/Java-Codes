public class booleanMatrixMultiply{
	public static void main(String [] args){
	//Write a program that multiplies two square Boolean matrices, using the OR operation instead of
	//+ and the AND operation instead of *. The size of matrix ‘n’ is taken as a command-line argument.
	//Populate matrices with random assignment of true or false.
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
     		int sum = 0;
      		boolean[][] matrix1 = new boolean[m][n];
		boolean[][] matrix2 = new boolean[m][n];
		//Randomly Populating Matrix 1
      		for(int i = 0; i < m; ++i) {
        		 for(int j = 0; j < n; ++j) {
           			if(Math.random()>0.5){matrix1[i][j]= true;}
				else {matrix1[i][j] = false;}
            			System.out.print(matrix1[i][j] + " ");
       			 }
	      		 System.out.println();
     		}
		System.out.println();
		//Randomly populating Matrix 2
		for(int i = 0; i < m; ++i) {
        		 for(int j = 0; j < n; ++j) {
           			if(Math.random()>0.5){matrix2[i][j]= true;}
				else {matrix2[i][j] = false;}
            			System.out.print(matrix2[i][j] + " ");
       			 }
	      		 System.out.println();
     		}
		System.out.println();
		//Boolean Matrix And
		boolean [][] AndMatrix = new boolean[m][n];
		for(int i =0; i<m;i++){
			for(int j=0;j<n;j++){
				AndMatrix[i][j] = matrix1[i][j] && matrix2[i][j];
				System.out.print(AndMatrix[i][j] + " ");
			}
			System.out.println();
		}
		//Boolean Matrix Or
		System.out.println();
		boolean [][] OrMatrix = new boolean[m][n];
		for(int i =0; i<m;i++){
			for(int j=0;j<n;j++){
				OrMatrix[i][j] = matrix1[i][j] || matrix2[i][j];
				System.out.print(OrMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}
}