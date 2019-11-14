public class Input
{
	public static void main(String[]args)
	{	
		int a = 0;
		int b = 0;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		int sum = a + b ;
		int dif = a - b ;
		int pro = a * b ;
		int quo = a / 5 ;
		System.out.println("The Sum is "+ sum );
		System.out.println("The Difference is "+ dif );
		System.out.println("The Product is "+ pro );
		System.out.println("The Quotient is "+ quo );


	}


}