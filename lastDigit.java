public class lastDigit{
	public static void main(String[]args){
		int digit = Integer.parseInt(args[0]);
		System.out.println("Last Digit is ");
		if (digit%10 == 0){System.out.println(" 0");}
		else{System.out.println(digit%10);}

	}
}