public class insertElement{
	public static void main(String[]args){
		int [] array = new int[10];
		int [] array1 = new int[11];
		int number = Integer.parseInt(args[0]);
		int temp = 0;
		int position = 0;
		int min = 100;
		System.out.println("Orignal array: ");
		for(int i = 0; i<10 ;i++){
			array[i] = (int)(Math.random()*100)+1;
			System.out.println(array[i]);
		}
		for(int i = 0; i<10 ;i++){
			for(int j = i; j<10 ;j++){
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
		for(int i = 0; i<10 ;i++){
			System.out.println(array[i]);
		}
		for(int i = 0; i<10 ;i++){
			if(array[i]>number){position = i; break;}
			else{position=10;}
		}
		for(int i = 0; i<position ;i++){
			array1[i] = array[i];
		}
		array1[position]=number;
		for(int i =position; i<array.length ;i++){
			array1[i+1] = array[i];
		}
		System.out.println("Element added in the array: ");
		for(int i = 0; i<11 ;i++){
			System.out.println(array1[i]);
		}
	}
}