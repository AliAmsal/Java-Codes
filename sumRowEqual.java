public class sumRowEqual{
	public static void main(String[]args){
		//Write a program that displays if every row of a matrix with order m x n has same row-sum. The
		//program takes two command-line arguments, m and n. Populate matrix with random numbers
		//between 1 and 100.
		int psum = 0;
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int [] sum = new int [m];
		boolean equal = true;
		boolean pequal = true ;
		int [][] matrix = new int[m][n];
		// Randomly Populating
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				matrix[i][j] = (int)(Math.random()*100) + 1 ;
				//matrix[i][j] =  1 ;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// suming individual rows
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				sum[i] = sum[i] + matrix[i][j];	
			}
			System.out.println("Sum of Row# " + i +" is "+ sum[i]);
			psum = sum[i];
		}
		//compairing all sum
		for(int i=0; i<m; i++){
			if(psum==sum[i]){pequal=true;}
			else{pequal = false;}
			equal = pequal && equal;
		}
		if(equal) {System.out.print("Sum of all Rows are equal");}
		else {System.out.print("Sum of all Rows are not equal");}


	}
}