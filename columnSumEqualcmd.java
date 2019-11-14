public class columnSumEqualcmd{
	public static void main(String [] args){
                boolean equal = true;
                int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int [][] Array = new int [m][n];
                int tsum = 0;
                int [] sum = new int [n];
                for(int i=0; i<m; i++){ 
			for(int j=0;j<n;j++){
				Array[i][j] = (int)(Math.random()*100) + 1;
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();	
		}
                
                for(int i=0; i<n; i++){ 
			for(int j=0;j<m;j++){
                                tsum = tsum + Array[j][i];
			}
                        sum[i]=tsum;
			System.out.println(tsum);
                        tsum = 0;	
		}
                int i = 0;
                while(equal && i<(n-1)){
                    if(sum[i]!=sum[i+1]){
                        equal = false;
                    }
                    i++;
                }
                System.out.println(equal);
	}
}