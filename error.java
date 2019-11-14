public class error
{
	public static void main(String[]args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1 + num2;
		int prod = num1*num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " * " + num2 + " = " + prod);
		if (num2 == 0){
			System.out.println("Division by Zero");
			System.out.println("Division by Zero");
		}
		else{
			int div = num1/num2;
			int rem = num1%num2;
			System.out.println(num1 + " / " + num2 + " = " + div );
			System.out.println(num1 + " % " + num2 + " = " + rem);
			
		}		
	
	
	}
}