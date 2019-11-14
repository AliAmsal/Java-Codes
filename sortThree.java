public class sortThree {
	public static void main(String[]args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int temp = 0;
		int max = 0;
		int mid = 0;
		int min = 10000000;
		if (a>b && a>c){
		max = a;		
		}
		if (b>a && b>c){
		max = b;		
		}
		if (c>a && c>b){
		max = c;		
		}
		if (a<b && a<c){
		min = a;		
		}
		if (b<a && b<c){
		min = b;		
		}
		if (c<a && c<b){
		min = c;		
		}
		if(max>a && min<a){
		mid = a;
		}
		if(max>b && min<b){
		mid = b;
		}
		if(max>c && min<c){
		mid = c;
		}
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);

			
		
		
	}
}