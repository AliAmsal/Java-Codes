public class FrequencyEasy
{	public static void main(String[]args){
		int digit = Integer.parseInt(args[0]);
		int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
		for (int i = 0;i<= digit; i=+1)
		{	
			if (digit%10 == 0)
				{zero = zero +1;}
			if (digit%10 == 1)
				{one = one +1;}
			if (digit%10 == 2)
				{two = two +1;}
			if (digit%10 == 3)
				{three = three +1;}
			if (digit%10 == 4)
				{four = four +1;}
			if (digit%10 == 5)
				{five = five +1;}
			if (digit%10 == 6)
				{six = six +1;}
			if (digit%10 == 7)
				{seven = seven +1;}
			if (digit%10 == 8)
				{eight = eight +1;}
			if (digit%10 == 9)
				{nine = nine +1;}
			digit = digit / 10 ;

		}

		System.out.println("number of Zeros  :"+ zero);
		System.out.println("number of ones   :"+ one);
		System.out.println("number of Twos   :"+ two);
		System.out.println("number of Threes :"+ three);
		System.out.println("number of Four   :"+ four);
		System.out.println("number of Fives  :"+ five);
		System.out.println("number of Sixs   :"+ six);
		System.out.println("number of Sevens :"+ seven);
		System.out.println("number of Eights :"+ eight);
		System.out.println("number of Nine   :"+ nine);
		

	}
}