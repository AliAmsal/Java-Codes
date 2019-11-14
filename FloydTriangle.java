public class FloydTriangle{
	public static void main(String[]args){
		int num = Integer.parseInt(args[0]);
		int n = 1;
		for(int i = 1; i<=num;i++)
		{
			for(int j = 1; j<=i; j++,n++)
			{	System.out.print(n + " ");
			}
			System.out.println();
		}				
	}
}