public class countVowels{
	public static void main(String[]args){
		int size = Integer.parseInt(args[0]);
		char [] array = new char[size];
		String ABCD = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int position = 0;
		for(int i = 0;i<size;i++){
			position = (int)(Math.random()*26);
			array[i] = ABCD.charAt(position);
			System.out.println("Array Element "+ array[i]+" on position "+ i );
		}
		System.out.println();
		int a=0,e=0,i=0,o=0,u=0;		
		for(int j=0;j<size;j++){
			switch(array[j]){
				case 'A': a++;break;
				case 'E': e++;break;
				case 'I': i++;break;
				case 'O': o++;break;
				case 'U': u++;break;
			}		
		}
		System.out.println("A occoured "+ a +" times.");
		System.out.println("E occoured "+ e +" times.");
		System.out.println("I occoured "+ i +" times.");
		System.out.println("O occoured "+ o +" times.");
		System.out.println("U occoured "+ u +" times.");
			
	}
}