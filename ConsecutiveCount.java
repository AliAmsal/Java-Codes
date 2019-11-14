/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutivecount;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 *
 * @author 18660
 */
public class ConsecutiveCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 1;
        int nextnum = 0;
        int count = 1;
        int hcount = 0;
        int hnum =0;
        StdOut.print("Enter A number");
        num = StdIn.readInt();
        do{
            StdOut.print("Enter A number");  
            nextnum = StdIn.readInt();
            if(num==nextnum){
                count++;
                num = nextnum ;
                if(count>=hcount){
                    hcount=count;
                    hnum=num;
                }
                StdOut.println(count);
            }
            else{
                count =1;
            }
            num = nextnum ;
        }while(nextnum!=0);
        StdOut.println("Max count is "+ hcount);
        StdOut.println("Repetative number is "+ hnum);
        
    }
    
}
