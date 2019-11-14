public class Reverse{
	public static void main(String[]args){
		int size = Integer.parseInt(args[0]);
		int [] array1 = new int[size];
		for(int i = 0;i<size;i++){
			array1[i]= (int)(Math.random()*100);
			System.out.println("Array1 Element "+ array1[i]+" on position "+ i );
		}
		System.out.println();
		int [] array2 = new int[size];
		int j = 0;
		for(int i=(size-1);i>=0;i=i-1,j++){
			array2[j] = array1[i];
			System.out.println("Array2 Element "+ array2[j]+" on position "+ j );
		}	
	}
}