public class CheckVowel {	
	public static void main(String[]args) {
		String a = (args[0]);
		char b = a.charAt(0);
		if (b=='A' || b=='a' || b=='E' || b=='e' ||b=='I'||b=='i'||b=='O'||b=='o'||b=='U' ||b=='u'){
		System.out.println(b + " is a Vowel");
		}
		else{
		System.out.println(b + " is a not a Vowel");
		}
		
	}
}