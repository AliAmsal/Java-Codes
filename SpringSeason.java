public class SpringSeason
{
	public static void main(String[]args)
	{	
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		boolean cond1 = ((d>=20 && d<=31) && (m>=3 && m<6));
		boolean cond2 = ((d>=1 && d<=20) && (m>3 && m<=6));
		boolean Yes = (cond1 || cond2);
		System.out.println("Are we in a Spring Season?  " + Yes);


	}


}