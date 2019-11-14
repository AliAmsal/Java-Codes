public class Cards{
	public static void main(String[]args){
		String[] SUITS = {"spades","clubs","hearts","diamonds"};
		String[] RANKS = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};

		//**********************************************ARRANGING IN THE ORDER OF RANKS******************************************
		String[] DECK1 = new String[52];
		int count = 0;
		for(int i = 0;i<SUITS.length;i++){
			for(int j = 0 ;j<RANKS.length;j++,count++){
				DECK1[count] = RANKS[j] +" of "+ SUITS[i];
				System.out.println(DECK1[count]);
			}
			System.out.println();			
		}
		//**********************************************ARRANGING IN THE ORDER OF SUITS******************************************
		String[] DECK2 = new String[52];
		count = 0;
		for(int i = 0;i<RANKS.length;i++){
			for(int j = 0 ;j<SUITS.length;j++,count++){
				DECK2[count] = RANKS[i] +" of "+ SUITS[j];
				System.out.println(DECK2[count]);
			}
			System.out.println();			
		}
		//**********************************************SHUFFLING******************************************
		String temp = "0";
		int d1 = 0;
		int d2 = 0;
		for(int shuffle = 0; shuffle<10; shuffle++){
			d1 =  (int)(Math.random()*DECK1.length);
			d2 =  (int)(Math.random()*DECK1.length);
			temp = DECK1[d2];
			DECK1[d2] = DECK1[d1];
			DECK1[d1] = temp ;	
		}
		for(int c = 0; c<DECK1.length;c++){
			System.out.println(DECK1[c]);
		}
	}
}