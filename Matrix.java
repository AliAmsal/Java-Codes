public class  Matrix{
	public static void main(String[]args){
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int [][] matrix1 = new int[m][n];
		int [][] matrix2 = new int[m][n];
		System.out.println("First Matrix:");
		for(int i =0; i<m; i++){
			for(int j=0; j<n;j++){
				matrix1[i][j] = (int)(Math.random()*100)+1;
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix:");
		for(int i =0; i<m; i++){
			for(int j=0; j<n;j++){
				matrix2[i][j] = (int)(Math.random()*100)+1;
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}  
		
		int [][] Addition = new int[m][n];
		System.out.println("Add Matrix:");
		for(int i =0; i<m; i++){
			for(int j=0; j<n;j++){
				Addition[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(Addition[i][j]+" ");
			}
			System.out.println();
		}
		
		int [][] Diff = new int[m][n];
		System.out.println("Difference Matrix:");
		for(int i =0; i<m; i++){
			for(int j=0; j<n;j++){
				Diff[i][j] = matrix1[i][j] - matrix2[i][j];
				System.out.print(Diff[i][j]+" ");
			}
			System.out.println();
		}
		int [][] Product = new int[m][n];
		System.out.println("Product Matrix:");
		if(m==n){
			for(int i =0; i<m; i++){
				for(int j=0; j<n;j++){
					for(int k=0; k<n;k++){
						Product[i][j] = Product[i][j] + matrix1[i][k]*matrix2[k][j];
					}
					System.out.print(Product[i][j]+" ");
				}
				System.out.println();
			
			}
		}
		else{
			System.out.println("Error:404-dimensions do not satisfy.");
		}		
	}
}