public class sortEvenOdd{
	public static void main(String[] args) {
		int count = 0;

//***************************** CREATING ARRAY1 ********************************************

		int [] array1 = new int[Integer.parseInt(args[0])];
		System.out.println("Array 1 Created");
		System.out.println();
		for ( int i=0; i<array1.length; i++,count++){
			array1[i] = Integer.parseInt(args[i+1]);
			System.out.println("Added element "+array1[i] + " to Array1 with position#"+ i);
		}
		System.out.println();

//***************************** CREATING ARRAY2 ********************************************

		count++;
		int [] array2 = new int[Integer.parseInt(args[count])];	
		System.out.println("Array 2 Created");
		System.out.println();	
		for ( int j=0; j<array2.length; j++,count++){
			array2[j] = Integer.parseInt(args[count+1]);
			System.out.println("Added element "+array2[j] + " to Array2 with position#"+ j);
		}
		System.out.println();


//***************************** Finding Common Elements********************************************

		System.out.print("Common elements are: ");
		for(int i = 0; i<array1.length;i++){
			for(int j = 0; j<array2.length; j++){
				if(array1[i]==array2[j]){
					System.out.print(array2[j]+", ");
				}
			}
		}
	}
}



