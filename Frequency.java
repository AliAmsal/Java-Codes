public class Frequency
{	public static void main(String[]args){
	int digit = Integer.parseInt(args[0]);
	int inc = 0;
	int digit2 = 0;
	int a = 0;
		while(a<10)
		{
			inc = 0;
			digit2 = digit;
			while(digit2>0){
				
				if((digit2%10)==a){
					inc = inc + 1;
				}
				digit2 = digit2/10 ;
				
			}
			System.out.println("Frequency of "+ a +" is "+ inc);
			a = a+1;	
		}
		

	}
}