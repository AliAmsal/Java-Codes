public class Quadratic{
	public static void main(String[]args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a==0){
			System.out.println("a should not be 0");
		}
		else{	int disc = ((b*b)-(4*a*c));
			if( disc>=0 ){		
				double answer1 = (-b + Math.sqrt(disc))/(2.0*a);
				double answer2 = (-b - Math.sqrt(disc))/(2.0*a);
				System.out.println("Roots Obtained are: " + answer1+" and "+answer2);
			}
			else{System.out.println("Discriminant is negetive: MATH ERROR");}
		}
	
	}
}