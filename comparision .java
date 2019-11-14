public class comparision
{
	public static void main(String[]args)
	{	
		int a = 0;
		int b = 0;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		boolean c = a > b;
		if (a==b) {
			System.out.println(a + " is equal to " + b);
			}
		else {
			System.out.println(a + " is greater than " + b + " " + c);
			System.out.println(a + " is lesser than " + b + " " + !c);
			}

	}


}