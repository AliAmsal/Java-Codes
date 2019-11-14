public class Euclidean
{
	public static void main(String[]args)
	{	
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double diffX = Math.pow((x-0),2);
		double diffY = Math.pow((y-0),2);
		double Diff = Math.sqrt(diffX + diffY);
		System.out.println(Diff + " ~ "+ Math.round(Diff));


	}


}