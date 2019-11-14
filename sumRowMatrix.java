public class sumRowMatrix {
   public static void main(String[] args) {
	//Write a program that displays the sum of the elements in row x of a matrix with order m x n. The
	//program takes three command-line arguments, m, n, and, x. Populate matrix with random
	//numbers between 1 and 100.
      int m = Integer.parseInt(args[0]);
      int n = Integer.parseInt(args[1]);
      int x = Integer.parseInt(args[2]);
      int sum = 0;
      int[][] matrix = new int[m][n];

      int i;
      for(i = 0; i < m; ++i) {
         for(int j = 0; j < n; ++j) {
            matrix[i][j] = (int)(Math.random() * 100.0D) + 1;
            System.out.print(matrix[i][j] + " ");
         }

         System.out.println();
      }

      for(i = 0; i < n; ++i) {
         sum = sum + matrix[x][i];
      }

      System.out.println("Sum of Row: " + x + " is " + sum);
   }
}
    