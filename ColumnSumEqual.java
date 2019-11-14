/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package columnsumequal;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 *
 * @author 18660
 */
public class ColumnSumEqual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                boolean equal = true;
                StdOut.print("How many Rows? ");
                int m = StdIn.readInt();
                StdOut.print("How many Columns? ");
		int n = StdIn.readInt();
		int [][] Array = new int [m][n];
                int tsum = 0;
                int [] sum = new int [n];
                //Randomly populating
                for(int i=0; i<m; i++){ 
			for(int j=0;j<n;j++){
				Array[i][j] = (int)(Math.random()*100) + 1; 
                                // Array[i][j] = 2; //For Checking uncommenet this line and comment line above
				StdOut.print(Array[i][j] + " ");
			}
			StdOut.println();	
		}
                // saving all sums
                for(int i=0; i<n; i++){ 
			for(int j=0;j<m;j++){
                                tsum = tsum + Array[j][i];
			}
                        sum[i]=tsum;
			StdOut.println(tsum);
                        tsum = 0;	
		}
                //Checking if all sum are equal
                int i = 0;
                while(equal && i<(n-1)){
                    if(sum[i]!=sum[i+1]){
                        equal = false;
                    }
                    i++;
                }
                StdOut.println("Sum of all columns are equal? " + equal);
    }
    
}
