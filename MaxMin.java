/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 *
 * @author 18660
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        int max = (int)Double.NEGATIVE_INFINITY;
        int min = (int)Double.POSITIVE_INFINITY;
        
            do{
                StdOut.print("Enter A number");
                num = StdIn.readInt();
                if(num>0){
                    if(num>max)max=num;
                    if(num<min)min=num;
                }
                if(num<0)StdOut.println("Enter A positive number");
            }while(num!=0);
        StdOut.println("Max number is "+ max);
        StdOut.println("Min number is "+ min);
    }
        
}
        
    

