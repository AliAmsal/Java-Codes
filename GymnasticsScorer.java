public class GymnasticsScorer
{	public static void main(String[]args){
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		double num3 = Double.parseDouble(args[2]);
		double num4 = Double.parseDouble(args[3]);
		double num5 = Double.parseDouble(args[4]);
		double num6 = Double.parseDouble(args[5]);
		double Largest = Math.max(Math.max(Math.max(Math.max(Math.max(num5,num6),num4),num3),num2),num1);
		double Smallest = Math.min(Math.min(Math.min(Math.min(Math.min(num5,num6),num4),num3),num2),num1);
		double Sum = num1 + num2 + num3 + num4 + num5 + num6;
		double avg = (Sum - (Largest+Smallest))/ 4.0;
		System.out.println("Average of Score is: "+ avg);
		System.out.println("Excluding Largest: "+ Largest);
		System.out.println("Excluding Smallest: "+ Smallest);
		
	
	

	}
}