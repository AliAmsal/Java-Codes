public class SumDigit{
	public static void main(String[]args){
		int digit = Integer.parseInt(args[0]);
		int rem = 0 ;
		int sum = 0;
		while(digit>0){
			rem =digit%10;
			sum =rem + sum;
			digit = digit/10 ;
		}
		System.out.println("Sum of digits is " + sum);
	}
}