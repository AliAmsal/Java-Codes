public class DecToBin{
	public static void main(String[]args){
		int num = Integer.parseInt(args[0]);
		String str = "";
		String bin = ""; 
		do{
			if(num%2==0){bin = "0" ;}
			else{bin = "1" ;}
			num = num/2;
			str = bin + str;	
		}while(num>=1);
		System.out.println(str);
	}
}