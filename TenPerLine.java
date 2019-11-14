public class TenPerLine
{	public static void main(String[]args){
	for (int i=1;i<=100;i+=1)
	{	if(i%10==0)
		{
			System.out.print(" "+i+" ");
			System.out.println("");
			
		}
		else{System.out.print(" "+i+" ");}
	}

	}
}