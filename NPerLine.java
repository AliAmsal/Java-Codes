public class NPerLine
{	public static void main(String[]args){
	int n = Integer.parseInt(args[0]);
	for (int i=10;i<100;i=i)
	{	for(int j = 1 ; ((j<=n)&&(i<100));j++,i++)
		{
			System.out.print(" "+ i +" ");		
		}
		System.out.println("");
	}

	}
}