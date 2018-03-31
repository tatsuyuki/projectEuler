/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;
import java.util.ArrayList;

/**
 *
 * @author mike
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
         }
        
        for(Integer i : multiples) {
            sum = sum +i;
        }
        
        System.out.println(sum);
        
    }
    
}
