public class deleteElement{
	public static void main(String[]args){
		int [] array = new int[20];
		int [] array1 = new int[19];
		int number = Integer.parseInt(args[0]);
		int temp = 0;
		int position = 0;
		int min = 100;
		boolean found = false;
		System.out.println("Orignal array: ");
		for(int i = 0; i<20 ;i++){
			array[i] = (int)(Math.random()*100)+1;
			System.out.println(array[i]);
		}
		for(int i = 0; i<20 ;i++){
			for(int j = i; j<20 ;j++){
				if(array[j]<min){
					min = array[j];
					position = j;
				}
			}
			temp = array[position];
			array[position] = array[i];
			array[i]=temp;
			min=100; 
		}
		System.out.println("Sorted array: ");
		for(int i = 0; i<20 ;i++){
			System.out.println(array[i]);
		}
		//deleting element from array
		for(int i=0; i<20;i++){
			if(number==array[i]){
				found=true;
				position=i;
				break;
			}
		}
		if(found){
			for(int i=0; i<position;i++){
				array1[i]=array[i];
			}
			array1[position]=array[position+1];
			for(int i=(position+1); i<19;i++){
				array1[i]=array[i+1];
			}
		}
		else{System.out.println("Element Entered Not found");}
		System.out.println("Element found and deleted: ");
		for(int i = 0; i<19 ;i++){
			System.out.println(array1[i]);
		}
	}
}