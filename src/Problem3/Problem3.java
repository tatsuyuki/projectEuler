/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mike
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Input Number: ");
        long pN = reader.nextLong();
        
        ArrayList<Long> factor = new ArrayList<Long>();
        ArrayList<Long> primeFactor = new ArrayList<Long>();
        
        for (long i = 2; i < pN; i++) {
            if(pN % i == 0) {
                factor.add(i);
            }
            
    }
        for (long j : factor) {
            int count = 0;
            for (long k = 2; k < j; k++) {
                if(j % k == 0){
                    count++;
                }
            }
            if(count <= 1){
                primeFactor.add(j);
            }
                
            }
        
        System.out.println(primeFactor);
        }
    
    
            
    
}
