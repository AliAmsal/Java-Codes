public class Pattern2
{
	public static void main(String[]args){
		int n = Integer.parseInt(args[0]);
		for (int i = n ; i>=1; i--){
			for(int ws=(i-1);ws>=0;ws--){
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				System.out.print( (j) + " ");
			}
			System.out.println();	
		}
		
	}
}