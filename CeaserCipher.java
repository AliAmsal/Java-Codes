public class CeaserCipher{
	public static void main(String[] args){
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String name = args[0];
		System.out.println("Text entered: "+ name);
		int mode = Integer.parseInt(args[2]);
		if(mode==0){System.out.println("Mode Selected: Encryption");}
		if(mode==1){System.out.println("Mode Selected: Decryption");}
		int shift = Integer.parseInt(args[1]);
		System.out.println("cipher shift: "+ shift);
		int size = name.length();
		char [] namearray = new char[size];
		System.out.println("Original Text: ");
		for (int i = 0; i<size;i++){
			namearray[i] = name.charAt(i);
			System.out.print(namearray[i] + " ");
		}
		System.out.println();
		if(mode==0){
			System.out.println("Text converted to cipher: ");
			char []encryptArray = new char[size];
			for(int i = 0; i<namearray.length; i++){
				for(int j = 0; j<alpha.length();j++){
					if(namearray[i]==alpha.charAt(j)){
						encryptArray[i]=alpha.charAt(j+shift);
						break;
					} 
				}
				System.out.print(encryptArray[i] + " ");
			}	
		}
		System.out.println();
		if(mode==1){
			System.out.println("Cipher converted to Text: ");
			char []decryptArray = new char[size];
			for(int i = 0; i<namearray.length; i++){
				for(int j = 25; j<alpha.length();j++){
					if(namearray[i]==alpha.charAt(j)){
						decryptArray[i]=alpha.charAt(j-shift);
						break;
					}
				}
				System.out.print(decryptArray[i] + " ");
			}
		}
		System.out.println();																				
	}	
}