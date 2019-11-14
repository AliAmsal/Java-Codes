public class Hurricane
{	public static void main(String[]args)
	{	
		int hur = Integer.parseInt(args[0]);
		if (hur<74)
		{ System.out.println("This Is not a Hurricane");}
		else{	if(hur>=74 && hur<96){System.out.println("This Hurricane is from Category 1");}
			else{	if(hur>=96 && hur<111){System.out.println("This Hurricane is from Category 2");}
				else{	if(hur>=111 && hur<131){System.out.println("This Hurricane is from Category 3");}
					else{	if(hur>=131 && hur<155){System.out.println("This Hurricane is from Category 4");}
						else{System.out.println("This Hurricane is from Category 5");}
			
					}
				}
			}
		}


	}
}