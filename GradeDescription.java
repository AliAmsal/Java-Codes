public class GradeDescription{
	public static void main(String[]args){
		char grade = args[0].charAt(0);
		switch(grade)
		{

			case 'e' :
			case 'E' : System.out.println("Excellent"); break;
			case 'v' :
			case 'V' : System.out.println("Very Good"); break;
			case 'g' :
			case 'G' : System.out.println("Good"); break;
			case 'a' :
			case 'A' : System.out.println("Average"); break;
			case 'f' :
			case 'F' : System.out.println("Fail"); break;
			default  : System.out.println("INVALID INPUT");

		}
		
		
	}
}