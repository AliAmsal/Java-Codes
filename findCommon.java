public class findCommon{
	public static void main(String [] args){
		int [] array1 = new int[10];
		int [] array2 = new int[10];
		for(int i = 0; i<10;i++){
			array1[i] = (int)(Math.random()*100) + 1;
			array2[i] = (int)(Math.random()*100) + 1;
		}
		System.out.print("Common elements are: ");
		for(int i = 0;i<10;i++){
			for(int j = 0;j<10;j++){
				if(array1[i]==array2[j]){
					System.out.print(array1[i]+" , ");
				}
			}
		}
	
	}
}