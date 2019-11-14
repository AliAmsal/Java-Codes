public class selectionSort{
	public static void main(String [] args){
		int [] array1 = new int[10];
		int [] array2 = new int[11];
		int element = Integer.parseInt(args[0]);
		int position = Integer.parseInt(args[1]);
		for(int i = 0; i<10;i++){
			array1[i] = (int)(Math.random()*100) + 1;
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		boolean found = false;
		int count = 0;
		while(found==false){
			array2[count]=array1[count];
			if(position==count){found = true;
				array2[count]=element;}
			count++;
		}
		for(int i = count-1; i<10; i++){
			array2[i+1]=array1[i];
		}
		for(int i = 0; i<11;i++){
			
			System.out.print(array2[i]+" ");
		}	
	}
}