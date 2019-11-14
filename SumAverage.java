public class  SumAverage{
	public static void main(String[]args){
		int sum =  0;
		double avg = 0;
		for(int i=0; i<args.length;i++)
		{	sum = sum + Integer.parseInt(args[i]); 
			
		}
		avg = sum / (args.length);
		System.out.println("Sum is "+ sum);	
		System.out.println("Average is "+ avg);			
	}
}