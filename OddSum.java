public class OddSum{
	public static void main(String[]args){
		int num = Integer.parseInt(args[0]);
		int n = 1;
		int sum = 0;
		while(n != num){
			sum = n + sum ;
			n = n + 2;
		}
		System.out.println("Sum of Odds till "+ num + " is " + sum);
			
	}
}