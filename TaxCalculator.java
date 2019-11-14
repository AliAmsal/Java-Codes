public class TaxCalculator {	
	public static void main(String[]args) {
		int Income = Integer.parseInt(args[0]);
		double taxRate = 0;
		double tax = 0;
		if (Income<0){System.out.println("Invalid Input,Bank Paisey nhi dega Ghareebon ko");}
		else{
			if (Income>=0 && Income<=10000){taxRate = 0.1;}
			if (Income>=10001 && Income<=50000){taxRate = 0.15;}
			if (Income>=50001 && Income<=250000){taxRate = 0.17;}
			if (Income>250000){taxRate = 0.20;}
			tax = taxRate*Income;
			System.out.println("Tax on your Income is: " + tax );
		}
				 

	}
}