public class MinAndMax{
	public static void main(String[]args){
		int size = Integer.parseInt(args[0]);
		int max = 0;
		int min = 101;
		int [] array = new int[size];
		for(int i = 0;i<size;i++){
			array[i]= (int)(Math.random()*100);
			System.out.println("Array Element "+ array[i]+" on position "+ i );
		}
		for(int j = 0; j<size;j++){
			if(array[j]>max){
				max = array[j];
			}
			if(array[j]<min){
				min = array[j];
			}
			
		} 
		System.out.println("Maximum number from the array is "+ max);
		System.out.println("Minimum number from the array is "+ min);
	}
}