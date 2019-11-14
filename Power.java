public class Power
{	public static void main(String[]args){
		int num = Integer.parseInt(args[0]);
		int pow = Integer.parseInt(args[1]);
		int sum = 1;
		for (int i = 1; i <= pow;i+=1)
		{	sum = sum * (num);

		}
		System.out.println(num + " power " + pow + " is "+ sum );	
	}
}