/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycount;

import edu.princeton.cs.introcs.StdOut;

/**
 *
 * @author 18660
 */
public class ArrayCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] Array = new int [20];
        for(int i = 0; i<20; i++){
            Array[i] = (int)(Math.random()*50) + 1;
            StdOut.print(Array[i]+" ," );
        }
        StdOut.println();
        int count = 0;
        for(int i=0; i<20;i++){
            
            for(int j=i; j<20;j++){
                count = 1;
                if((Array[i]==Array[j])&& (j!=i)){
                    count++;
                }   
            }
            if(count>1){
                StdOut.println(Array[i]+ " occured "+ count +" times" );     
            }
     
        }
    }
    
}
