public class  EuclideanDistance{
	public static void main(String[]args){
		double sum = 0.0;
		int sq = 0;
		int diff = 0;
		int num = Integer.parseInt(args[0]);
		int [] Arr1 = new int[num];
		int [] Arr2 = new int[num];
	//***************Random Generating 2 Arrays *********************
		for(int i = 0 ; i< num; i++){
			Arr1[i]=(int)(Math.random()*100)+1;
			Arr2[i]=(int)(Math.random()*100)+1;
			System.out.println("i="+ i + "  Array1: "+ Arr1[i]+"    Array2: "+ Arr2[i]);
		}
	//*************** Calculation *********************
		for(int j = 0; j< num; j++){
			diff = Arr1[j]-Arr2[j];
			sq = diff*diff;
			sum = sum + (double)sq; 
		}
		double Ans = Math.sqrt(sum);
		System.out.println();
		System.out.println("Euclidean distance is :"+Ans);
	}
}