public class BinToDec{
	public static void main(String[]args){
		int Bin = Integer.parseInt(args[0]);
		int digit = 0;
		int sum = 0;
		int PowerOf2 = 0;
		while(Bin>0){
			//checking if last digit(LSB) is 1 or 0
			if(Bin%2==0)digit = 0;
			else digit = 1;
			if(digit==1){
				sum = sum + (int)(Math.pow(2,PowerOf2));
			}
			PowerOf2++;
			//performing integer division to eleminate last digit
			Bin= Bin/10;
		}
		System.out.println(sum);
	}
}